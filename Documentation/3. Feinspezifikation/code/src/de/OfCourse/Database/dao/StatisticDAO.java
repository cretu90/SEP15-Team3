/**
 * 
 */
package de.OfCourse.Database.dao;

import java.util.Date;
import java.util.Map;

import de.OfCourse.exception.InvalidDBTransferException;
import de.OfCourse.model.Course;
import de.OfCourse.model.Pagination;
import de.OfCourse.model.User;

/**
 * @author
 *
 */
public class StatisticDAO {

    public static Map<Date, Float> getIncomePerDay(Date actualDate)
	    throws InvalidDBTransferException {
	return null;
    }

    public static Map<Date, Float> getIncomePerWeek(Date actualDate)
	    throws InvalidDBTransferException {
	return null;
    }

    public static Map<User, Float> getIncomePerLeader(Pagination pagination)
	    throws InvalidDBTransferException {
	return null;
    }

    public static Map<Course, Float> getIncomePerCourse(Pagination pagination)
	    throws InvalidDBTransferException {
	return null;
    }
}
