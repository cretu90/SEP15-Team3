/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Displays the personal scheduler of an user.<br>
 * In this scheduler the course units of a user are displayed in a graphical
 * way. If the user registers for a new course unit, it is added automatically
 * to the scheduler. If the user signs off from a course unit, it is
 * automatically removed from the scheduler.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>scheduler</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class SchedulerBean {

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUserBean sessionUser;

    /**
     * Swaps the actual displayed week in the scheduler to the following week.
     * The method checks whether there is a next week to display. If this is
     * true, it displays the scheduler of the following week.
     */
    public void displayNextWeek() {
    }

    /**
     * Swaps the actual displayed week in the scheduler to the previous week.
     * The method checks whether there is a previous week to display. If this is
     * true, it displays the scheduler of the previous week.
     */
    public void displayPreviousWeek() {
    }


    /**
     * Returns the ManagedProperty <code>SessionUser</code>.
     * 
     * @return the session of the user
     */
    public SessionUserBean getSessionUser() {
	return sessionUser;
    }

    /**
     * Sets the ManagedProperty <code>SessionUser</code>.
     * 
     * @param userSession
     *            session of the user
     */
    public void setSessionUser(SessionUserBean userSession) {
    }

}
