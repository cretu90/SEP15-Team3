/**
 * 
 */
package de.ofCourse.system;

/**
 * @author blacky
 *
 */
public interface Transaction {
    
    /**
     * 
     */
    public Connection conn = null;
    
    /**
     * 
     */
    public void start();
    
    public void commit();
    
    public void rollback();

}
