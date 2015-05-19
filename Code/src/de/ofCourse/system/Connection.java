/**
 * 
 */
package de.ofCourse.system;

/**
 * @author blacky
 *
 */
public class Connection implements Transaction {
    
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
    
    public void getConnection(){
        conn  = DatabaseConnectionManager.getInstance().getConnection();
    }
    
    public void releaseConnection(){
        
    }
    

}
