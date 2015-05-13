/**
 * 
 */
package de.OfCourse.action;

import de.OfCourse.exception.BankAccountException;
import de.OfCourse.model.PaymentInformation;
import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class PaymentOnline {

    private User user;
    private PaymentInformation paymentInformation;
    private SessionUser sessionUser;

    public boolean depositAmount() throws BankAccountException {
	return false;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
    }

    public PaymentInformation getPaymentInformation() {
	return paymentInformation;
    }

    public void setPaymentInformation(PaymentInformation payInfo) {
    }

    public SessionUser getSessionUser() {
	return sessionUser;
    }

    public void setSessionUser(SessionUser userSession) {
    }

}
