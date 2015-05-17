/**
 * This package represents the business logic of the ofCourse system.
 */
package de.OfCourse.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import de.OfCourse.model.User;

/**
 * Provides the funtionality to reset a lost password by entering a e-mail
 * address, generating automatically a new one and sending this new generated
 * password to the entered email address.
 * <p>
 * 
 * Before a password is reseted and replaced by a new generated, it is checked
 * whether the entered email address is stored in the system.<br>
 * If <code>true</code>, the old password is reseted, a new one gereated and
 * sent to the email address.<br>
 * If <code>false</code>, a error message is displayed on the page.
 * 
 * <p>
 * This class is ManagedBean of the facelet <code>authenticate</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class LostPassword {

    /**
     * Stores the entered e-mail address to which the new password should be
     * sent
     */
    private String emailAddressToResetPassword;

    /** User who requests a new password */
    private User user;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUser sessionUser;

    /**
     * Resets the password of the user who forgot his password and sends a new
     * generated password to an entered email address.<br>
     * The new generated password is only sent to the entered email address if
     * the address exists in the system. The new password is stored in the
     * database.
     */
    public void resetPassword() {
    }

    /**
     * Returns the value of the attribute
     * <code>emailAddressToResetPassword</code>.
     * 
     * @return the entered email address of the user who forgot his password
     */
    public String getEmailAddressToResetPassword() {
	return emailAddressToResetPassword;
    }

    /**
     * Sets the value of the attribute <code>emailAddressToResetPassword</code>.
     * 
     * @param emailToResetPassword
     *            the new entered email address of the user who forgot his
     *            password
     */
    public void setEmailAddressToResetPassword(String emailToResetPassword) {
    }

    /**
     * Returns the value of the attribute <code>user</code>.
     * 
     * @return the user who forgot his password
     */
    public User getUser() {
	return user;
    }

    /**
     * 
     * Sets the value of the attribute <code>user</code>.
     * 
     * @param user
     *            the user who forgot his password
     */
    public void setUser(User user) {
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
