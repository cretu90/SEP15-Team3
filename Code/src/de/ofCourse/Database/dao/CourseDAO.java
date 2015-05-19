/**
 * 
 */
package de.ofCourse.Database.dao;

import java.util.List;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.model.Course;
import de.ofCourse.model.PaginationData;
import de.ofCourse.model.User;

/**
 * @author
 *
 */
public class CourseDAO {

    public static void createCourse(Course course)
	    throws InvalidDBTransferException {
    }

    public static List<Course> getCourses(PaginationData pagination)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<Course> getCourses(PaginationData pagination,
	    String searchString) throws InvalidDBTransferException {
	return null;
    }

    public static List<Course> getCoursesOrdered(PaginationData pagination,
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
    
    public static int getNewCourseID() throws InvalidDBTransferException {
	return 0;
    }

}
