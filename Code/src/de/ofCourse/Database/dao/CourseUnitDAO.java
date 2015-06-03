/**
 * This package represents the Data Access Objects of the ofCourse system.
 */
package de.ofCourse.Database.dao;

import java.util.List;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.model.CourseUnit;
import de.ofCourse.model.PaginationData;
import de.ofCourse.system.Transaction;

/**
 * Provides methods for transactions with the course units stored in the
 * database such as creating, retrieving, updating or deleting course units.
 * Also adds or removes users to a course unit.
 * 
 * <p>
 * Each method has a Transaction parameter, which contains the SQL connection
 * to the database, in order to assure that multiple, consecutive method calls
 * within a certain method use the same connection.
 * </p>
 * 
 * <p>
 * This class is required in the business logic of the system, more precisely
 * in the ManagedBeans of the package <code>de.ofCourse.action</code>.
 * </p>
 * 
 * @author Patrick Cretu
 *
 */
public class CourseUnitDAO {

	/**
	 * Adds a course unit to the list of course units in the database. A course
	 * unit contains the course's ID which it is assigned to.
	 * 
	 * @param trans
	 *            the Transaction object which contains the connection to the
	 *            database
	 * @param courseUnit
	 *            the course unit to be added
	 * @param courseID
	 *            the course's ID which the course unit is assigned to
	 * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
	 */
    public static void createCourseUnit(Transaction trans,
    		CourseUnit courseUnit, int courseID)
    				throws InvalidDBTransferException {
    }

    /**
     * Returns a course unit assigned to the specified ID.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param courseUnitID
     *            the course unit's ID
     * @return the course unit assigned to the course ID, or null if no such
     * course unit was found
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static CourseUnit getCourseUnit(Transaction trans, int courseUnitID)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * Returns a list of a course's course units.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param courseID
     *            the course's ID
     * @param pagination
     *            the Pagination object which contains the amount of elements
     *            which are to be retrieved
     * @return the course's list of course units, or null if the course doesn't
     * contain any course units
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<CourseUnit> getCourseUnitsFromCourse(Transaction trans,
    		int courseID, PaginationData pagination)
    				throws InvalidDBTransferException {
	return null;
    }

    /**
     * Updates a course unit stored in the database. The course unit's
     * attributes are replaced by the ones of the passed course unit.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param courseUnit
     *            the course unit to be updated
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void updateCourseUnit(Transaction trans,
    		CourseUnit courseUnit) throws InvalidDBTransferException {
    }

    /**
     * Deletes a course unit which is assigned to the passed ID.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param courseUnitID
     *            the ID of the course unit to be deleted
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void deleteCourseUnit(Transaction trans, int courseUnitID)
	    throws InvalidDBTransferException {
    }

    /**
     * Adds a user to a course unit's list of participants.
     * <p>
     * A tuple of the user's ID and the course unit's ID is added to the table
     * containing course unit participants in the database.
     * </p>
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the user's ID
     * @param courseUnitID
     *            the course unit's ID
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void addUserToCourseUnit(Transaction trans, int userID,
    		int courseUnitID) throws InvalidDBTransferException {
    }

    /**
     * Removes a user from a course unit's list of participants.
     * <p>
     * The tuple of the user's ID and the course unit's ID is removed from the
     * table of course unit participants in the database.
     * </p>
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the user's ID
     * @param courseUnitID
     *            the course unit's ID
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void removeUserFromCourseUnit(Transaction trans, int userID,
    		int courseUnitID) throws InvalidDBTransferException {
    }

    /**
     * Returns a list of course units which the user with the passed ID
     * participates in.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the user's ID
     * @return the list of course units which the user participates in, or null
     * if the user doesn't participate in any course unit
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<CourseUnit> getCourseUnitsOf(Transaction trans,
    		int userID) throws InvalidDBTransferException {
	return null;
    }
}
