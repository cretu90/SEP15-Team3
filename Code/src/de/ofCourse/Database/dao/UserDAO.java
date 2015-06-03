/**
 * This package represents the Data Access Objects of the ofCourse system.
 */
package de.ofCourse.Database.dao;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.model.Address;
import de.ofCourse.model.Course;
import de.ofCourse.model.PaginationData;
import de.ofCourse.model.Salutation;
import de.ofCourse.model.User;
import de.ofCourse.model.UserRole;
import de.ofCourse.model.UserStatus;
import de.ofCourse.system.Connection;
import de.ofCourse.system.LogHandler;
import de.ofCourse.system.Transaction;
import de.ofCourse.utilities.PasswordHash;

/**
 * Provides methods for transactions with the users stored in the database such
 * as creating, retrieving, updating or deleting users. Also retrieves a course
 * leader's list of courses.
 * 
 * <p>
 * Each method has a Transaction parameter, which contains the SQL connection
 * to the database, in order to assure that multiple, consecutive method calls
 * within a certain method use the same connection.
 * </p>
 * 
 * <p>
 * This class is required in the business logic of the system, more precisely
 * in the ManagedBeans of the package <code>de.ofCourse.action</code>.
 * </p>
 * 
 * @author Patrick Cretu
 *
 */
public class UserDAO {

    /**
     * Checks if the inserted mail address already exists in the database.
     * 
     * @param trans
     * 		  the Transaction object which contains the connection to the
     *            database
     * @param email
     * 		  inserted e-mail
     * @return true if the mail address already exists in the system, else 
     * 	       return false
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static boolean emailExists(Transaction trans, String email)
		throws InvalidDBTransferException {
	boolean exists = false;
	
	//SQL- Abfrage vorbereiten und Connection zur Datenbank erstellen.
	PreparedStatement pS = null;
	Connection connection = (Connection) trans;
	java.sql.Connection conn = connection.getConn();
	
	String sql = "SELECT id FROM \"users\" WHERE email=?";
	//m�gliche SQL-Injektion abfangen
	try {
	    pS = conn.prepareStatement(sql);	    
	    pS.setString(1, email);
	    
	    //preparedStatement ausf�hren, gibt resultSet als Liste zur�ck (hier
	    //ein Eintrag in der Liste, da Benutzername einzigartig).
	    ResultSet res = pS.executeQuery();
	    
	    //N�chten Eintrag aufrufen, gibt true zur�ck, falls es weiteren 
	    //Eintrag gibt, ansonsten null.
	    if(res.next()) {
		exists = true;
	    } else {
		exists = false;
	    }

	} catch (SQLException e) {
	    LogHandler.getInstance().error("SQL Exception occoured during executing emailExists(Transaction trans, String email)");
	    throw new InvalidDBTransferException();
	    
	} 
	return exists;
    }
    
    /**
     * Adds a new user to the list of users in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
     *            database
     * @param user
     *            the user to be added
     * @param pwHash
     * 		  the hashed password
     * @return the created id of the user
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static String createUser(Transaction trans, User user, String pwHash)
    		throws InvalidDBTransferException {
	
	String veriString = "";
	
	//SQL- INSERT vorbereiten und Connection zur Datenbank erstellen.
	PreparedStatement pS = null;
	Connection connection = (Connection) trans;
	java.sql.Connection conn = connection.getConn();
	
	//m�gliche SQL-Injektion abfangen
	try {
	    ResultSet res = null;
	    
	    String sql = "SELECT id FROM \"users\" WHERE veri_string = ?";
	    do {
		SecureRandom random = new SecureRandom();
		veriString = new BigInteger(130, random).toString();
		pS = conn.prepareStatement(sql);
		pS.setString(1, veriString);
		res = pS.executeQuery();
	    } while(res.next());
	    
	    sql = "Insert into \"users\" (first_name, name, nickname, email, "
			+ "pw_hash, date_of_birth, form_of_address, credit_balance, "
			+ "email_verification, admin_verfication, role, status, veri_string)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
	    // PreparedStatement bef�llen, bei optionalen Feldern �berpr�fen,
	    // ob der Benutzer die Daten angegeben hat oder ob in die 
	    // Datenbank null-Werte geschrieben werden m�ssen.
	    pS = conn.prepareStatement(sql);	    
	    if(user.getFirstname() == null || user.getFirstname().length() < 1) {
		pS.setString(1, null);
	    } else {
		pS.setString(1, user.getFirstname());
	    }
	    if(user.getLastname() == null || user.getLastname().length() < 1) {
		pS.setString(2, null);
	    } else {
		pS.setString(2, user.getLastname());
	    }
	    pS.setString(3, user.getUsername());
	    pS.setString(4, user.getEmail());
	    pS.setString(5, pwHash);
	    if(user.getDateOfBirth() == null) {
		pS.setDate(6, null);
	    } else {
		pS.setDate(6, (Date) user.getDateOfBirth());
	    }
	    if(user.getSalutation() == null) {
		pS.setString(7, null);
	    } else {
		pS.setString(7, user.getSalutation().toString());
	    }
	    pS.setDouble(8, user.getAccountBalance());
	    pS.setBoolean(9, false);
	    pS.setBoolean(10, false);
	    pS.setString(11, UserRole.REGISTERED_USER.toString());
	    pS.setString(12, UserStatus.NOT_ACTIVATED.toString());
	    pS.setString(13, veriString);
	    
	    pS.executeUpdate();	   
	    
	} catch (SQLException e) {
	    LogHandler.getInstance().error("SQL Exception occoured during executing createUser(Transaction trans, User user, String pwHash)");
	    throw new InvalidDBTransferException();
	    
	} 
	
	return veriString;
    }

    /**
     * Returns a list containing all users stored in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param pagination
     *            the Pagination object which contains the amount of elements
     *            which are to be retrieved
     * @return the list of users, or null if no users were retrieved
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<User> getUsers(Transaction trans,
    		PaginationData pagination) throws InvalidDBTransferException {
	return null;
    }

    /**
     * Returns a list of users which names contain the search term the user has
     * entered.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param pagination
     *            the Pagination object which contains the amount of elements
     *            which are to be retrieved
     * @param searchString
     *            the user's search term
     * @return the list of users, or null if no users were retrieved
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<User> getUsers(Transaction trans,
    		PaginationData pagination,String searchParam, String searchString)
    				throws InvalidDBTransferException {
	return null;
    }

    /**
     * Returns a list of users which titles contain the search term the user
     * has entered. The list is ordered by the passed parameter.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param pagination
     *            the Pagination object which contains the amount of elements
     *            which are to be retrieved
     * @param searchString
     *            the user's search term
     * @param orderParam
     *            the parameter the list is to be ordered by
     * @return the list of users ordered by the passed parameter, or null if no
     * users were retrieved
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<User> getUsersOrdered(Transaction trans,
    		PaginationData pagination,String searchParam, String searchString, String orderParam)
	    throws InvalidDBTransferException {
	return null;
    }

    
    
    /**
     * Returns a user assigned to the specified ID.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the user's ID
     * @return the user assigned to the user ID, or null if no such user was
     * found
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static User getUser(Transaction trans, int userID)
    		throws InvalidDBTransferException {
	
	return null;
    }
    
    /**
     * Returns the status of the user to a specified ID
     * 
     * @param trans 
     * 		the Transaction object which contains the connection to the
     *          database
     * @param userID
     * 		the user's ID
     * @return the status of the user
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static UserStatus getUserStatus(Transaction trans, int userID)
		throws InvalidDBTransferException {
	
	UserStatus userStatus = null;
	
	//SQL- Abfrage vorbereiten und Connection zur Datenbank erstellen.
	PreparedStatement pS = null;
	Connection connection = (Connection) trans;
	java.sql.Connection conn = connection.getConn();
	
	String sql = "SELECT status FROM \"users\" WHERE id=?";
	//m�gliche SQL-Injektion abfangen
	try {
	    pS = conn.prepareStatement(sql);	    
	    pS.setInt(1, userID);
	    
	    //preparedStatement ausf�hren, gibt resultSet als Liste zur�ck (hier
	    //ein Eintrag in der Liste, da Benutzername einzigartig).
	    ResultSet res = pS.executeQuery();
	    
	    //N�chten Eintrag aufrufen, gibt true zur�ck, falls es weiteren 
	    //Eintrag gibt, ansonsten null.
	    if(res.next()) {
		String userStatusString = res.getString("status");
		switch(userStatusString) {
		case "ANONYMOUS":
		    userStatus = UserStatus.ANONYMOUS;
		case "NOT_ACTIVATED":
		    userStatus = UserStatus.NOT_ACTIVATED;
		case "REGISTERED":
		    userStatus = UserStatus.REGISTERED;
		case "INACTIVE":
		    userStatus = UserStatus.INACTIVE;
		default:
		}
	    } else {
		userStatus = null;
	    }

	} catch (SQLException e) {
	    LogHandler.getInstance().error("SQL Exception occoured during executing getUserStatus(Transaction trans, int userID)");
	    throw new InvalidDBTransferException();
	    
	} 
	return userStatus;
    }    
    
    /**
     * Returns the role of the user to a specified ID
     * 
     * @param trans
     * 		the Transaction object which contains the connection to the
     *          database
     * @param userID
     * 		the user's ID
     * @return the role of the user
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static UserRole getUserRole(Transaction trans, int userID)
    		throws InvalidDBTransferException {
	UserRole userRole = null;
	
	//SQL- Abfrage vorbereiten und Connection zur Datenbank erstellen.
	PreparedStatement pS = null;
	Connection connection = (Connection) trans;
	java.sql.Connection conn = connection.getConn();
	
	String sql = "SELECT role FROM \"users\" WHERE id=?";
	//m�gliche SQL-Injektion abfangen
	try {
	    pS = conn.prepareStatement(sql);	    
	    pS.setInt(1, userID);
	    
	    //preparedStatement ausf�hren, gibt resultSet als Liste zur�ck (hier
	    //ein Eintrag in der Liste, da Benutzername einzigartig).
	    ResultSet res = pS.executeQuery();
	    
	    //N�chten Eintrag aufrufen, gibt true zur�ck, falls es weiteren 
	    //Eintrag gibt, ansonsten null.
	    if(res.next()) {
		String userRoleString = res.getString("role");
		switch(userRoleString) {
		case "REGISTERED_USER":
		    userRole = UserRole.REGISTERED_USER;
		case "COURSE_LEADER":
		    userRole = UserRole.COURSE_LEADER;
		case "SYSTEM_ADMINISTRATOR":
		    userRole = UserRole.SYSTEM_ADMINISTRATOR;
		default:
		}
	    } else {
		userRole = null;
	    }

	} catch (SQLException e) {
	    LogHandler.getInstance().error("SQL Exception occoured during executing getUserRole(Transaction trans, int userID)");
	    throw new InvalidDBTransferException();
	    
	} 
	return userRole;
    }
    
    public static boolean verifyUser(Transaction trans, String veriString) 
	    throws InvalidDBTransferException{   
	boolean success = false;
	
	PreparedStatement pS = null;
	Connection connection = (Connection) trans;
	java.sql.Connection conn = connection.getConn();
	
	String sql = "Update \"users\" SET email_verification = ?, veriString = ? WHERE veriString=?";
	//m�gliche SQL-Injektion abfangen
	try {
	    pS = conn.prepareStatement(sql);	    
	    pS.setBoolean(1, true);
	    pS.setString(2, null);
	    pS.setString(3, veriString);
	    
	    //preparedStatement ausf�hren, gibt resultSet als Liste zur�ck (hier
	    //ein Eintrag in der Liste, da Benutzername einzigartig).
	    if(pS.executeUpdate() == 1) {
		success = true;
	    } else {
		success = false;
	    }

	} catch (SQLException e) {
	    LogHandler.getInstance().error("SQL Exception occoured during executing proveLogin(Transaction trans, String username, String passwordHash)");
	    throw new InvalidDBTransferException();
	    
	} 
	
	return success;
    }

    /**
     * Returns 0, if username or password is wrong or the inserted user does not 
     * exist in the database. Otherwise returns the id of the user.
     * 
     * 
     * @param trans
     * 		transaction object
     * @param username
     * 		the username inserted by the user
     * @param passwordHash
     * 		the password inserted by the user, which is hashed in the bean
     * @return the id of the user 
     * 		<br>or 0 if the username or password is wrong
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static int proveLogin(Transaction trans, String username, 
	    String passwordHash) throws InvalidDBTransferException{
	
	int id = -1;
	
	//SQL- Abfrage vorbereiten und Connection zur Datenbank erstellen.
	PreparedStatement pS = null;
	Connection connection = (Connection) trans;
	java.sql.Connection conn = connection.getConn();
	
	String sql = "SELECT id, nickname, pw_hash, status FROM \"users\" WHERE nickname=?";
	//m�gliche SQL-Injektion abfangen
	try {
	    pS = conn.prepareStatement(sql);	    
	    pS.setString(1, username);
	    
	    //preparedStatement ausf�hren, gibt resultSet als Liste zur�ck (hier
	    //ein Eintrag in der Liste, da Benutzername einzigartig).
	    ResultSet res = pS.executeQuery();
	    
	    //N�chten Eintrag aufrufen, gibt true zur�ck, falls es weiteren 
	    //Eintrag gibt, ansonsten null.
	    if(res.next()) {
		// Passwort aus dem Resultset abrufen
		String pwHashFromDB = res.getString("pw_hash");
		
		// Gespeichertes Passwort mit dem eingegebenen Passwort vergleichen
		if(passwordHash.equals(pwHashFromDB)) {
		    
		    // �berpr�fen, ob der Benutzer aktiviert ist.
		    if(res.getString("status").equals(UserStatus.REGISTERED.toString())){
			id = res.getInt("id");
		    } else {
			id = -2;
		    }
		} else {
		    id = -1;
		}
	    } else {
		id = -1;
	    }

	} catch (SQLException e) {
	    LogHandler.getInstance().error("SQL Exception occoured during executing proveLogin(Transaction trans, String username, String passwordHash)");
	    throw new InvalidDBTransferException();
	    
	} 
	return id;
    }
    
    
    /**
     * Returns all attributes of a user assigned to the passed user name.
     * 
     * @param trans
     * 		the Transaction object which contains the connection to the
     *          database
     * @param username
     * 		the user's name
     * @return the user
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    
    public static User getUser(Transaction trans, String username)
		throws InvalidDBTransferException {
	
	//Neues Userobjekt erstellen und mit dem Benutzernamen f�llen.  
	//Neues Adressobjekt erstellen.
	User user = new User();
	user.setUsername(username);
	Address address = new Address();
	
	//SQL- Abfrage vorbereiten und Connection zur Datenbank erstellen.
	PreparedStatement pS = null;
	Connection connection = (Connection) trans;
	java.sql.Connection conn = connection.getConn();
	
	//Datenbankabfrage
	String sql = "SELECT * FROM \"users\" WHERE nickname=?";
	
	
	//m�gliche SQL-Injektion abfangen
	try {
	    pS = conn.prepareStatement(sql);	    
	    pS.setString(1, username);
	    
	    //preparedStatement ausf�hren, gibt resultSet als Liste zur�ck (hier
	    //ein Eintrag in der Liste, da Benutzername einzigartig).
	    ResultSet res = pS.executeQuery();
	    
	    //N�chten Eintrag aufrufen, gibt true zur�ck, falls es weiteren 
	    //Eintrag gibt, ansonsten null.
	    if(res.next()) {
		
		//Userobjekt mit Werten aus der Datenbank bef�llen.
		user.setUserId(res.getInt("id"));
        	user.setFirstname(res.getString("first_name"));
        	user.setLastname(res.getString("name"));
        	user.setEmail(res.getString("mail"));
        	user.setDateOfBirth(res.getDate("date_of_bith"));
        	
        	String salutation =res.getString("form_of_adress");
                	switch(salutation){
                	case "mr":
                	    user.setSalutation(Salutation.MR);
                	case "ms":
                	    user.setSalutation(Salutation.MS);
                	default:
                	    //TODO Fehlermeldung n�tig?
                	}
        	
        	user.setProfilImage(res.getString("profile_image"));
        	
        	String userRole = res.getString("role");
        		switch(userRole) {
        		case "registered_user":
        		    user.setUserRole(UserRole.REGISTERED_USER);
        		case "course_instructor":
        		    user.setUserRole(UserRole.COURSE_LEADER);
        		case "administrator":
        		    user.setUserRole(UserRole.SYSTEM_ADMINISTRATOR);
        		default:
        		     //TODO Fehlermeldung n�tig ? 
        		}
        	
        	String userStatus =res.getString("status");
        		switch(userStatus){
        		case "anonymous":
        		    user.setUserStatus(UserStatus.ANONYMOUS);
        		case "not_activated":
        		    user.setUserStatus(UserStatus.NOT_ACTIVATED);
        		case "registered":
        		    user.setUserStatus(UserStatus.REGISTERED);
        		case "inactive":
        		    user.setUserStatus(UserStatus.INACTIVE);
        		default:
        		    //TODO Fehlermeldung n�tig ?
        		}

        	//neue Datenbankabfrage f�r die Adresse des Benutzers
        	sql = "SELECT * FROM addresses WHERE user=?";
        	pS.setInt(1, user.getUserID()); 
        	
        	res = pS.executeQuery();
        	if(res.next()) {
        	    address.setId(res.getInt("id"));
        	    address.setCity(res.getString("city"));
        	    address.setCountry(res.getString("country"));
        	    address.setZipCode(res.getInt("zip_code"));
        	    address.setStreet(res.getString("street"));
        	    address.setHouseNumber(res.getInt("house_nr"));
        	} else {
        	    //Fehler
        	}
        	//dem Userobjekt das Adressobjekt zuweisen
    	    	user.setAddress(address);
	    }
	    else
	    {
		//TODO Fehler, kein Benutzer mit diesem Benutzernamen
		user = null;
	    }

	} catch (SQLException e) {
	    LogHandler.getInstance().error("SQL Exception occoured during executing getUser(Transaction trans, String username)");
	    throw new InvalidDBTransferException();
	    
	} 
	// gibt das bef�llte Userobjekt zur�ck.
	return user;
}
    
    
    /**
     * Returns the ID of a user assigned to the passed user name.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param username
     *            the user's name
     * @return the user's ID
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static int getUserID(Transaction trans, String username)
	    throws InvalidDBTransferException {
	
	//Neues Integer id erstellen.
	int id = -1;
	
	//SQL- Abfrage vorbereiten und Connection zur Datenbank erstellen.
	PreparedStatement pS = null;
	Connection connection = (Connection) trans;
	java.sql.Connection conn = connection.getConn();
	
	//Datenbankabfrage
	String sql = "SELECT id FROM \"users\" WHERE nickname=?";
	
	//m�gliche SQL-Injektion abfangen
	try {
	    pS = conn.prepareStatement(sql);	    
	    pS.setString(1, username);
	    
	    //preparedStatement ausf�hren, gibt resultSet als Liste zur�ck (hier
	    //ein Eintrag in der Liste, da Benutzername einzigartig).
	    ResultSet res = pS.executeQuery();
	    
	   //N�chten Eintrag aufrufen, gibt true zur�ck, falls es weiteren 
	    //Eintrag gibt, ansonsten 0.
	    if(res.next()) {
		//id mit zugeh�rigem Wert aus der Datenbank f�llen.
		id = res.getInt("id");
		
    	    	//TODO Attribute belegen
	    }
	    else
	    {
		//TODO Fehler, kein Benutzer mit diesem Benutzernamen
		id = -1;
	    }

	} catch (SQLException e) {
	    LogHandler.getInstance().error("SQL Exception occoured during executing getUserID(Transaction trans, String username)");
	    throw new InvalidDBTransferException();
	    
	} 
	
	return id;
    }

    /**
     * Updates a user stored in the database. The user's attributes are replaced
     * by the ones of the passed user.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param user
     *            the user to be updated
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void updateUser(Transaction trans, User user, String pwHash)
    		throws InvalidDBTransferException {
        PreparedStatement statement = null;
        Connection connection = (Connection) trans;
        java.sql.Connection conn = connection.getConn();

        String sql = "UPDATE \"users\" "
                + "SET first_name = ?, name = ?, email = ?, pw_hash = ?, "
                + "date_of_birth = ?, form_of_address = ?, nickname = ? "
                + "WHERE id = ?";
        
        try {
            statement = conn.prepareStatement(sql);
            if(user.getFirstname() == null || user.getFirstname().length() < 1) {
                statement.setString(1, null);
            } else {
                statement.setString(1, user.getFirstname());
            }
            if(user.getLastname() == null || user.getLastname().length() < 1) {
                statement.setString(2, null);
            } else {
                statement.setString(2, user.getLastname());
            }
            if(user.getEmail() == null || user.getEmail().length() < 1) {
                statement.setString(3, null);
            } else {
                statement.setString(3, user.getEmail());
            }
            statement.setString(4, pwHash);
            if(user.getDateOfBirth() == null) {
                statement.setDate(5, null);
            } else {
                statement.setDate(5, (Date) user.getDateOfBirth());
            }
            if(user.getSalutation() == null) {
                statement.setString(6, null);
            } else {
                statement.setString(6, user.getSalutation().toString());
            }
            statement.setString(7, user.getUsername());
            statement.setInt(8, user.getUserID());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new InvalidDBTransferException();
            //TODO Logging message
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                /* ignored */
            }
        }
    }

    /**
     * Overrides a user's password.
     * 
     * @param trans the transaction object which contains the database connection
     * @param mail the mail address of the user to be updated
     * @throws InvalidDBTransferException
     */
    public static void overridePassword(Transaction trans, String mail, String password, String salt)
    		throws InvalidDBTransferException {
        PreparedStatement statement = null;
        Connection connection = (Connection) trans;
        java.sql.Connection conn = connection.getConn();

        String sql = "UPDATE \"users\" "
                + "SET pw_hash = ?, salt = ? "
                + "WHERE email = ?";
        
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, password);
            statement.setString(2, salt);
            statement.setString(3, mail);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new InvalidDBTransferException();
            //TODO Logging message
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                /* ignored */
            }
        }
    }

    /**
     * Deletes a user which is assigned to the passed ID.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the ID of the user to be deleted
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void deleteUser(Transaction trans, int userID)
    		throws InvalidDBTransferException {
    }

    /**
     * Returns a list of courses of which the user assigned to the passed ID is
     * leader of.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the course leader's ID
     * @param pagination
     *            the Pagination object which contains the amount of elements
     *            which are to be retrieved
     * @return the list of courses which the user is leader of, or null if
     * the user isn't leader of any course
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<Course> getCoursesLeadedBy(Transaction trans, int userID,
	    PaginationData pagination) throws InvalidDBTransferException {
	return null;
    }
    
    
    public static List<User> getParticipiantsOfCourse(Transaction trans,
		PaginationData pagination, int courseID)
	    throws InvalidDBTransferException {
	return null;
}
    
    public static List<User> getParticipiantsOfCourseUnit(Transaction trans,
		PaginationData pagination, int courseUnitId)
	    throws InvalidDBTransferException {
	return null;
}
}
