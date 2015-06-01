package de.ofCourse.Database.DatabaseGeneral;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.system.Connection;
import de.ofCourse.system.Transaction;

public class DatabaseTableDestroyer {
	
	public static void dropTables() throws InvalidDBTransferException {
		Transaction trans = new Connection();
    	trans.start();
    	PreparedStatement stmt = null;
    	
    	try {
			stmt = trans.getConn().conn.prepareStatement(dropQuery());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    	
	}

	private static String dropQuery() {
		return "DROP TABLE users;" +
			   "DROP TABLE courses;" +
			   "DROP TABLE course_units;" +
			   "DROP TABLE addresses;" +
			   "DROP TABLE cycles;" +
			   "DROP TABLE inform_users;" +
			   "DROP TABLE course_instructors;" +
			   "DROP TABLE course_participants;" +
			   "DROP TABLE course_unit_participants;" +
			   "DROP TABLE system_attributes;" +
			   "DROP TABLE customization_data";
	}
	
}
