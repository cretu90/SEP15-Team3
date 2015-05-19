/**
 * 
 */
package de.ofCourse.Database.dao;

import java.util.List;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.model.Course;
import de.ofCourse.model.PaginationData;
import de.ofCourse.model.User;
import de.ofCourse.system.Transaction;

/**
 * @author
 *
 */
public class UserDAO {

    /**
     * @param user
     * @throws InvalidDBTransferException
     */
    public static void createUser(Transaction trans, User user) throws InvalidDBTransferException {
    }

    /**
     * @param pagination
     * @return
     * @throws InvalidDBTransferException
     */
    public static List<User> getUsers(Transaction trans, PaginationData pagination)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * @param pagination
     * @param searchString
     * @return
     * @throws InvalidDBTransferException
     */
    public static List<User> getUsers(Transaction trans, PaginationData pagination,
	    String searchString) throws InvalidDBTransferException {
	return null;
    }

    /**
     * @param pagination
     * @param searchString
     * @param orderParam
     * @return
     * @throws InvalidDBTransferException
     */
    public static List<User> getUsersOrdered(Transaction trans, PaginationData pagination,
	    String searchString, String orderParam)
	    throws InvalidDBTransferException {
	return null;
    }

    /**
     * @param userID
     * @return
     * @throws InvalidDBTransferException
     */
    public static User getUser(Transaction trans, int userID) throws InvalidDBTransferException {
	return null;
    }

    /**
     * @param username
     * @return
     * @throws InvalidDBTransferException
     */
    public static int getUserID(Transaction trans, String username)
	    throws InvalidDBTransferException {
	return 0;
    }

    /**
     * @param user
     * @throws InvalidDBTransferException
     */
    public static void updateUser(Transaction trans, User user) throws InvalidDBTransferException {
    }

    /**
     * @param userID
     * @throws InvalidDBTransferException
     */
    public static void deleteUser(Transaction trans, int userID) throws InvalidDBTransferException {
    }

    /**
     * @param userID
     * @param pagination
     * @return
     * @throws InvalidDBTransferException
     */
    public static List<Course> getCoursesLeadedBy(Transaction trans, int userID,
	    PaginationData pagination) throws InvalidDBTransferException {
	return null;
    }

    public static int getNewUserID(Transaction trans) throws InvalidDBTransferException {
	return 0;

    }
}
