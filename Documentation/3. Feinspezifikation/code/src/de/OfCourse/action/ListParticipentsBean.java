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
 * Displays the participants that attend a certain course and offers the course
 * leader the possibility to delete users from on of his managed courses.
 * <p>
 * 
 * Supports pagination to display the users.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>listParticipients</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@ViewScoped
public class ListParticipentsBean implements Pagination {

    /**
     * Stores the the list of participants that is displayed on the page.
     */
    private List<User> participients;

    /**
     * Stores the the list of users that are to removed from the course.
     */
    private List<User> usersToDelete;

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
     * Returns a list of users who are attending the course.
     * 
     * @return list of participants
     */
    public List<User> getParticipients() {
	return participients;
    }

    /**
     * Sets the value of the attribute <code>participants</code> of a course.
     * 
     * @param participients
     *            the new participants list
     */
    public void setParticipients(List<User> participients) {
    }

    /**
     * Initializes the <code>listParticipants</code> page with the participants
     * of the course.
     */
    public void init() {
    }

    /**
     * Deletes the selected users from the course and with it automatically from
     * all course units of this course and transfers the paid price for the
     * course units automatically back to the accounts of the participants.<br>
     * Deleting means the users are removed from the participants list and the
     * database entry of the course and the respective course units are updated.
     */
    public void deleteUsersFromCourse() {
    }

    /**
     * Returns the value of the attribute <code>usersToActivate</code> that
     * stores the participants which are to deleted from the course.
     * 
     * @return list of users who shall be deleted from a course
     */
    public List<User> getUsersToDelete() {
	return usersToDelete;
    }

    /**
     * Sets the value of the attribute <code>usersToActivate</code> that stores
     * the participants which are to deleted from the course.
     * 
     * @param usersToDelete
     *            the new list of users who shall be deleted from a course
     */
    public void setUsersToDelete(List<User> usersToDelete) {
    }

    /**
     * Redirects the user back to the courseDetail - page of the course.
     * 
     * @return the link to the courseDetail - page
     */
    public String cancel() {
	return null;
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
