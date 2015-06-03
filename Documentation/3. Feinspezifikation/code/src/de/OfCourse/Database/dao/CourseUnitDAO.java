/**
 * 
 */
package de.ofCourse.Database.dao;

import java.util.List;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.model.CourseUnit;
import de.ofCourse.model.PaginationData;

/**
 * @author
 *
 */
public class CourseUnitDAO {

    public static void createCourseUnit(CourseUnit courseUnit)
	    throws InvalidDBTransferException {
    }

    public static CourseUnit getCourseUnit(int courseUnitID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<CourseUnit> getCourseUnitsFromCourse(int courseID,
	    PaginationData pagination) throws InvalidDBTransferException {
	return null;
    }

    public static void updateCourseUnit(CourseUnit courseUnit)
	    throws InvalidDBTransferException {
    }

    public static void deleteCourseUnit(int courseUnitID)
	    throws InvalidDBTransferException {
    }

    public static void addUserToCourseUnit(int userID)
	    throws InvalidDBTransferException {
    }

    public static void removeUserFromCourseUnit(int userID)
	    throws InvalidDBTransferException {
    }

    public static List<CourseUnit> getCourseUnitsOf(int userID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static int getNewCourseUnitID() throws InvalidDBTransferException {
	return 0;
    }
}
