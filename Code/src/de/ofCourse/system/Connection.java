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
    public Connection conn = null;

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    @Override
    public void start() {
        getConnection();
        
    }

    @Override
    public void commit() {
        java.sql.Connection sqlConn = (java.sql.Connection) conn;
        try {
            sqlConn.commit();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            releaseConnection(); 
        }
        releaseConnection();              
    }

    @Override
    public void rollback() {
        java.sql.Connection sqlConn = (java.sql.Connection) conn;
        try {
            sqlConn.rollback();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            releaseConnection(); 
        }
        releaseConnection();    
    }
    
    /**
     * Gets a connection from the DatabaseConnectionManager and stores it.
     */
    public void getConnection(){
        conn  = (Connection) DatabaseConnectionManager.getInstance().getConnection();
    }
    
    /**
     * Release the stored connection back to the DatabaseConnectionManager
     */
    public void releaseConnection(){
        java.sql.Connection sqlConn = (java.sql.Connection) conn;
        DatabaseConnectionManager.getInstance().releaseConnection(sqlConn);
        conn = null;
    }

  
    

}
