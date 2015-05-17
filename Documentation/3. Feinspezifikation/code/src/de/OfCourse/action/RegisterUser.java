/**
 * This package represents the business logic of the ofCourse system.
 */
package de.OfCourse.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import de.OfCourse.model.User;

/**
 * Provides the functionality to register in the the system by entering the
 * required user data.<br>
 * After the registration a verification link is sent to the entered email
 * address to ensure that it is a valid address.
 * <p>
 * Whether the user can log on the sytsem after verifying the entered email
 * address depends on the type of account acvtivation determined by the
 * administrator.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>authenticate</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class RegisterUser {

    /**
     * Represents a user object. It stores the data which is entered by the user
     * who wants to register.
     */
    private User userToRegistrate;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUser sessionUser;

    /**
     * Registers a new user with the entered user data in the system.<br>
     * It creates with the entered data a new database entry and sends a mail
     * with a verification link to the entered email address which is used to
     * ensure that the entered email address really exists.<br>
     * If there goes something wrong during registration, e.g. the choosen
     * username is already in use, a error message is displayed.
     */
    public void registerUser() {

    }

    /**
     * Returns the value of the attribute <code>usersToRegistrate</code>.
     * 
     * @return the user to register
     */
    public User getUsertoRegistrate() {
	return userToRegistrate;
    }

    /**
     * Sets the value of the attribute <code>usersToRegistrate</code>.
     * 
     * @param userToRegistrate
     *            the user to register
     */
    public void setUserToRegistrate(User userToRegistrate) {
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

}
