/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import de.ofCourse.model.PaginationData;
import de.ofCourse.model.User;

/**
 * Provides functionality for course leaders and administrators to activate user
 * accounts.
 * 
 * <p>
 * Whether the activation by a course leader or an administrator is necessary,
 * is determined by the administrator in his administrator settings. This class
 * uses pagination to display the users.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>activateUsers</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@ViewScoped
public class AccountManagmentBean implements Pagination {

    /**
     * The users that are selected by the user and shall be activated.
     */
    private List<User> usersToActivate;

    /**
     * The users that are displayed on the page.
     */
    private List<User> users;

    /**
     * This attribute represents a pagination object. It stores all the
     * information that is necessary for pagination, e.g. the number of elements
     * per page.
     */
    private PaginationData pagination;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUser sessionUser;

    /**
     * Activates the user accounts that are selected in the facelet.
     * <p>
     * It gets the users selected by the administrator or the course leader and
     * changes the userStatus of these users to <code>REGISTERED</code>.
     * Furthermore it updates the entries of the users in the database. The
     * system sends a message to all successfully new activated user to inform
     * them about the activation and that they are now able to log in the
     * system.
     */
    public void activateAccounts() {
    }

    /**
     * Initializes the <code>activateUsers</code> page with the users that have
     * registered in the system, but are not yet activated.
     */
    public void init() {

    }

    /**
     * Returns the value of the attribute <code>usersToActivate</code>.
     * 
     * @return the users to activate
     */
    public List<User> getUsersToActivate() {
	return usersToActivate;
    }

    /**
     * Sets the value of the attribute <code>usersToActivate</code>.
     * 
     * @param usersToActivate
     *            the users that are to be activated
     */
    public void setUsersToActivate(List<User> usersToActivate) {
    }

    /**
     * Returns the value of the attribute <code>users</code>.
     * 
     * @return the displayed users
     */
    public List<User> getUsers() {
	return users;
    }

    /**
     * Sets the value of the attribute <code>users</code>.
     * 
     * @param users
     *            the users that are to be displayed
     */
    public void setUsers(List<User> users) {
    }

    /**
     * Returns the number of the actual displayed page.<br>
     * This method is necessary for the paging.
     * 
     * @return the number of the actual displayed page
     */
    public int getActualPageNumber() {
	return 0;
    }

    /**
     * Realizes the display of certain pages, that means only a fixed number of
     * database entries are presented at once. Furthermore it is responsible for
     * the navigation between the pages, especially for getting the next page,
     * the previous page or to jump to a specific page.
     */
    public void goToSpecificPage() {
    }

    /**
     * Returns the value of the attribute <code>pagination</code>.
     * 
     * @return the pagination object, that stores the information for pagination
     */
    public PaginationData getPagination() {
	return pagination;
    }

    /**
     * Sets the value of the attribute <code>pagination</code>.
     * 
     * @param pagination
     *            the new pagination object, that stores the information for
     *            pagination
     */
    public void setPagination(PaginationData pagination) {
    }

    /**
     * Returns the ManagedProperty <code>SessionUser</code>.
     * 
     * @return the session of the user
     */
    public SessionUser getSessionUser() {
	return sessionUser;
    }

    /**
     * Sets the ManagedProperty <code>SessionUser</code>.
     * 
     * @param userSession
     *            session of the user
     */
    public void setSessionUser(SessionUser userSession) {
    }

    @Override
    public void sortBySpecificColumn(String columnname) {
	// TODO Auto-generated method stub

    }

}
