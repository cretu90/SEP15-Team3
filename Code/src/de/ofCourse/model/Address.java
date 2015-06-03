/**
 * This package represents all the models which are used
 */
package de.ofCourse.model;

/**
 * contains all information about the address of Users and Courses
 * 
 * @author Sebastian
 *
 */
public class Address {

    /**
     * stores the id of the address
     */
    private int id;
    /**
     * stores the country where the user lives or where the course will be
     * hold
     */
    private String country;
    /**
     * stores the city where the user lives or where the course will be hold
     */
    private String city;
    /**
     * 
     * stores the street where the user lives or where the course will be hold
     */
    private String street;
    /**
     * stores the houseNumber where the user lives or where the course
     * will be hold
     */
    private int houseNumber;
    /**
     * stores the zipdCode where the user lives or where the course will be
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
     * Returns the value of the attribute <code>id</code>.
     * 
     * @return the id of the address
     */
    public int getId() {
	return this.id;
    }
    
    /**
     * Returns the value of the attribute <code>country</code>.
     * 
     * @return the country where the user lives or course will be hold
     */
    public String getCountry() {
	return this.country;
    }

    /**
     * Returns the value of the attribute <code>city</code>.
     * 
     * @return the city where the user lives or the course will be hold
     */
    public String getCity() {
	return this.city;
    }

    /**
     * Returns the value of the attribute <code>street</code>.
     * 
     * @return the street where the user lives or the course will be hold
     */
    public String getStreet() {
	return this.street;
    }

    /**
     * Returns the value of the attribute <code>houseNumber</code>.
     * 
     * @return the houseNumber where the user lives or the course will be hold
     */
    public int getHouseNumber() {
	return this.houseNumber;
    }

    /**
     * Returns the value of the attribute <code>zipCode</code>.
     * 
     * @return the zipCode where the user lives or the course will be hold
     */
    public int getZipCode() {
	return this.zipCode;
    }

    /**
     * Sets the value of the attribute <code>id</code>.
     * 
     * @param id
     *          the new id to set
     */
    public void setId(int id) {
	this.id = id;
    }
    
    /**
     * Sets the value of the attribute <code>country</code>.
     * 
     * @param country
     *          new country to set
     */
    public void setCountry(String country) {
	this.country = country;
    }

    /**
     * Sets the value of the attribute <code>city</code>.
     * 
     * @param city
     *          the new city to set
     */
    public void setCity(String city) {
	this.city = city;
    }

    /**
     * Sets the value of the attribute <code>street</code>.
     * 
     * @param street
     *          the new street to set
     */
    public void setStreet(String street) {
	this.street = street;
    }

    /**
     * Sets the value of the attribute <code>houseNumber</code>.
     * 
     * @param houseNumber
     *          the new houseNumber to set
     */
    public void setHouseNumber(int houseNumber) {
	this.houseNumber = houseNumber;
    }

    /**
     * Sets the value of the attribute <code>zipCode</code>.
     * 
     * @param zipCode
     *          the new zipCode to set
     */
    public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
    }

   
}
