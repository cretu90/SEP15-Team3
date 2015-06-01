/**
 * This package represents system functionality. 
 */
package de.ofCourse.system;

import java.sql.SQLException;

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
    public java.sql.Connection conn = null;

    @Override
    public void start() {
        getConnection();
        
    }

    @Override
    public void commit() throws SQLException {
        try{
            conn.commit();
            releaseConnection();
        } catch (SQLException e) {
            rollback();
            releaseConnection();
        }              
    }

    @Override
    public void rollback() {
        try {
            conn.rollback();
            releaseConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            releaseConnection();
        }    
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
        DatabaseConnectionManager.getInstance().releaseConnection();
        conn = null;
    }
    

}
