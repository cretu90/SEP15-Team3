/**
 *This package represents system functionality. 
 */
package de.OfCourse.system;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * Sets up a fixed number of connections to the database, stores them and
 * handles the assignment of the connections to the requesting threads and in
 * case of occuring errors it exceutes last statements and closes the
 * connections to leave the database in a valid state.
 * 
 * <p>
 * The DatabaseConnectionManager represents the pool, in which the connections
 * are hold. If a thread requests for a connection and there is a free
 * connections, the DatabaseConnectionManager gives it to him. If there's no
 * free connection at the time, the thread has to wait and the
 * DatabaseConnectionManager notifies the waiting thread as soon as there is a
 * free one.
 * 
 * <p>
 * In case of a JVM crash, the DatabaseConnectionManager excetues last
 * statements and closes all connections to the database with the regard to
 * leave the database in a valid state and not to occupy resources.
 * 
 * @author Tobias Fuchs
 *
 */
public class DatabaseConnectionManager {

    /**
     * List of free connections
     */
    private static LinkedList<Connection> freeConnections;

    /**
     * List of used connections
     */
    private static LinkedList<Connection> usedConnections;

    /**
     * Singleton-object of the DatabaseConnectionManager class
     */
    private static DatabaseConnectionManager databaseConnectionManager;

    /**
     * Returns the connection you need for database access.
     * 
     * @return connection for database access
     */
    public synchronized Connection getConnection() {
	return null;
    }

    /**
     * Releases the connection after it has been used.
     */
    public synchronized void releaseConnection() {
    }

    /**
     * Returns an instance of the DatabaseConnectionManager class.
     * 
     * @return instance of the DatabaseConnectionManager
     */
    public static DatabaseConnectionManager getInstance() {
	return databaseConnectionManager;
    }

    /**
     * If the JVM will crash, this method executes last statements and closes
     * all connections.
     */
    public void shutDown() {
    }

}
