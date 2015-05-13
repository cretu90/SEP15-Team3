/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.model.CourseUnit;
import de.OfCourse.model.Cycle;
import de.OfCourse.model.Pagination;
import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class CourseUnitManagement {

    private User userToAdd;
    private List<User> usersToDelete;
    private boolean isRegularCourseUnit;
    private Cycle cycleOfCourseUnit;
    private CourseUnit courseUnit;
    private List<User> participientsOfCourseUnit;
    private Pagination pagination;
    private SessionUser sessionUser;

    public String createCourseUnit() {
	return null;
    }

    public String editCourseUnit() {
	return null;
    }

    public String saveCourseUnit(boolean editAllIfRegular) {
	return null;
    }

    public String deleteCourseUnit(boolean deleteAllIfRegular) {
	return null;
    }

    public void addUserToCourseUnit(User user) {
    }

    public User getUserToAdd() {
	return userToAdd;
    }

    public void setUserToAdd(User userToAdd) {
    }

    public void deleteUsersFromCourse() {
    }

    public List<User> getUserToDelete() {
	return usersToDelete;
    }

    public void setUsersToDelete(List<User> usersToDelete) {
    }

    public boolean getIsRegularCourseUnit() {
	return isRegularCourseUnit;
    }

    public Cycle getCylceOfCourseUnit() {
	return cycleOfCourseUnit;
    }

    public void setCylceOfCourseUnit(Cycle cycle) {
    }

    public CourseUnit getCourseUnit() {
	return courseUnit;
    }

    public void setCourseUnit(CourseUnit courseUnit) {
    }

    public List<User> getParticipientsOfCourseUnit() {
	return participientsOfCourseUnit;
    }

    public void setParticipientsOfCourseUnit(List<User> participients) {
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
