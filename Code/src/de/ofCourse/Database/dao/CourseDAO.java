/**
 * This package represents the Data Access Objects of the ofCourse system.
 */
package de.ofCourse.Database.dao;

import java.util.List;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.model.Course;
import de.ofCourse.model.PaginationData;
import de.ofCourse.model.User;
import de.ofCourse.system.Transaction;

/**
 * Provides methods for transactions with the courses stored in the database
 * such as creating, retrieving, updating or deleting courses. Also adds or
 * removes users and course leaders to a course.
 * 
 * <p>
 * Each method has a Transaction parameter, which contains the SQL connection
 * to the database, in order to assure that multiple, consecutive method calls
 * within a certain method use the same connection.
 * 
 * @author Patrick Cretu
 *
 */
public class CourseDAO {

	/**
	 * Adds a new course to the list of courses in the database.
	 * 
	 * @param trans
	 *            the Transaction object which contains the connection to the
	 *            database
	 * @param course
	 *            the course to be added
	 * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
	 */
    public static void createCourse(Transaction trans, Course course)
	    throws InvalidDBTransferException {
    }

    /**
     * Returns a list of courses which take place on the current date.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param pagination
     *            the Pagination object which contains the amount of elements
     *            which are to be retrieved
     * @return the list of courses, or null if no courses were retrieved
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<Course> getCourses(Transaction trans, PaginationData pagination)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * Returns a list of courses which titles contain the search term the user
     * has entered.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param pagination
     *            the Pagination object which contains the amount of elements
     *            which are to be retrieved
     * @param searchString
     *            the user's search term
     * @return the list of courses, or null if no courses were retrieved
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<Course> getCourses(Transaction trans, PaginationData pagination,
	    String searchString) throws InvalidDBTransferException {
	return null;
    }

    /**
     * Returns a list of courses which titles contain the search term the user
     * has entered. The list is ordered by the passed parameter.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param pagination
     *            the Pagination object which contains the amount of elements
     *            which are to be retrieved
     * @param searchString
     *            the user's search term
     * @param orderParam
     *            the parameter the list is to be ordered by
     * @return the list of courses ordered by the passed parameter, or null if
     * no courses were retrieved
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<Course> getCoursesOrdered(Transaction trans, PaginationData pagination,
	    String searchString, String orderParam)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * Returns a list of users which are leaders of the course with the
     * passed course ID.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param courseID
     *            the course's ID
     * @return the list of users containing the course's leaders, or null if the
     * course has no course leaders
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<User> getLeaders(Transaction trans, int courseID)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * Returns a course assigned to the specified ID.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param courseID
     *            the course's ID
     * @return the course assigned to the course ID, or null if no such course
     * was found
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static Course getCourse(Transaction trans, int courseID)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * Returns a list of courses which the user with the passed ID participates
     * in.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the user's ID
     * @return the list of courses which the user participates in, or null if
     * the user doesn't participate in any course
     * 
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static List<Course> getCoursesOf(Transaction trans, int userID)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * Updates a course stored in the database. The course's attributes are
     * replaced by the ones of the passed course.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param course
     *            the course to be updated
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void updateCourse(Transaction trans, Course course)
	    throws InvalidDBTransferException {
    }

    /**
     * Deletes a course which is assigned to the passed ID.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param courseID
     *            the ID of the course to be deleted
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void deleteCourse(Transaction trans, int courseID)
	    throws InvalidDBTransferException {
    }

    /**
     * Adds a user to a course's list of participants.
     * <p>
     * A tuple of the user's ID and the course's ID is added to the table
     * containing course participants in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the user's ID
     * @param courseID
     *            the course's ID
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void addUserToCourse(Transaction trans, int userID, int courseID)
	    throws InvalidDBTransferException {
    }

    /**
     * Removes a user from a course's list of participants.
     * <p>
     * The tuple of the user's ID and the course's ID is removed from the table
     * of course participants in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the user's ID
     * @param courseID
     *            the course's ID
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void removeUserFromCourse(Transaction trans, int userID, int courseID)
	    throws InvalidDBTransferException {
    }

    /**
     * Adds a user to a course's list of course leaders.
     * <p>
     * A tuple of the user's ID and the course's ID is added to the table
     * containing course leaders in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the user's ID
     * @param courseID
     *            the course's ID
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void addLeaderToCourse(Transaction trans, int userID, int courseID)
	    throws InvalidDBTransferException {
    }

    /**
     * Removes a course leader from a course's list of course leaders.
     * <p>
     * The tuple of the course leader's ID and the course's ID is removed from
     * the table of course leaders in the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @param userID
     *            the course leader's ID
     * @param courseID
     *            the course's ID
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static void removeLeaderFromCourse(Transaction trans, int userID, int course)
	    throws InvalidDBTransferException {
    }
    
    /**
     * Returns an ID assigned to the course which has been added last to the database.
     * 
     * @param trans
     *            the Transaction object which contains the connection to the
	 *            database
     * @return the course's ID
     * @throws InvalidDBTransferException if any error occurred during the
     * execution of the method
     */
    public static int getNewCourseID(Transaction trans) throws InvalidDBTransferException {
	return 0;
    }

}
