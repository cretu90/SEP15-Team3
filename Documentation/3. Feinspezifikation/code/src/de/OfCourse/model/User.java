/**
 * 
 */
package de.OfCourse.model;

import java.util.Date;

/**
 * @author
 *
 */
public class User {

    /**
     * 
     */
    private Address address;
    /**
     * 
     */
    private String email;
    /**
     * 
     */
    private String salutation;
    /**
     * 
     */
    private String firstname;
    /**
     * 
     */
    private String lastname;
    /**
     * 
     */
    private String username;
    /**
     * 
     */
    private String password;
    /**
     * 
     */
    private Date dateOfBirth;
    /**
     * 
     */
    private String profilImage;
    /**
     * 
     */
    private UserRole userRole;
    /**
     * 
     */
    private UserStatus userStatus;
    /**
     * 
     */
    private float accountBalance;
    /**
     * 
     */
    private int userID;

    /**
     * @return
     */
    public Address getAddress() {
	return this.address;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {
	return false;
    }

    /**
     * @return
     */
    public String getEmail() {
	return this.email;
    }

    /**
     * @return
     */
    public String getSalutation() {
	return this.salutation;
    }

    /**
     * @return
     */
    public String getFristname() {
	return this.firstname;
    }

    /**
     * @return
     */
    public String getLastname() {
	return this.lastname;
    }

    /**
     * @return
     */
    public String getUsername() {
	return this.username;
    }

    /**
     * @return
     */
    public String getPassword() {
	return this.password;
    }

    /**
     * @return
     */
    public Date getDateOfBirth() {
	return this.dateOfBirth;
    }

    /**
     * @return
     */
    public String getProfilImage() {
	return this.profilImage;
    }

    /**
     * @return
     */
    public UserRole getUserRole() {
	return this.userRole;
    }

    /**
     * @return
     */
    public UserStatus getUserStatus() {
	return this.userStatus;
    }

    /**
     * @return
     */
    public float getAccountBalance() {
	return this.accountBalance;
    }

    /**
     * @return
     */
    public int getUserID() {
	return this.userID;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
	return 0;
    }

    /**
     * @param address
     */
    public void setAddress(Address address) {
	this.address = address;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
	this.email = email;
    }

    /**
     * @param sal
     */
    public void setSalutation(String sal) {
	this.salutation = salutation;
    }

    /**
     * @param firstname
     */
    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    /**
     * @param lastname
     */
    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * @param role
     */
    public void setUserRole(UserRole role) {
	this.userRole = role;
    }

    /**
     * @param id
     */
    public void setUserId(int id) {
	this.userID = id;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
	this.username = username;
    }

    /**
     * @param dateOfBirth
     */
    public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
    }

    /**
     * @param profilImage
     */
    public void setProfilImage(String profilImage) {
	this.profilImage = profilImage;
    }

    /**
     * @param status
     */
    public void setUserStatus(UserStatus status) {
	this.userStatus = status;
    }

    /**
     * @param balance
     */
    public void setAccountBalance(float balance) {
	this.accountBalance = balance;
    }

}
