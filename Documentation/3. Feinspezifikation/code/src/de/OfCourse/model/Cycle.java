/**
 * 
 */
package de.OfCourse.model;

import java.util.Date;

/**
 * This class contains the information of courseunits which will take place regulary
 * @author Sebastian
 *
 */
public class Cycle {

    /**
     * starttime, the Date and time when the first courseUnit will take place
     */
    private Date starttime;
    /**
     * turnus, the days till the next unit should take place
     */
    private int turnus;
    /**
     * numberOfUnits, the number of units which should take place 
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
