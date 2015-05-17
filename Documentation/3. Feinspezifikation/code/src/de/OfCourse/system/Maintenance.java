/**
 * This package represents system functionality.
 */
package de.OfCourse.system;

/**
 * Provides the maintenance service of the system which is responsible for
 * deleting courses which are out of date.<br>
 * 
 * <p>
 * The class Maintenance implements the interface <code>Runnable</code>.
 * 
 * @author Tobias Fuchs
 *
 */
public class Maintenance implements Runnable {

    /**
     * Singleton-object of the Maintenace class 
     */
    private static Maintenance maintenance;

    /**
     * Represents whether the maintenance thread is running
     */
    private boolean maintenaceStopped;

    /**
     * Returns <code>true</code> if the maintenance thread is already running.
     * 
     * @return <code>true</code> if the the maintenance thread is running;
     *         <code>false</code> otherwise
     */
    public synchronized boolean isMaintenaceStopped() {
	return maintenaceStopped;
    }

    /**
     * Stops the maintenance thread.
     */
    public synchronized void shutDown() {
    }

    /**
     * Returns an instance of the Maintenace class.
     * 
     * @return instance of the class Maintenance
     */
    public static Maintenance getInstance() {
	return maintenance;
    }

    /**
     * Starts and controls the maintenance thread.<br>
     * Particularly it's used to tell the thread what it should do and how long
     * it should sleep.
     */
    @Override
    public void run() {
	// TODO Auto-generated method stub

    }

}
