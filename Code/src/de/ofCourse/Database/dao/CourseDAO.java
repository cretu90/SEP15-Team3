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
public class CourseDAO {

    public static void createCourse(Transaction trans, Course course)
	    throws InvalidDBTransferException {
    }

    public static List<Course> getCourses(Transaction trans, PaginationData pagination)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<Course> getCourses(Transaction trans, PaginationData pagination,
	    String searchString) throws InvalidDBTransferException {
	return null;
    }

    public static List<Course> getCoursesOrdered(Transaction trans, PaginationData pagination,
	    String searchString, String orderParam)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<User> getLeaders(Transaction trans, int courseID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static Course getCourse(Transaction trans, int courseID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<Course> getCoursesOf(Transaction trans, int UserID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static void updateCourse(Transaction trans, Course course)
	    throws InvalidDBTransferException {
    }

    public static void deleteCourse(Transaction trans, int courseID)
	    throws InvalidDBTransferException {
    }

    public static void addUserToCourse(Transaction trans, int userID)
	    throws InvalidDBTransferException {
    }

    public static void removeUserFromCourse(Transaction trans, int userID)
	    throws InvalidDBTransferException {
    }

    public static void addLeaderToCourse(Transaction trans, int userID)
	    throws InvalidDBTransferException {
    }

    public static void removeLeaderFromCourse(Transaction trans, int userID)
	    throws InvalidDBTransferException {
    }
    
    public static int getNewCourseID(Transaction trans) throws InvalidDBTransferException {
	return 0;
    }

}
