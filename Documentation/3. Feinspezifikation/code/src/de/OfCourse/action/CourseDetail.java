/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.exception.CourseRegistrationException;
import de.OfCourse.model.Course;
import de.OfCourse.model.CourseUnit;
import de.OfCourse.model.Pagination;
import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class CourseDetail {

    private Course course;
    private boolean registeredForCourseNews;
    private boolean courseSelected;
    private List<CourseUnit> selectedCourseUnits;
    private List<User> leadersOfCourse;
    private List<CourseUnit> courseUnitsOfCourse;
    private Pagination pagination;
    private SessionUser sessionUser;

    public String editCourse() {
	return null;
    }

    public String saveCourse() {
	return null;
    }

    public Course getCourse() {
	return course;
    }

    public void setCourse(Course course) {
    }

    public boolean registeredForCourseNews() {
	return registeredForCourseNews;
    }

    public String signUpForCourse() throws CourseRegistrationException {
	return null;
    }

    public String signOffFromCourse() throws CourseRegistrationException {
	return null;
    }

    public void selectAllCourseUnits() {
    }

    public boolean isCourseSelected() {
	return courseSelected;
    }

    public String signUpForCourseUnits() throws CourseRegistrationException {
	return null;
    }

    public String signOffFromCourseUnits() throws CourseRegistrationException {
	return null;
    }

    public List<CourseUnit> getSelectedCourseUnits() {
	return selectedCourseUnits;
    }

    public void setSelectedCourseUnits(List<CourseUnit> selectedCourseUnits) {
    }

    public List<User> getLeadersOfCourse() {
	return leadersOfCourse;
    }

    public void setLeadersOfCourse(List<User> leaders) {
    }

    public List<CourseUnit> getCourseUnitsOfCourse() {
	return courseUnitsOfCourse;
    }

    public void setCourseUnitsOfCourse(List<CourseUnit> courseUnits) {
    }

    public String loadParticipientsPage() {
	return null;
    }

    public String loadCreateCourseUnitPage() {
	return null;
    }

    public String loadEditCourseUnitPage() {
	return null;
    }

    public int getActualPageNumber() {
	return 0;
    }

    public void goToSpecificPage() {
    }

    public Pagination getPagination() {
	return pagination;
    }

    public void setPagination(Pagination pagination) {
    }

    public SessionUser getSessionUser() {
	return sessionUser;
    }

    public void setSessionUser(SessionUser userSession) {
    }

}
