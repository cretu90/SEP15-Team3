/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.model.Pagination;
import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class AccountManagment {

    private List<User> usersToActivate;
    private List<User> users;
    private Pagination pagination;
    private SessionUser sessionUser;

    public void activateAccounts() {
    }

    public List<User> getUsersToActivate() {
	return usersToActivate;
    }

    public void setUsersToActivate(List<User> usersToActivate) {
    }

    public List<User> getUsers() {
	return users;
    }

    public void setUsers(List<User> users) {
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
