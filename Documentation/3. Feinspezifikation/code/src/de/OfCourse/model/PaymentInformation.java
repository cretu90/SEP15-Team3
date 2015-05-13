/**
 * 
 */
package de.OfCourse.model;

import java.util.Date;

/**
 * @author
 *
 */
public class PaymentInformation {

    /**
     * 
     */
    private String accountNumber;
    /**
     * 
     */
    private int amount;
    /**
     * 
     */
    private String ccHolder;
    /**
     * 
     */
    private String ccNumber;
    /**
     * 
     */
    private Date ccValidFrom;
    /**
     * 
     */
    private Date ccValidTo;
    /**
     * 
     */
    private int cvc;

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
	return accountNumber;
    }

    /**
     * @param accountNumber
     *            the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
	return amount;
    }

    /**
     * @param amount
     *            the amount to set
     */
    public void setAmount(int amount) {
	this.amount = amount;
    }

    /**
     * @return the ccHolder
     */
    public String getCcHolder() {
	return ccHolder;
    }

    /**
     * @param ccHolder
     *            the ccHolder to set
     */
    public void setCcHolder(String ccHolder) {
	this.ccHolder = ccHolder;
    }

    /**
     * @return the ccNumber
     */
    public String getCcNumber() {
	return ccNumber;
    }

    /**
     * @param ccNumber
     *            the ccNumber to set
     */
    public void setCcNumber(String ccNumber) {
	this.ccNumber = ccNumber;
    }

    /**
     * @return the ccValidFrom
     */
    public Date getCcValidFrom() {
	return ccValidFrom;
    }

    /**
     * @param ccValidFrom
     *            the ccValidFrom to set
     */
    public void setCcValidFrom(Date ccValidFrom) {
	this.ccValidFrom = ccValidFrom;
    }

    /**
     * @return the ccValidTo
     */
    public Date getCcValidTo() {
	return ccValidTo;
    }

    /**
     * @param ccValidTo
     *            the ccValidTo to set
     */
    public void setCcValidTo(Date ccValidTo) {
	this.ccValidTo = ccValidTo;
    }

    /**
     * @return the cvc
     */
    public int getCvc() {
	return cvc;
    }

    /**
     * @param cvc
     *            the cvc to set
     */
    public void setCvc(int cvc) {
	this.cvc = cvc;
    }

}
