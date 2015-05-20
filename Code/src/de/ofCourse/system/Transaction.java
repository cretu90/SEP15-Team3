/**
 * This package represents system functionality. 
 */
package de.ofCourse.system;

/**
 * handles the transaction management to prevent any mistakes with the database communication.
 * @author Sebastian
 */
public interface Transaction {
    
    /**
     * stores a instance of the wrapper class Connection
     */
    public Connection conn = null;
    
    /**
     * starts a new transaction
     */
    public void start();
    
    /**
     * Makes all changes made since the previous commit/rollback permanent and releases any database locks
     */
    public void commit(); 
    /**
     * Undoes all changes made in the current transaction and releases any database locks.
     */
    public void rollback();

}
