package de.ofCourse.Database.DatabaseGeneral;

import java.sql.SQLException;
import java.sql.Statement;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.system.Connection;
import de.ofCourse.system.Transaction;

public class DatabaseTableDestroyer {
	
	private static final String DROP_USERS = "DROP TABLE users";
	private static final String DROP_COURSES = "DROP TABLE courses";
	private static final String DROP_COURSE_UNITS = "DROP TABLE course_units";
	private static final String DROP_ADDRESSES = "DROP TABLE addresses";
	private static final String DROP_CYCLES = "DROP TABLE cycles";
	private static final String DROP_INFORM_USERS = "DROP TABLE inform_users";
	private static final String DROP_COURSE_INSTRUCTORS =
			"DROP TABLE course_instructors";
	private static final String DROP_COURSE_PARTICIPANTS =
			"DROP TABLE course_participants";
	private static final String DROP_COURSE_UNIT_PARTICIPANTS =
			"DROP TABLE course_unit_participants";
	private static final String DROP_SYSTEM_ATTRIBUTES =
			"DROP TABLE system_attributes";
	private static final String DROP_CUSTOMIZATION_DATA =
			"DROP TABLE customization_data";
	
	public static void dropTables() throws InvalidDBTransferException {
		Transaction trans = new Connection();
    	trans.start();
    	Connection connection = (Connection) trans;
    	java.sql.Connection conn = connection.getConn();
    	
    	Statement users = null;
    	Statement courses = null;
    	Statement courseUnits = null;
    	Statement addresses = null;
    	Statement cycles = null;
    	Statement informUsers = null;
    	Statement courseInstructors = null;
    	Statement courseParticipants = null;
    	Statement courseUnitParticipants = null;
    	Statement systemAttributes = null;
    	Statement customizationData = null;
    	
    	try {
			users = conn.createStatement();
			users.execute(DROP_USERS);
			
			courses = conn.createStatement();
			courses.execute(DROP_COURSES);
			
			courseUnits = conn.createStatement();
			courseUnits.execute(DROP_COURSE_UNITS);
			
			addresses = conn.createStatement();
			addresses.execute(DROP_ADDRESSES);
			
			cycles = conn.createStatement();
			cycles.execute(DROP_CYCLES);
			
			informUsers = conn.createStatement();
			informUsers.execute(DROP_INFORM_USERS);
			
			courseInstructors = conn.createStatement();
			courseInstructors.execute(DROP_COURSE_INSTRUCTORS);
			
			courseParticipants = conn.createStatement();
			courseParticipants.execute(DROP_COURSE_PARTICIPANTS);
			
			courseUnitParticipants = conn.createStatement();
			courseUnitParticipants.execute(DROP_COURSE_UNIT_PARTICIPANTS);
			
			systemAttributes = conn.createStatement();
			systemAttributes.execute(DROP_SYSTEM_ATTRIBUTES);
			
			customizationData = conn.createStatement();
			customizationData.execute(DROP_CUSTOMIZATION_DATA);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				users.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courses.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courseUnits.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				addresses.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				cycles.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				informUsers.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courseInstructors.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courseParticipants.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				courseUnitParticipants.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				systemAttributes.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				customizationData.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    	
	}
	
}
