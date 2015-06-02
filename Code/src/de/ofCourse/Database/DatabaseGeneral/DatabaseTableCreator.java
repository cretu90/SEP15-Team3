/**
 * This package contains classes required at the launch of the system
 */
package de.ofCourse.Database.DatabaseGeneral;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.system.Connection;
import de.ofCourse.system.Transaction;

/**
 * Checks at the launch of the system if the database tables have been
 * initialized. If not, the tables are created and initialized.
 * 
 * <p>
 * This class is only required in the class
 * <code>de.ofCourse.system.LaunchSystem</code>.
 * </p>
 * 
 * @author Patrick Cretu
 *
 */
public class DatabaseTableCreator {
	
	private static final String CREATE_FORM_OF_ADDRESS =
			"CREATE TYPE form_of_address AS ENUM (" +
					"’mr.’, ’ms.’" +
    		")";
    
    private static final String CREATE_ROLE =
    		"CREATE TYPE role AS ENUM (" +
    			"’registered_user’, ’course_instructor’, ’administrator’" +
    		")";
    
    private static final String CREATE_STATUS =
    		"CREATE TYPE status AS ENUM (" +
    			"’anonymous’, ’not_activated’, ’registered’, ’inactive’" +
    		")";
    
    private static final String CREATE_PERIOD =
    		"CREATE TYPE period AS ENUM (" +
    			"’months’, ’weeks’, ’days’, ’hours’" +
    		")";
    
    private static final String CREATE_ACTIVATION =
    		"CREATE TYPE activation AS ENUM (" +
    			"’email’, ’admin’, ’complete’" +
    		")";
    
    private static final String CREATE_USERS =
    		"CREATE TABLE users (" +
				"id SERIAL PRIMARY KEY," +
				"first_name VARCHAR(100)," +
				"name VARCHAR(100)," +
				"nickname VARCHAR(100) NOT NULL UNIQUE," +
				"email VARCHAR(319) NOT NULL UNIQUE," +
				"pw_hash VARCHAR(256) NOT NULL," +
				"date_of_birth DATE," +
				"form_of_address FORM_OF_ADDRESS," +
				"credit_balance BOOLEAN NOT NULL," +
				"email_verification BOOLEAN NOT NULL," +
				"admin_verfication BOOLEAN NOT NULL," +
				"profile_image BYTEA," +
				"role ROLE NOT NULL," +
				"status STATUS NOT NULL" +
			");" +
			"ALTER SEQUENCE users_id_seq RESTART WITH 10000";
    
    private static final String CREATE_COURSES =
    		"CREATE TABLE courses (" +
    			"id SERIAL PRIMARY KEY," +
    			"titel TEXT(150)," +
    			"max_participants INTEGER CHECK (max_participants > 0)," +
    			"start_date DATE NOT NULL," +
    			"end_date DATE NOT NULL," +
    			"description TEXT(1000)," +
    			"image BYTEA" +
    		");" +
    		"ALTER SEQUENCE courses_id_seq RESTART WITH 10000";
    
    private static final String CREATE_COURSE_UNITS =
    		"CREATE TABLE course_units (" +
    			"id SERIAL PRIMARY KEY," +
    			"course_id INTEGER REFERENCES \"courses\"(id) ON DELETE CASCADE," +
    			"max_participants INTEGER NOT NULL" +
    			"CHECK (max_participants > 0)," +
    			"titel TEXT(150)," +
    			"min_participants INTEGER CHECK (min_participants > 0)," +
    			"fee DECIMAL(6,2) CHECK (fee >= 0)," +
    			"location TEXT(100)," +
    			"start_time TIMESTAMP NOT NULL," +
    			"end_time TIMESTAMP NOT NULL," +
    			"description TEXT(1000)" +
    		")" +
    		"ALTER SEQUENCE course_units_id_seq RESTART WITH 10000";
    
    private static final String CREATE_ADDRESSES =
    		"CREATE TABLE addresses (" +
    			"id SERIAL PRIMARY KEY," +
    			"user_id INTEGER REFERENCES \"users\"(id) ON DELETE CASCADE UNIQUE," +
    			"course_unit_id INTEGER REFERENCES \"course_units\"(id) " +
    			"ON DELETE CASCADE UNIQUE," +
    			"country VARCHAR(100) NOT NULL," +
    			"city VARCHAR(100) NOT NULL," +
    			"zip_code VARCHAR(10) NOT NULL," +
    			"street VARCHAR(100), house_nr INTEGER" +
    		")";

    private static final String CREATE_CYCLES =
    		"CREATE TABLE cycles (" +
    			"id SERIAL PRIMARY KEY," +
    			"course_id INTEGER REFERENCES \"courses\"(id) ON DELETE CASCADE UNIQUE," +
    			"period PERIOD," +
    			"cycle_end INTEGER NOT NULL" +
    		")";

    private static final String CREATE_INFORM_USERS =
    		"CREATE TABLE inform_users (" +
    			"user_id INTEGER REFERENCES \"users\"(id) ON DELETE CASCADE," +
    			"course_id INTEGER REFERENCES \"courses\"(id) ON DELETE CASCADE," +
    			"PRIMARY KEY (user, course)" +
    		")";

    private static final String CREATE_COURSE_INSTRUCTORS =
    		"CREATE TABLE course_instructors (" +
    			"course_instructor_id INTEGER REFERENCES \"users\"(id) ON DELETE CASCADE," +
    			"course_id INTEGER REFERENCES \"courses\"(id) ON DELETE CASCADE," +
    			"PRIMARY KEY (course_instructor, course)" +
    		")";

    private static final String CREATE_COURSE_PARTICIPANTS =
    		"CREATE TABLE course_participants (" +
    			"participant_id INTEGER REFERENCES \"users\"(id) ON DELETE CASCADE," +
    			"course_id INTEGER REFERENCES \"courses\"(id) ON DELETE CASCADE," +
    			"PRIMARY KEY (participant, course)" +
    		")";

    private static final String CREATE_COURSE_UNIT_PARTICIPANTS =
    		"CREATE TABLE course_unit_participants (" +
    			"participant_id INTEGER REFERENCES \"users\"(id) ON DELETE CASCADE," +
    			"course_unit_id INTEGER REFERENCES \"course_units\"(id) ON DELETE CASCADE," +
    			"PRIMARY KEY (participant, course_unit)" +
    		")";

    private static final String CREATE_SYSTEM_ATTRIBUTES =
    		"CREATE TABLE system_attributes (" +
    			"lock CHAR(1) PRIMARY KEY DEFAULT ’X’ CHECK (lock = ’X’)," +
    			"activation_type ACTIVATION NOT NULL," +
    			"withdrawal_hours INTEGER NOT NULL," +
    			"application_hours INTEGER NOT NULL," +
    			"verifiation_key VARCHAR(100) NOT NULL," +
    			"storage_interval INTEGER NOT NULL" +
    		")";

    private static final String CREATE_CUSTOMIZATION_DATA =
    		"CREATE TABLE customization_data (" +
    			"lock CHAR(1) PRIMARY KEY DEFAULT ’X’ CHECK (lock = ’X’)," +
    			"css VARCHAR(30) NOT NULL," +
    			"title VARCHAR(30) NOT NULL" +
    		")";
	
    /**
     * Checks whether or not the required tables in the database have been
     * initialized. If not, the necessary SQL statements are executed in order
     * to create and initialize the tables in the database.
     * 
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void buildUpDatabase() throws InvalidDBTransferException{
    	String checkTables = "SELECT COUNT(*) FROM information_schema.tables" +
    			"WHERE table_schema = 'public'";
    	Transaction trans = new Connection();
    	trans.start();
    	Connection connection = (Connection) trans;
    	java.sql.Connection conn = connection.getConn();
    	
    	Statement formOfAddress = null;
    	Statement role = null;
    	Statement status = null;
    	Statement period = null;
    	Statement activation = null;
    	Statement users = null;
    	Statement courses = null;
    	Statement courseUnits = null;
    	Statement addresses = null;
    	Statement cycles = null;
    	Statement informUsers = null;
    	Statement courseInstructors = null;
    	Statement courseParticipants = null;
    	Statement courseUnitParticipants = null;
    	Statement systemAttributes = null;
    	Statement customizationData = null;
    	Statement check = null;
    	ResultSet count = null;
    	try {
			check = conn.createStatement();
			count = check.executeQuery(checkTables);
			
			count.next();
			Long numTables = (Long) count.getObject(1);
			if (numTables == 0) {
				formOfAddress = conn.createStatement();
				formOfAddress.execute(CREATE_FORM_OF_ADDRESS);
				
				role = conn.createStatement();
				role.execute(CREATE_ROLE);
				
				status = conn.createStatement();
				status.execute(CREATE_STATUS);
				
				period = conn.createStatement();
				period.execute(CREATE_PERIOD);
				
				activation = conn.createStatement();
				activation.execute(CREATE_ACTIVATION);
				
				users = conn.createStatement();
				users.execute(CREATE_USERS);
				
				courses = conn.createStatement();
				courses.execute(CREATE_COURSES);
				
				courseUnits = conn.createStatement();
				courseUnits.execute(CREATE_COURSE_UNITS);

				addresses = conn.createStatement();
				addresses.execute(CREATE_ADDRESSES);
				
				cycles = conn.createStatement();
				cycles.execute(CREATE_CYCLES);
				
				informUsers = conn.createStatement();
				informUsers.execute(CREATE_INFORM_USERS);
				
				courseInstructors = conn.createStatement();
				courseInstructors.execute(CREATE_COURSE_INSTRUCTORS);
				
				courseParticipants = conn.createStatement();
				courseParticipants.execute(CREATE_COURSE_PARTICIPANTS);
				
				courseUnitParticipants = conn.createStatement();
				courseUnitParticipants.
					execute(CREATE_COURSE_UNIT_PARTICIPANTS);
				
				systemAttributes = conn.createStatement();
				systemAttributes.execute(CREATE_SYSTEM_ATTRIBUTES);

				customizationData = conn.createStatement();
				customizationData.execute(CREATE_CUSTOMIZATION_DATA);
				
				System.out.println("Erstellen der Datenbank fertig");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				count.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				check.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				formOfAddress.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				role.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				status.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				period.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				activation.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				users.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courses.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courseUnits.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				addresses.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				cycles.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				informUsers.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courseInstructors.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courseParticipants.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courseUnitParticipants.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				systemAttributes.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				customizationData.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
    } 
    
}
