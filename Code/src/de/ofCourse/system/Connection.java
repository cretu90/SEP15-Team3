/**
 * This package represents system functionality. 
 */
package de.ofCourse.system;

/**
 * Hides the kind of connection and provides safety. <p>
 * 
 * Recives a sql Connection from the DatabaseConnectionManager and wrappes it to a common Connection 
 * type to hide information and secures the Systemarchitecture. <p>This class implements the Interface
 * <code>Transaction</code>.
 * @author Sebastian
 */
public class Connection implements Transaction {
    
    /**
     * stores the connection from the DatabaseConnectionManager
     */
    public java.sql.Connection conn;

    @Override
    public void start() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void commit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void rollback() {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * Gets a connection from the DatabaseConnectionManager and stores it.
     */
    public void getConnection(){
        conn  = DatabaseConnectionManager.getInstance().getConnection();
    }
    
    /**
     * Release the stored connection back to the DatabaseConnectionManager
     */
    public void releaseConnection(){
        
    }
    

}
