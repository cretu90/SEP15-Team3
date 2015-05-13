/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.model.Course;
import de.OfCourse.model.Pagination;
import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class UserProfil {

    private User user;
    private List<Course> managedCourses;
    private Pagination pagination;
    private SessionUser sessionUser;

    public String editUserdata() {
	return null;
    }

    public String saveUserdata() {
	return null;
    }

    public void uploadProfilPic() {
    }

    public String setUserInactive() {
	return null;
    }

    public void depositMoneyPerCreditcard() {
    }

    public User getUser() {
	return user;
    }

    public void setUser(User userToSet) {
    }

    public List<Course> getManagedCourses() {
	return managedCourses;
    }

    public void setManagedCourses(List<Course> managedCourses) {
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
