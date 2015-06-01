/**
 * This package contains classes required at the launch of the system
 */
package de.ofCourse.Database.DatabaseGeneral;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.system.Connection;
import de.ofCourse.system.Transaction;

/**
 * Checks at the launch of the system if an administrator has been initially
 * added to the database. If not, a new administrator is created and added to
 * the database.
 * 
 * <p>
 * This class is only required in the class
 * <code>de.ofCourse.system.LaunchSystem</code>.
 * </p>
 * 
 * @author Patrick Cretu
 *
 */
public class SetupAdmin {
	
    /**
     * Checks whether or not the table of users in the database contains an
     * administrator. If not, a new administrator is created and added to the
     * table containing users in the database.
     * 
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void createInitialAdmin() throws InvalidDBTransferException {
    	Transaction trans = new Connection();
    	trans.start();
    	String checkAdmin = "SELECT COUNT(*) FROM \"users\"" +
    			"WHERE role = administrator";
    	String initAdmin = "INSERT INTO \"users\"(nickname, email, pw_hash," +
    			"credit_balance, email_verification, admin_verification," +
    			"role, status) VALUES ('admin1', 'bazinga@gmail.com', " +
    			"'5ee2d84rf', 0, TRUE, TRUE, 'administrator', 'registered')";
    	ResultSet rst = null;
    	PreparedStatement check = null;
    	PreparedStatement init = null;
    	
    	try {
    		check = trans.getConn().conn.prepareStatement(checkAdmin);
    		rst = check.executeQuery();
    		rst.next();
    		
    		if ((Long) rst.getObject(1) < 1) {
    			init = trans.getConn().conn.prepareStatement(initAdmin);
			init.execute();
    		}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				check.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				init.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    	
    }
}
