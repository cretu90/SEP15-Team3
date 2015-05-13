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
public class CourseDAO {

    public static void createCourse(Course course)
	    throws InvalidDBTransferException {
    }

    public static List<Course> getCourses(Pagination pagination)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<Course> getCourses(Pagination pagination,
	    String searchString) throws InvalidDBTransferException {
	return null;
    }

    public static List<Course> getCoursesOrdered(Pagination pagination,
	    String searchString, String orderParam)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<User> getLeaders(int courseID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static Course getCourse(int courseID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<Course> getCoursesOf(int UserID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static void updateCourse(Course course)
	    throws InvalidDBTransferException {
    }

    public static void deleteCourse(int courseID)
	    throws InvalidDBTransferException {
    }

    public static void addUserToCourse(int userID)
	    throws InvalidDBTransferException {
    }

    public static void removeUserFromCourse(int userID)
	    throws InvalidDBTransferException {
    }

    public static void addLeaderToCourse(int userID)
	    throws InvalidDBTransferException {
    }

    public static void removeLeaderFromCourse(int userID)
	    throws InvalidDBTransferException {
    }

}
