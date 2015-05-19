/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import de.ofCourse.model.User;

/**
 * Provides the function that a user can log in the system by entering his
 * username and his password.<br>
 * <p>
 * It is checked whether the user is registered in the system.<br>
 * In case of this is true, the user is logged in the system. Otherwise the
 * access to the system isn't granted.<br>
 * 
 * This class is ManagedBean and controller of the facelet
 * <code>authenticate</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class AuthenticateUserBean {

    /**
     * Represents a user object. It stores the entered username and the entered
     * password, which are needed to log in.
     */
    private User loginUser;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUserBean sessionUser;

    /**
     * Returns the link to the <code>myCourses</code> page if the entered
     * username and the respective password are valid.<p>
     * It is checked whether the entered username and the respective password
     * belong to a user that is registered in the system. If this is true, the
     * log in action is successful and the user is directed to his
     * <code>myCourses</code> page.<br>
     * Otherwise there's displayed an error message an the user stays on this
     * page.
     * 
     * @return link to the next page 
     */
    public String login() {
	return null;
    }

    /**
     * Returns the value of the attribute <code>loginUser</code>.
     * 
     * @return the user who wants to log in
     */
    public User getLoginUser() {
	return loginUser;
    }

    /**
     * Sets the value of the attribute <code>loginUser</code>.
     * 
     * @param userToLogIn
     *            the users who wants to log in
     */
    public void setLoginUser(User userToLogIn) {
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

}
