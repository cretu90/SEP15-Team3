/**
 * This package contains classes required at the launch of the system
 */
package de.ofCourse.Database.DatabaseGeneral;

import de.ofCourse.exception.InvalidDBTransferException;

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
	
    /**
     * Checks whether or not the required tables in the database have been
     * initialized. If not, the necessary SQL statements are executed in order
     * to create and initialize the tables in the database.
     * 
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void buildUpDatabase() throws InvalidDBTransferException {
    }
}
