/**
 * 
 */
package de.OfCourse.Database.dao;

import java.util.List;

import de.OfCourse.exception.InvalidDBTransferException;
import de.OfCourse.model.Course;
import de.OfCourse.model.Pagination;
import de.OfCourse.model.User;

/**
 * @author
 *
 */
public class UserDAO {

    /**
     * @param user
     * @throws InvalidDBTransferException
     */
    public static void createUser(User user) throws InvalidDBTransferException {
    }

    /**
     * @param pagination
     * @return
     * @throws InvalidDBTransferException
     */
    public static List<User> getUsers(Pagination pagination)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * @param pagination
     * @param searchString
     * @return
     * @throws InvalidDBTransferException
     */
    public static List<User> getUsers(Pagination pagination, String searchString)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * @param pagination
     * @param searchString
     * @param orderParam
     * @return
     * @throws InvalidDBTransferException
     */
    public static List<User> getUsersOrdered(Pagination pagination,
	    String searchString, String orderParam)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * @param userID
     * @return
     * @throws InvalidDBTransferException
     */
    public static User getUser(int userID) throws InvalidDBTransferException {
	return null;
    }

    /**
     * @param username
     * @return
     * @throws InvalidDBTransferException
     */
    public static int getUserID(String username)
	    throws InvalidDBTransferException {
	return 0;
    }

    /**
     * @param user
     * @throws InvalidDBTransferException
     */
    public static void updateUser(User user) throws InvalidDBTransferException {
    }

    /**
     * @param userID
     * @throws InvalidDBTransferException
     */
    public static void deleteUser(int userID) throws InvalidDBTransferException {
    }

    /**
     * @param userID
     * @param pagination
     * @return
     * @throws InvalidDBTransferException
     */
    public static List<Course> getCoursesLeadedBy(int userID,
	    Pagination pagination) throws InvalidDBTransferException {
	return null;
    }

}
