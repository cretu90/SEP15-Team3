/**
 * 
 */
package de.ofCourse.model;

import java.util.Date;

/**
 * This class contains all Information about a User
 * 
 * @author
 *
 */
public class User {

    /**
     * address, the address where the user lives
     */
    private Address address;
    /**
     * email, the E-Mailaddress of the user
     */
    private String email;
    /**
     * salutation, the gender of the user
     */
    private String salutation;
    /**
     * firstname, the firstname of the user
     */
    private String firstname;
    /**
     * lastname, the lastname of the user
     */
    private String lastname;
    /**
     * username, the username which the user needs for the login
     */
    private String username;
    /**
     * password, the password which the user needs for the login
     */
    private String password;
    /**
     * dateOfBirth, the date of Birth of the the User
     */
    private Date dateOfBirth;
    /**
     * prfilImage, the profil image of the user
     */
    private String profilImage;
    /**
     * userRole, the role which the user has in the System
     */
    private UserRole userRole;
    /**
     * userSatus, the status which the user has at the moment
     */
    private UserStatus userStatus;
    /**
     * accountBalance, the amount of money the user has on his profil
     */
    private float accountBalance;
    /**
     * userID, the id with which the user can be identify
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
	this.salutation = sal;
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
