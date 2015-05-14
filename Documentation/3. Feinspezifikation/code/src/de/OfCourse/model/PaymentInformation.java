/**
 * 
 */
package de.OfCourse.model;

import java.util.Date;

/**
 * This class saves all requierd information for the online banking progress.
 * 
 * 
 * @author Sebastian
 *
 */
public class PaymentInformation {

    /**
     * AccountNumber, from this account the money will be transfered.
     * 
     */
    private String accountNumber;
    /**
     * The amount of Money which will be transfered.
     * 
     */
    private int amount;
    /**
     * ccHolder, the Name of the CreditCard Owner
     * 
     */
    private String ccHolder;
    /**
     * ccNumber, the Number of the CreditCard
     * 
     */
    private String ccNumber;
    /**
     * ccValidFrom, the Date since when the CreditCard is valid
     * 
     */
    private Date ccValidFrom;
    /**
     * ccValdidTo, the Date till when the CreditCard is valid
     * 
     */
    private Date ccValidTo;
    /**
     * cvc, the CardValidationCode which is a Security feature and is needed for online transfers
     * 
     */
    private int cvc;

    /**
     * Getter method of the AccountNumber attribute
     * 
     * @return the accountNumber - attribute
     */
    public String getAccountNumber() {
	return accountNumber;
    }

    /**
     * Setter methode of the accountNumber attribute
     * @param accountNumber
     *            the accountNumber to set - attribute
     */
    public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
    }

    /**
     * Getter methode of the amount attribute
     * 
     * @return the amount - attribute
     */
    public int getAmount() {
	return amount;
    }

    /**
     * Setter methode of the amount attribute
     * 
     * @param amount
     *            the amount to set - attribute
     */
    public void setAmount(int amount) {
	this.amount = amount;
    }

    /**
     * Getter methode of the ccHolder attribute
     * 
     * @return the ccHolder - attribute
     */
    public String getCcHolder() {
	return ccHolder;
    }

    /**
     * Setter methode of the ccHolder attribute
     * 
     * @param ccHolder
     *            the ccHolder to set - attribute
     */
    public void setCcHolder(String ccHolder) {
	this.ccHolder = ccHolder;
    }

    /**
     * Getter methode of the ccNumber attribute
     * @return the ccNumber - attribute
     */
    public String getCcNumber() {
	return ccNumber;
    }

    /**
     * Setter methode of the ccNumber attribute
     * 
     * @param ccNumber
     *            the ccNumber to set - attribute
     */
    public void setCcNumber(String ccNumber) {
	this.ccNumber = ccNumber;
    }

    /**
     * Getter methode of the ccValidFrom attribute
     * 
     * @return the ccValidFrom - attribute
     */
    public Date getCcValidFrom() {
	return ccValidFrom;
    }

    /**
     * Setter methode of the ccValidFrom attribute
     * 
     * @param ccValidFrom
     *            the ccValidFrom to set - attribute
     */
    public void setCcValidFrom(Date ccValidFrom) {
	this.ccValidFrom = ccValidFrom;
    }

    /**
     * Getter methode of the ccValidTo attribute
     * 
     * @return the ccValidTo - attribute
     */
    public Date getCcValidTo() {
	return ccValidTo;
    }

    /**
     * Setter methode of the ccValidTo attribute
     * 
     * @param ccValidTo
     *            the ccValidTo to set - attribute
     */
    public void setCcValidTo(Date ccValidTo) {
	this.ccValidTo = ccValidTo;
    }

    /**
     * Getter methode of the cvc attribute
     * 
     * @return the cvc - attribute
     */
    public int getCvc() {
	return cvc;
    }

    /**
     * Setter methode of the cvc attribute
     * 
     * @param cvc
     *            the cvc to set - attribute
     */
    public void setCvc(int cvc) {
	this.cvc = cvc;
    }

}
