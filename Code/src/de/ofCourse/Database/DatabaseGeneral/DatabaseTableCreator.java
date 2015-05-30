/**
 * This package contains classes required at the launch of the system
 */
package de.ofCourse.Database.DatabaseGeneral;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.system.Connection;
import de.ofCourse.system.Transaction;

/**
 * Checks at the launch of the system if the database tables have been
 * initialized. If not, the tables are created and initialized.
 * 
 * <p>
 * This class is only required in the class
 * <code>de.ofCourse.system.LaunchSystem</code>.
 * </p>
 * 
 * @author Patrick Cretu
 *
 */
public class DatabaseTableCreator {
	
    /**
     * Checks whether or not the required tables in the database have been
     * initialized. If not, the necessary SQL statements are executed in order
     * to create and initialize the tables in the database.
     * 
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void buildUpDatabase() throws InvalidDBTransferException {
    	Transaction trans = new Connection();
    	trans.start();
    	String checkTables = "SELECT COUNT(*) FROM information_schema.tables" +
    			"WHERE table_schema = 'public'";
    	try {
			PreparedStatement stmt = trans.getConn().prepareStatement(checkTables);
			ResultSet count = stmt.executeQuery();
			
			count.next();
			Long check = (Long) count.getObject(1);
			if (check == 0) {
				trans.getConn().prepareStatement(createFormOfAddress()).
				execute();
				trans.getConn().prepareStatement(createRole()).execute();
				trans.getConn().prepareStatement(createStatus()).execute();
				trans.getConn().prepareStatement(createPeriod()).execute();
				trans.getConn().prepareStatement(createActivation()).execute();
				trans.getConn().prepareStatement(createUsers()).execute();
				trans.getConn().prepareStatement(createCourses()).execute();
				trans.getConn().prepareStatement(createCourseUnits()).execute();
				trans.getConn().prepareStatement(createAddresses()).execute();
				trans.getConn().prepareStatement(createCycles()).execute();
				trans.getConn().prepareStatement(createInformUsers()).execute();
				trans.getConn().prepareStatement(createCourseInstructors()).
				execute();
				trans.getConn().prepareStatement(createCourseParticipants()).
				execute();
				trans.getConn().
					prepareStatement(createCourseUnitParticipants()).execute();
				trans.getConn().prepareStatement(createSystemAttributes()).
				execute();
				trans.getConn().prepareStatement(createCustomizationData()).
				execute();
			}
			count.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    private static String createFormOfAddress() {
    	return "CREATE TYPE form_of_address AS ENUM (" +
    				"’mr.’, ’ms.’" +
    			")";
    }
    
    private static String createRole() {
    	return "CREATE TYPE role AS ENUM (" +
    				"’registered_user’, ’course_instructor’, ’administrator’" +
    			")";
    }
    
    private static String createStatus() {
    	return "CREATE TYPE status AS ENUM (" +
    		       "’anonymous’, ’not_activated’, ’registered’, ’inactive’" +
    		   ")";
    }
    
    private static String createPeriod() {
    	return "CREATE TYPE period AS ENUM (" +
    		       "’months’, ’weeks’, ’days’, ’hours’" +
    		   ")";
    }
    
    private static String createActivation() {
    	return "CREATE TYPE activation AS ENUM (" +
    		       "’email’, ’admin’, ’complete’" +
    		   ")";
    }
    
    private static String createUsers() {
    	return "CREATE TABLE users (" +
					"id SERIAL PRIMARY KEY," +
					"first_name VARCHAR(100)," +
					"name VARCHAR(100)," +
					"nickname VARCHAR(100) NOT NULL UNIQUE," +
					"email VARCHAR(319) NOT NULL UNIQUE," +
					"pw_hash VARCHAR(256) NOT NULL," +
					"date_of_birth DATE," +
					"form_of_address FORM_OF_ADDRESS," +
					"credit_balance BOOLEAN NOT NULL," +
					"email_verification BOOLEAN NOT NULL," +
					"admin_verfication BOOLEAN NOT NULL," +
					"profile_image BYTEA," +
					"role ROLE NOT NULL," +
					"status STATUS NOT NULL" +
				");" +
				"ALTER SEQUENCE users_id_seq RESTART WITH 10000";
    }
    
    private static String createCourses() {
    	return "CREATE TABLE courses (" +
    				"id SERIAL PRIMARY KEY," +
    				"titel TEXT(150)," +
    				"max_participants INTEGER CHECK (max_participants > 0)," +
    				"start_date DATE NOT NULL," +
    				"end_date DATE NOT NULL," +
    				"description TEXT(1000)," +
    				"image BYTEA" +
    			");" +
    			"ALTER SEQUENCE courses_id_seq RESTART WITH 10000";
    }
    
    private static String createCourseUnits() {
    	return "CREATE TABLE course_units (" +
    				"id SERIAL PRIMARY KEY," +
    				"course_id REFERENCES courses(id) ON DELETE CASCADE," +
    				"max_participants INTEGER NOT NULL" +
    				"CHECK (max_participants > 0)," +
    				"titel TEXT(150)," +
    				"min_participants INTEGER CHECK (min_participants > 0)," +
    				"fee DECIMAL(6,2) CHECK (fee >= 0)," +
    				"location TEXT(100)," +
    				"start_time TIMESTAMP NOT NULL," +
    				"end_time TIMESTAMP NOT NULL," +
    				"description TEXT(1000)" +
    			")" +
    			"ALTER SEQUENCE course_units_id_seq RESTART WITH 10000";
    }
    
    private static String createAddresses() {
    	return "CREATE TABLE addresses (" +
    				"id SERIAL PRIMARY KEY," +
    				"user REFERENCES users(id) UNIQUE ON DELETE CASCADE," +
    				"course_unit REFERENCES course_units(id) UNIQUE" +
    				"ON DELETE CASCADE," +
    				"country VARCHAR(100) NOT NULL," +
    				"city VARCHAR(100) NOT NULL," +
    				"zip_code VARCHAR(10) NOT NULL," +
    				"street VARCHAR(100), house_nr INTEGER" +
    			")";
    }

    private static String createCycles() {
    	return "CREATE TABLE cycles (" +
    				"id SERIAL PRIMARY KEY," +
    				"course REFERENCES courses(id) UNIQUE ON DELETE CASCADE," +
    				"period PERIOD," +
    				"cycle_end INTEGER NOT NULL" +
    			")";
    }

    private static String createInformUsers() {
    	return "CREATE TABLE inform_users (" +
    				"user REFERENCES users(id) ON DELETE CASCADE," +
    				"course REFERENCES courses(id) ON DELETE CASCADE," +
    				"PRIMARY KEY (user, course)" +
    			")";
    }

    private static String createCourseInstructors() {
    	return "CREATE TABLE course_instructors (" +
    				"course_instructor REFERENCES users(id) ON DELETE CASCADE," +
    				"course REFERENCES courses(id) ON DELETE CASCADE," +
    				"PRIMARY KEY (course_instructor, course)" +
    			")";
    }

    private static String createCourseParticipants() {
    	return "CREATE TABLE course_participants (" +
    		       "participant REFERENCES users(id) ON DELETE CASCADE," +
    		       "course REFERENCES courses(id) ON DELETE CASCADE," +
    		       "PRIMARY KEY (participant, course)" +
    		   ")";
    }

    private static String createCourseUnitParticipants() {
    	return "CREATE TABLE course_unit_participants (" +
    				"participant REFERENCES users(id) ON DELETE CASCADE," +
    				"course_unit REFERENCES course_units(id) ON DELETE CASCADE," +
    				"PRIMARY KEY (participant, course_unit)" +
    			")";
    }

    private static String createSystemAttributes() {
    	return "CREATE TABLE system_attributes (" +
    				"lock CHAR(1) PRIMARY KEY DEFAULT ’X’ CHECK (lock = ’X’)," +
    				"activation_type ACTIVATION NOT NULL," +
    				"withdrawal_hours INTEGER NOT NULL," +
    				"application_hours INTEGER NOT NULL," +
    				"verifiation_key VARCHAR(100) NOT NULL," +
    				"storage_interval INTEGER NOT NULL" +
    			")";
    }

    private static String createCustomizationData() {
    	return "CREATE TABLE customization_data (" +
    				"lock CHAR(1) PRIMARY KEY DEFAULT ’X’ CHECK (lock = ’X’)," +
    				"css VARCHAR(30) NOT NULL," +
    				"title VARCHAR(30) NOT NULL" +
    			")";
    }
    
}
