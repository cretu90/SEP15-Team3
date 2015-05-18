/**
 * 
 */
package de.ofCourse.model;

/**
 * The class contains all information about the address of Users and Courses
 * 
 * @author Sebastian
 *
 */
public class Address {

    private String location;
    
    /**
     * country, the Country where the User lives or where the Course will be
     * hold
     */
    private String country;
    /**
     * city, the city where the User lives or where the Course will be hold
     */
    private String city;
    /**
     * 
     * street, the street where the User lives or where the Course will be hold
     */
    private String street;
    /**
     * houseNumber, the houseNumber where the User lives or where the Course
     * will be hold
     */
    private int houseNumber;
    /**
     * zipCode, the zipdCode where the User lives or where the Course will be
     * hold
     */
    private int zipCode;

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
    public String getCountry() {
	return this.country;
    }

    /**
     * @return
     */
    public String getCity() {
	return this.city;
    }

    /**
     * @return
     */
    public String getStreet() {
	return this.street;
    }

    /**
     * @return
     */
    public int getHouseNumber() {
	return this.houseNumber;
    }

    /**
     * @return
     */
    public int getZipCode() {
	return this.zipCode;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
	this.country = country;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
	this.city = city;
    }

    /**
     * @param street
     */
    public void setStreet(String street) {
	this.street = street;
    }

    /**
     * @param houseNumber
     */
    public void setHouseNumber(int houseNumber) {
	this.houseNumber = houseNumber;
    }

    /**
     * @param zipCode
     */
    public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
    }

    /**
     * @return the location
     */
    public String getLocation() {
	return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
	this.location = location;
    }

}
