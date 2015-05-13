/**
 * 
 */
package de.OfCourse.system;

/**
 * @author 
 *
 */
public class Maintenance implements Runnable {

    /**
     * @return
     */
    public synchronized boolean isMaintenaceStopped() {
	return false;
    }

    /**
     * 
     */
    public synchronized void shutDown() {
    }

    /**
     * @return
     */
    public static Maintenance getInstance() {
	return null;
    }

    @Override
    public void run() {
	// TODO Auto-generated method stub

    }

}
