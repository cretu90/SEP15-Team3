/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import de.ofCourse.model.Course;
import de.ofCourse.model.PaginationData;
import de.ofCourse.model.User;
import de.ofCourse.model.UserStatus;

/**
 * Displays the profile of a user and provides the functionality to edit the data
 * of the user. In case of the user is a course leader the courses managed by
 * the user are displayed as well.
 * <p>
 * The user can edit his complete userdata except his id, his user role and his
 * account balance.<br>
 * Also it is possible to set himself <code>INACTIVE</code>. For the user it
 * seems that he has deleted his account. In reality he is only set inactive and
 * cannot log in anymore.<br>
 * That is necessary because so it is impossible for the user to delete his
 * depts or balance if he wants to delete his account.<br>
 * A real delete of a user only can be done by the administrator.
 * <p>
 * This class is ManagedBean and controller of the facelet <code>userProfil</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@ViewScoped
public class UserProfilBean implements Pagination {

    /**
     * Stores the displayed or entered data of the user
     */
    private User user;

    /**
     * Stores the managed courses of a user in case of the user is a course
     * leader
     */
    private List<Course> managedCourses;

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
    private SessionUserBean sessionUser;

    /**
     * Returns the user profile page in its editable state.
     * 
     * @return link to the next page
     */
    public String editUserdata() {
	return null;
    }

    /**
     * Saves the edited user data and sets the user details page to its
     * not-editable state. In order to save the edited user, the database entry
     * of the user is updated with the new data and the <code>userProfil</code>
     * page is returned.
     * 
     * @return link to the next page
     */
    public String saveUserdata() {
	return null;
    }

    /**
     * Initializes the profile page page of the user with the details of the
     * user.
     */
    public void initialzeUserProfile() {
    }

    /**
     * Uploads a selected picture file from the local system to the server. The
     * picture needs to be a .jpg <br>
     */
    public void uploadProfilPic() {
    }

    /**
     * Sets the <code>userRole</code> of the actual user to
     * <code>INACTIVE</code>.<br>
     * In order to do so the database entry of the user is also updated.<br>
     * The entry of the user is still in the database but the user cannot log in
     * anymore.
     * 
     * @return the new user status
     */
    public UserStatus setUserInactive() {
	return null;
    }

    /**
     * Returns the value of the attribute <code>user</code>.
     * 
     * @return the actual displayed user
     */
    public User getUser() {
	return user;
    }

    /**
     * Sets the value of the attribute <code>user</code>.
     * 
     * @param userToSet
     *            the displayed user
     */
    public void setUser(User userToSet) {
    }

    /**
     * Returns the value of the attribute <code>managedCourses</code>.
     * 
     * @return list of courses that are managed by a course leader
     */
    public List<Course> getManagedCourses() {
	return managedCourses;
    }

    /**
     * Sets the value of the attribute <code>managedCourses</code> that stores a
     * list of courses that are managed by a course leader.
     * 
     * @param managedCourses
     *            list of courses that are managed by a course leader
     */
    public void setManagedCourses(List<Course> managedCourses) {
    }

    /**
     * {@inheritDoc}}
     */
    public int getActualPageNumber() {
	return 0;
    }

    /**
     * {@inheritDoc}}
     */
    public void goToSpecificPage() {
    }

    /**
     * {@inheritDoc}}
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
    public SessionUserBean getSessionUser() {
	return sessionUser;
    }

    /**
     * Sets the ManagedProperty <code>SessionUser</code>.
     * 
     * @param userSession
     *            session of the user
     */
    public void setSessionUser(SessionUserBean userSession) {
    }

    @Override
    public void sortBySpecificColumn(String columnname) {
	// TODO Auto-generated method stub

    }

}
