/**
 * 
 */
package de.OfCourse.model;

/**
 * @author
 *
 */
public class Address {

    /**
     * 
     */
    private String country;
    /**
     * 
     */
    private String city;
    /**
     * 
     */
    private String street;
    /**
     * 
     */
    private int houseNumber;
    /**
     * 
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

}
