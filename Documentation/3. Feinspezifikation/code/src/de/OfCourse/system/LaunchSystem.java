/**
 * This package represents system functionality.
 */
package de.ofCourse.system;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * Starts the system ofCourse and sets up all necessary services, intitalizes
 * the database connection and prepares the database for the system.
 * 
 * <p>
 * It initializes the maintenance thread, the DatabaseConnectionManager that is
 * responsible for setting up and managing the database connections.
 * Furthermore the class sets up the required tables in the database and creates
 * an initial administrator to access the system.<br>
 * In addition it provides the functionality of a regulated shutdown of the
 * application. That includes stopping the maintenance and and shutting down
 * database connection.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@ApplicationScoped
public class LaunchSystem {

    /**
     * Initializes the maintenance thread method of the Maintenance class.<br>
     * Furthermore, this method loads the needed database and mail server
     * properties if the application is started and it creates the
     * DatabaseConnectionManger that sets up the database connections. In
     * addition it creates the necessary tables and an initial admin.
     */
    @PostConstruct
    public void startSystem() {
    }

    /**
     * Terminates the maintenance thread.
     */
    @PreDestroy
    public void shutdownMaintenance() {
    }
}
