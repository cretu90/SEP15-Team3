/**
 * This package represents all the models which are used
 */
package de.ofCourse.model;

import java.util.Date;

/**
 * This class contains the information of courseunits which will take place
 * regulary
 * 
 * @author Sebastian
 *
 */
public class Cycle {

    /**
     * stores the Date and time when the first courseUnit will take place
     */
    private Date starttime;
    /**
     * stores the days till the next unit should take place
     */
    private int turnus;
    /**
     * stores the amount of units which should take place
     */
    private int numberOfUnits;

    /**
     * Returns the value of the attribute <code>starttime</code>.
     * 
     * @return the Date and Time the first unit should start
     */
    public Date getStarttime() {
	return this.starttime;
    }

    /**
     * Returns the value of the attribute <code>turnus</code>.
     * 
     * @return the turnus till the next unit should take place
     */
    public int getTurnus() {
	return this.turnus;
    }

    /**
     * Returns the value of the attribute <code>numberOfUnits</code>.
     * 
     * @return the amount of units which should take place
     */
    public int getNumberOfUnits() {
	return this.numberOfUnits;
    }

    /**
     * Sets the value of the attribute <code>startingTime</code>.
     * 
     * @param startingTime
     *          new startingTime to set
     */
    public void setStarttime(Date startingTime) {
	this.starttime = startingTime;
    }

    /**
     * Sets the value of the attribute <code>turnus</code>.
     * 
     * @param turnus
     *          new turnus to set
     */
    public void setTurnus(int turnus) {
	this.turnus = turnus;
    }

    /**
     * Sets the value of the attribute <code>numberOfUnits</code>.
     * 
     * @param numberOfUnits
     *          new amount of Units to set
     */
    public void setNumberOfUnits(int numberOfUnits) {
	this.numberOfUnits = numberOfUnits;
    }
}
