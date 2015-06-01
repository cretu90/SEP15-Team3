/**
 * This package represents the Data Access Objects of the ofCourse system.
 */
package de.ofCourse.Database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.system.Transaction;

/**
 * Fetches data concerning the system settings like e.g. the granted overdraft
 * credit from the database and updates this data if it is edited by the
 * administrator.
 * 
 * <p>
 * Each method has a Transaction parameter, which contains the SQL connection to
 * the database, in order to assure that multiple, consecutive method calls
 * within a certain method use the same connection.
 * </p>
 * 
 * <p>
 * This class is required in the business logic of the system, more precisely in
 * the ManagedBeans of the package <code>de.ofCourse.action</code>.
 * </p>
 *
 * @author Tobias Fuchs
 */
public class SystemDAO {

    /**
     * Returns the value of the overdraft credit stored in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
     *            database
     * @return the overdraft credit
     * @throws InvalidDBTransferException
     *             if any error occurred during the execution of the method
     */
    public static int getOverdraftCredit(Transaction trans)
	    throws InvalidDBTransferException {
	return 0;

    }

    /**
     * Updates the value of the overdraft credit in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
     *            database
     * @param credit
     *            the new value of the granted overdraft credit
     * @throws InvalidDBTransferException
     *             if any error occurred during the execution of the method
     */
    public static void setOverdraftCredit(Transaction trans, int credit)
	    throws InvalidDBTransferException {

    }

    /**
     * Returns the current type of activation from the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
     *            database
     * @return type of activation
     * @throws InvalidDBTransferException
     *             if any error occurred during the execution of the method
     */
    public static String getActivationType(Transaction trans)
	    throws InvalidDBTransferException {
	
	
	
		//SQL- Abfrage vorbereiten und Connection zur Datenbank erstellen.
		PreparedStatement pS = null;
		Connection con = (Connection) trans.conn;
		
		//Datenbankabfrage
		String sql = "SELECT activation_type FROM systemAttributes WHERE nickname=?";
	
	return null;

    }

    /**
     * Updates the current type of activation in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
     *            database
     * @param type
     *            type of activation
     * @throws InvalidDBTransferException
     *             if any error occurred during the execution of the method
     */
    public static void setActivationType(Transaction trans, String type)
	    throws InvalidDBTransferException {

    }

    /**
     * Returns the limit in hours until that a user can signOff from a course.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
     *            database
     * @return the sign off limit
     * @throws InvalidDBTransferException
     *             if any error occurred during the execution of the method
     */
    public static int getSignOffLimit(Transaction trans)
	    throws InvalidDBTransferException {
	return 0;

    }

    /**
     * Sets the sign off limit in hours until that a user can signOff from a
     * course.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
     *            database
     * @param limit
     *            the new sign off limit
     * @throws InvalidDBTransferException
     *             if any error occurred during the execution of the method
     */
    public static void setSignOffLimit(Transaction trans, int limit)
	    throws InvalidDBTransferException {

    }

}
