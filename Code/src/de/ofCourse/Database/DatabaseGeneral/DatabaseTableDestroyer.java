package de.ofCourse.Database.DatabaseGeneral;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.system.Connection;
import de.ofCourse.system.Transaction;

public class DatabaseTableDestroyer {
	
	public static void dropTables() throws InvalidDBTransferException {
		Transaction trans = new Connection();
    	trans.start();
    	
    	trans.getConn().prepareStatement(dropUsers()).execute();
    	trans.getConn().prepareStatement(dropCourses()).execute();
    	trans.getConn().prepareStatement(dropCourseUnits()).execute();
    	trans.getConn().prepareStatement(dropAddresses()).execute();
    	trans.getConn().prepareStatement(dropCycles()).execute();
    	trans.getConn().prepareStatement(dropInformUsers()).execute();
    	trans.getConn().prepareStatement(dropCourseInstructors()).execute();
    	trans.getConn().prepareStatement(dropCourseParticipants()).execute();
    	trans.getConn().prepareStatement(dropCourseUnitParticipants()).
    	execute();
    	trans.getConn().prepareStatement(dropSystemAttributes()).execute();
    	trans.getConn().prepareStatement(dropCustomizationData()).execute();
	}

	private static String dropUsers() {
		return "DROP TABLE public.users";
	}
	
	private static String dropCourses() {
		return "DROP TABLE public.courses";
	}
	
	private static String dropCourseUnits() {
		return "DROP TABLE public.course_units";
	}
	
	private static String dropAddresses() {
		return "DROP TABLE public.addresses";
	}
	
	private static String dropCycles() {
		return "DROP TABLE public.cycles";
	}
	
	private static String dropInformUsers() {
		return "DROP TABLE public.inform_users";
	}
	
	private static String dropCourseInstructors() {
		return "DROP TABLE public.course_instructors";
	}
	
	private static String dropCourseParticipants() {
		return "DROP TABLE public.course_participants";
	}
	
	private static String dropCourseUnitParticipants() {
		return "DROP TABLE public.course_unit_participants";
	}
	
	private static String dropSystemAttributes() {
		return "DROP TABLE public.system_attributes";
	}
	
	private static String dropCustomizationData() {
		return "DROP TABLE public.customization_data";
	}

}
