/**
 * This package contains classes required at the launch of the system
 */
package de.ofCourse.Database.DatabaseGeneral;

import de.ofCourse.exception.InvalidDBTransferException;

/**
 * Checks at the launch of the system if an administrator has been initially
 * added to the database. If not, a new administrator is created and added to
 * the database.
 * 
 * <p>
 * This class is only required in the class <code>system.LaunchSystem</code>.
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
    }
}
