/**
 * This package represents all the models which are used
 */
package de.ofCourse.model;

import java.io.Serializable;
import java.util.Date;

/**
 * contains all Information about a User
 * 
 * @author
 *
 */
public class User implements Serializable {

    /**
     *stores the address where the user lives
     */
    private Address address;
    /**
     *stores the E-Mailaddress of the user
     */
    private String email;
    /**
     *stores the gender of the user
     */
    private Salutation salutation;
    /**
     * stores the firstname of the user
     */
    private String firstname;
    /**
     * stores the lastname of the user
     */
    private String lastname;
    /**
     * stores the username which the user needs for the login
     */
    private String username;
   
    /**
     * stores the date of Birth of the the User
     */
    private Date dateOfBirth;
    /**
     * stores the profil image of the user
     */
    private String profilImage;
    /**
     * stores the role which the user has in the System
     */
    private UserRole userRole;
    /**
     * stores the status which the user has at the moment
     */
    private UserStatus userStatus;
    /**
     * stores the amount of money the user has on his profil
     */
    private float accountBalance;
    /**
     * stores the id with which the user can be identify
     */
    private int userID;

    /**
     * Returns the value of the attribute <code>address</code>.
     * 
     * @return the address where the users lives
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
     * Returns the value of the attribute <code>email</code>.
     * 
     * @return the email address of the user
     */
    public String getEmail() {
	return this.email;
    }

    /**
     * Returns the value of the attribute <code>salutation</code>.
     * 
     * @return the gender of the user
     */
    public Salutation getSalutation() {
	return this.salutation;
    }

    /**
     * Returns the value of the attribute <code>firstname</code>.
     * 
     * @return the firstname of the user
     */
    public String getFirstname() {
	return this.firstname;
    }

    /**
     * Returns the value of the attribute <code>lastname</code>.
     * 
     * @return the lastname of the user
     */
    public String getLastname() {
	return this.lastname;
    }

    /**
     * Returns the value of the attribute <code>username</code>.
     * 
     * @return the username of the user
     */
    public String getUsername() {
	return this.username;
    }

   

    /**
     * Returns the value of the attribute <code>dateOfBirth</code>.
     * 
     * @return the dateOfBirth of the user
     */
    public Date getDateOfBirth() {
	return this.dateOfBirth;
    }

    /**
     * Returns the value of the attribute <code>profilImage</code>.
     * 
     * @return the profilImage of the user
     */
    public String getProfilImage() {
	return this.profilImage;
    }

    /**
     * Returns the value of the attribute <code>userRole</code>.
     * 
     * @return the role of the User in the system
     */
    public UserRole getUserRole() {
	return this.userRole;
    }

    /**
     * Returns the value of the attribute <code>userStatus</code>.
     * 
     * @return the status of the user
     */
    public UserStatus getUserStatus() {
	return this.userStatus;
    }

    /**
     * Returns the value of the attribute <code>accountBalance</code>.
     * 
     * @return the amount of money the users has on his account
     */
    public float getAccountBalance() {
	return this.accountBalance;
    }

    /**
     * Returns the value of the attribute <code>userID</code>.
     * 
     * @return the ID of the user
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
     * Sets the value of the attribute <code>address</code>.
     * 
     * @param address
     *          new address to set
     */
    public void setAddress(Address address) {
	this.address = address;
    }

    /**
     * Sets the value of the attribute <code>email</code>.
     * 
     * @param email
     *          new email to set
     */
    public void setEmail(String email) {
	this.email = email;
    }

    /**
     * Sets the value of the attribute <code>salutation</code>.
     * 
     * @param sal
     *          new salutation to set
     */
    public void setSalutation(Salutation sal) {
	this.salutation = sal;
    }

    /**
     * Sets the value of the attribute <code>firstname</code>.
     * 
     * @param firstname
     *          new firstname to set
     */
    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    /**
     * Sets the value of the attribute <code>lastname</code>.
     * 
     * @param lastname
     *          new lastname to set
     */
    public void setLastname(String lastname) {
	this.lastname = lastname;
    }


    /**
     * Sets the value of the attribute <code>userRole</code>.
     * 
     * @param role
     *          new userRole to set
     */
    public void setUserRole(UserRole role) {
	this.userRole = role;
    }

    /**
     * Sets the value of the attribute <code>userID</code>.
     * 
     * @param id
     *          new ID to set
     */
    public void setUserId(int id) {
	this.userID = id;
    }

    /**
     * Sets the value of the attribute <code>username</code>.
     * 
     * @param username
     *          new username to set
     */
    public void setUsername(String username) {
	this.username = username;
    }

    /**
     * Sets the value of the attribute <code>dateOfBirth</code>.
     * 
     * @param dateOfBirth
     *          new date of Birth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
    }

    /**
     * Sets the value of the attribute <code>profilImage</code>.
     * 
     * @param profilImage
     *          new profil Image to set
     */
    public void setProfilImage(String profilImage) {
	this.profilImage = profilImage;
    }

    /**
     * Sets the value of the attribute <code>userSatus</code>.
     * 
     * @param status
     *          new status of the User to set
     */
    public void setUserStatus(UserStatus status) {
	this.userStatus = status;
    }

    /**
     * Sets the value of the attribute <code>balance</code>.
     * 
     * @param balance
     *          new account balance to set
     */
    public void setAccountBalance(float balance) {
	this.accountBalance = balance;
    }

}
