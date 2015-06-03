/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import de.ofCourse.exception.BankAccountException;
import de.ofCourse.model.User;
import de.ofCourse.system.Transaction;

/**
 * Provides the functionality of toping up the account balance of a user by the
 * administrator.<br>
 * To do this the administrator has to enter the amount to deposit and the name
 * and id of the user on which the money is to be deposited.<br>
 * So it is possible to pass money that was paid to the administrator to the
 * users account.
 * 
 * <p>
 * This class is ManagedBean of the <code>adminManagement</code> facelet.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class PaymentOfflineBean {

    /**
     * Stores the transaction that is used for database interaction.
     */
    private Transaction transaction;

    /**
     * Stores the data of the user who gets the money on his account
     */
    private User user;

    /**
     * Stores the amount of money that is to be deposited on the account of a
     * user
     */
    private float amountToDeposit;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUserBean sessionUser;

    /**
     * Tops up an user account in the system with a certain amount of money and
     * returns <code>true</code> if the action was successful.<br>
     * If a user has paid a certain amount of money to the administrator, the
     * administrator can top up the users account.
     * <p>
     * To do so he has to enter the name of the user, the id of the user and the
     * amount that is to deposit.<br>
     * If the entered name and the entered id belongs to the same user, the
     * amount is deposited on the users account, that means the account balance
     * of the user is updated in the database.<br>
     * If there goes something wrong a BankAccountException is thrown.
     * 
     * @return <code>true</code> if the amount of money was deposited correctly;
     *         <code>false</code> otherwise
     * 
     * @throws BankAccountException
     *             if there occurs an error during toping up the user account
     */
    public boolean depositAmountOnUserAccount() throws BankAccountException {
	return false;
    }

    /**
     * Returns the value of the attribute <code>user</code> that stores the user
     * who get's the money on his account
     * 
     * @return the user who gets the money on his account
     */
    public User getUser() {
	return user;
    }

    /**
     * Sets the value of the attribute <code>user</code> that stores the
     * information who get's the money on his account
     * 
     * @param user
     *            the new user who is about to get the money
     */
    public void setUser(User user) {
    }

    /**
     * Returns the value of the attribute <code>users</code> that stores the
     * amount of money that is to deposit on a user account.
     * 
     * @return amount of money to deposit
     */
    public float getAmountToDeposit() {
	return amountToDeposit;
    }

    /**
     * Sets the value of the attribute <code>amountToDeposit</code> that stores
     * the amount of money that is to deposit on a user account.
     * 
     * @param amountToDeposit
     *            the amount of money to deposit
     */
    public void setAmountToDeposit(float amountToDeposit) {
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
