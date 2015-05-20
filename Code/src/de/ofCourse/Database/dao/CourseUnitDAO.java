/**
 * 
 */
package de.ofCourse.Database.dao;

import java.util.List;

import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.model.CourseUnit;
import de.ofCourse.model.PaginationData;
import de.ofCourse.system.Transaction;

/**
 * @author
 *
 */
public class CourseUnitDAO {

    public static void createCourseUnit(Transaction trans, CourseUnit courseUnit)
	    throws InvalidDBTransferException {
    }

    public static CourseUnit getCourseUnit(Transaction trans, int courseUnitID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static List<CourseUnit> getCourseUnitsFromCourse(Transaction trans, int courseID,
	    PaginationData pagination) throws InvalidDBTransferException {
	return null;
    }

    public static void updateCourseUnit(Transaction trans, CourseUnit courseUnit)
	    throws InvalidDBTransferException {
    }

    public static void deleteCourseUnit(Transaction trans, int courseUnitID)
	    throws InvalidDBTransferException {
    }

    public static void addUserToCourseUnit(Transaction trans, int userID)
	    throws InvalidDBTransferException {
    }

    public static void removeUserFromCourseUnit(Transaction trans, int userID)
	    throws InvalidDBTransferException {
    }

    public static List<CourseUnit> getCourseUnitsOf(Transaction trans, int userID)
	    throws InvalidDBTransferException {
	return null;
    }

    public static int getNewCourseUnitID(Transaction trans) throws InvalidDBTransferException {
	return 0;
    }
}
