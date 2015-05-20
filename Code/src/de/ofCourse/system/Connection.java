/**
 * This package represents system functionality. 
 */
package de.ofCourse.system;

/**
 * hides the kind of connection and provides safety.
 * 
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
     * gets a connection from the DatabaseConnectionManager and stores it.
     */
    public void getConnection(){
        conn  = DatabaseConnectionManager.getInstance().getConnection();
    }
    
    /**
     * release the stored connection to the DatabaseConnectionManager
     */
    public void releaseConnection(){
        
    }
    

}
