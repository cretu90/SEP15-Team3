/**
 * 
 */
package de.OfCourse.model;

import java.util.Date;

/**
 * @author Fuchs
 *
 */
public class Cycle {

    /**
     * 
     */
    private Date starttime;
    /**
     * 
     */
    private int turnus;
    /**
     * 
     */
    private int numberOfUnits;

    /**
     * @return
     */
    public Date getStarttime() {
	return this.starttime;
    }

    /**
     * @return
     */
    public int getTurnus() {
	return this.turnus;
    }

    /**
     * @return
     */
    public int getNumberOfUnits() {
	return this.numberOfUnits;
    }

    /**
     * @param startingTime
     */
    public void setStarttime(Date startingTime) {
	this.starttime = startingTime;
    }

    /**
     * @param turnus
     */
    public void setTurnus(int turnus) {
	this.turnus = turnus;
    }

    /**
     * @param numberOfUnits
     */
    public void setNumberOfUnits(int numberOfUnits) {
	this.numberOfUnits = numberOfUnits;
    }
}
