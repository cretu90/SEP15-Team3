/**
 * 
 */
package de.OfCourse.action;

import de.OfCourse.exception.BankAccountException;
import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class PaymentOffline {
    
    private User user;
    private float amountToDeposit;
    private SessionUser sessionUser;
    
    public boolean depositAmountOnUserAccount() throws BankAccountException{
	return false;}
    public User getUser(){
	return user;}
    public void setUser(User user){}
    public float getAmountToDeposit(){
	return amountToDeposit;}
    public void setAmountToDeposit(float amountToDeposit){}
    public SessionUser getSessionUser(){
	return sessionUser;}
    public void setSessionUser(SessionUser userSession){}

}
