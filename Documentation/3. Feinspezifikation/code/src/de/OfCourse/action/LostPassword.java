/**
 * 
 */
package de.OfCourse.action;

import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class LostPassword {

    private String emailAddressToResetPassword;
    private User user;
    private SessionUser sessionUser;

    public void resetPassword() {
    }

    public String getEmailAddressToResetPassword() {
	return emailAddressToResetPassword;
    }

    public void setEmailAddressToResetPassword(String emailToResetPassword) {
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
    }

    public SessionUser getSessionUser() {
	return sessionUser;
    }

    public void setSessionUser(SessionUser userSession) {
    }

}
