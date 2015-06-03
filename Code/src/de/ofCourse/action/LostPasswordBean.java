/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import de.ofCourse.Database.dao.UserDAO;
import de.ofCourse.system.Transaction;
import de.ofCourse.utilities.PasswordHash;

import java.util.Random;

/**
 * Provides the functionality to reset a lost password by entering a e-mail
 * address, generating automatically a new one and sending this new generated
 * password to the entered email address.
 * <p>
 * 
 * Before a password is reseted and replaced by a new generated, it is checked
 * whether the entered email address is stored in the system.<br>
 * If <code>true</code>, the old password is reseted, a new one generated and
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
public class LostPasswordBean {

	private static final String BIGSIGNS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String SMALLSIGNS = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMBERS = "0123456789";
	private static final String SPECIAL = "!@#$%^&*_=+-/";
	private static final int passwordLength = 8;

    /**
     * Stores the entered e-mail address to which the new password should be
     * sent.
     */
    private String emailAddressToResetPassword;
    
    /**
     * Stores the transaction that is used for database interaction.
     */
    private Transaction transaction;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUserBean sessionUser;

    /**
     * Resets the password of the user who forgot his password and sends a new
     * generated password to an entered email address.<br>
     * The new generated password is only sent to the entered email address if
     * the address exists in the system. The new password is stored in the
     * database.
     */
    public void resetPassword() {
    	String salt = "";
    	String newHashedPassword = PasswordHash.hash(generateNewPassword(), salt);
    	UserDAO.overridePassword(transaction, emailAddressToResetPassword, newHashedPassword, salt);
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

    private String generateNewPassword() {
    	String newPassword = null;
    	Random random = new Random();
    	int length = random.nextInt(1) + passwordLength;
    	char[] password = new char[length];
    	int iterator = 0;

    	for (int i = 0; i < 3; i++){
    		iterator = getNextPosition(random, length, password);
    		password[iterator] = BIGSIGNS.charAt(random.nextInt(BIGSIGNS.length()));
	    }
		for (int i = 0; i < 3; i++) {
			iterator = getNextPosition(random, length, password);
			password[iterator] = NUMBERS.charAt(random.nextInt(NUMBERS.length()));
		}
		for (int i = 0; i < 1; i++) {
			iterator = getNextPosition(random, length, password);
			password[iterator] = SPECIAL.charAt(random.nextInt(SPECIAL.length()));
		}
		for(int i = 0; i < length; i++) {
			if(password[i] == 0) {
				password[i] = SMALLSIGNS.charAt(random.nextInt(SMALLSIGNS.length()));
			}
		}
		newPassword = password.toString();
    	return newPassword;
    }

    private int getNextPosition(Random random, int length, char[] password) {
    	int iterator = random.nextInt(length);

    	while(password[iterator = random.nextInt(length)] != 0);
    	return iterator;
    }

}
