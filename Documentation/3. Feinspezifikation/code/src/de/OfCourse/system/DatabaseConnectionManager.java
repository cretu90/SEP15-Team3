/**
 * 
 */
package de.OfCourse.system;

import java.sql.Connection;

/**
 * @author
 *
 */
public class DatabaseConnectionManager {

    /**
     * @return
     */
    public synchronized Connection getConnection() {
	return null;
    }

    /**
     * 
     */
    public synchronized void releaseConnection() {
    }

    /**
     * @return
     */
    public static DatabaseConnectionManager getInstance() {
	return null;
    }

    /**
     * 
     */
    public void shutDown() {
    }

}
