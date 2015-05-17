/**
 * This package represents the business logic of the ofCourse system.
 */
package de.OfCourse.action;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import de.OfCourse.model.CourseUnit;
import de.OfCourse.model.Cycle;
import de.OfCourse.model.Pagination;
import de.OfCourse.model.User;

/**
 * Provides functionality for course leaders to create, edit and delete course
 * units and to manage the users of the course unit, so to say, to add and to
 * remove users from course unit.
 * <p>
 * 
 * Only course leaders and administrators are able to use this functionalities.<br>
 * Especially only they have the rights to manage the users of a course unit. In
 * order to do so they have the possibility to add a new user to a course unit
 * by entering the data of the user. This user need not to pay for this course
 * unit<br>
 * For deleting a users from a course unit the course leader has to selected the
 * user to delete. He has the posibility to remove more than one user from a
 * course at once.
 * <p>
 * Furthermore this class offers the funtionality to create and edit course
 * units that take place regularly at once.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>editCourseUnit</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@ViewScoped
public class CourseUnitManagement {

    /**
     * Stores an user that is to be added to the course unit.
     */
    private User userToAdd;

    /**
     * Stores a list of users that are to be removed from the course unit.
     */
    private List<User> usersToDelete;

    /**
     * Stores whether a course unit takes place regularly.
     */
    private boolean isRegularCourseUnit;

    /**
     * Stores the cycle of a course unit. That means if the course unit takes
     * place regularly, this attribute stores the start date of the unit, the
     * turnus of repetition and the number of course units.
     */
    private Cycle cycleOfCourseUnit;

    /**
     * Stores the entered or displayed data of the course unit.
     */
    private CourseUnit courseUnit;

    /**
     * Sstores the participants of the course unit.
     */
    private List<User> participientsOfCourseUnit;

    /**
     * This attribute represents a pagination object. It stores all the
     * information that is necessary for pagination, e.g. the number of elements
     * per page.
     */
    private Pagination pagination;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUser sessionUser;

    /**
     * Creates a new course unit with the entered data and returns the link to
     * the updated course details page. That means that the method creates a new
     * database entry for the course unit and stores it in the database.<br>
     * By selecting that the course unit takes place regularly and entering
     * information relating to the cycle of the course units, it is possible to
     * create more reagular course units at once.
     * 
     * @return link to the courseDetails page
     */
    public String createCourseUnit() {
	return null;
    }

    /**
     * Realizes the editing of a course unit that takes place not regularly.<br>
     * Editing the course unit means that the database entry of the course unit
     * is updated updated with the entered data.
     * 
     * @return the link to this page
     */
    public String editCourseUnit() {
	return null;
    }

    /**
     * Realizes the editing of a course unit that takes place regularly.<br>
     * If <code>editAllIfRegular</code> is <code>true</code>, all course units
     * in the cycle of this course unit are edited.<br>
     * If <code>editAllIfRegular</code> is <code>false</code>, only this course
     * unit is edited.<br>
     * Editing the course unit means that the database entry(ies) of the course
     * unit(s) is updated.<br>
     * After the edit, the participants recieve a message to inform about the
     * changes.
     * 
     * @param editAllIfRegular
     *            whether all course units of the cycle are to be edited
     * @return the link to this page
     */
    public String saveCourseUnit(boolean editAllIfRegular) {
	return null;
    }

    /**
     * Deletes the course unit from the course and returns the link to the
     * course details page.<br>
     * That means that the method deletes the course unit from the database. The
     * money that the participants have paid for the course units is
     * automatically transfered back to their accounts.
     * 
     * @param deleteAllIfRegular
     *            whether the course unit takes place regularly or not
     * @return link to the course details page
     */
    public String deleteCourseUnit(boolean deleteAllIfRegular) {
	return null;
    }

    /**
     * Adds the entered user to the course unit. That means the user is added to
     * the participants list and the database entry of the course unit is
     * updated. In this case the user need not to pay for the course unit.
     */
    public void addUserToCourseUnit() {
    }

    /**
     * Returns the value of the attribute <code>userToAdd</code>.
     * 
     * @return the user to add to the course unit
     */
    public User getUserToAdd() {
	return userToAdd;
    }

    /**
     * Sets the value of the attribute <code>usersToAdd</code>.
     * 
     * @param userToAdd
     *            the new user that is to be added to the course unit
     */
    public void setUserToAdd(User userToAdd) {
    }

    /**
     * Deletes the selected users from the course unit and transfer the paid
     * price for the course unit automatically back to the accounts of the
     * participants.<br>
     * Deleting means the users are removed from the participants list and the
     * database entry of the course unit is updated.
     */
    public void deleteUsersFromCourseUnit() {
    }

    /**
     * Returns the value of the attribute <code>usersToDelete</code> that stores
     * the users that are selected and shall be deleted from the course unit.
     * 
     * @return list of users to delete from the course unit
     */
    public List<User> getUserToDelete() {
	return usersToDelete;
    }

    /**
     * Sets the value of the attribute <code>usersToDelete</code> that stores
     * the users that are selected and shall be deleted from the course unit.
     * 
     * @param usersToDelete
     *            new list of users to delete from the course unit
     */
    public void setUsersToDelete(List<User> usersToDelete) {
    }

    /**
     * Returns whether a course unit takes place regularly.
     * 
     * @return boolean whether a course unit takes place regularly
     */
    public boolean getIsRegularCourseUnit() {
	return isRegularCourseUnit;
    }

    /**
     * Returns the value of the attribute <code>cycle</code> of the course unit.
     * 
     * @return the cycle of the course unit
     */
    public Cycle getCylceOfCourseUnit() {
	return cycleOfCourseUnit;
    }

    /**
     * Sets the value of the attribute <code>cycle</code> of the course unit.
     * 
     * @param cycle
     *            the new cycle of the course unit
     */
    public void setCylceOfCourseUnit(Cycle cycle) {
    }

    /**
     * Returns the value of the attribute <code>courseUnit</code>.
     * 
     * @return the course unit
     */
    public CourseUnit getCourseUnit() {
	return courseUnit;
    }

    /**
     * Sets the value of the attribute <code>courseUnit</code>.
     * 
     * @param courseUnit
     *            the new value of the attribute courseUnit
     */
    public void setCourseUnit(CourseUnit courseUnit) {
    }

    /**
     * Returns the value of the attribute <code>participientsOfCourseUnit</code>
     * .
     * 
     * 
     * @return list of participants
     */
    public List<User> getParticipientsOfCourseUnit() {
	return participientsOfCourseUnit;
    }

    /**
     * Sets the value of the attribute <code>participientsOfCourseUnit</code>.
     * 
     * @param participients
     *            the new paricipants list
     */
    public void setParticipientsOfCourseUnit(List<User> participients) {
    }

    /**
     * Returns the number of the actual displayed page.<br>
     * This method is necessary for the paging.
     * 
     * @return the number of the actual displayed page
     */
    public int getActualPageNumber() {
	return 0;
    }

    /**
     * Realizes the display of certain pages, that means only a fixed number of
     * database entries are presented at once. Furthermore it is responsible for
     * the navigation between the pages, especially for getting the next page,
     * the previous page or to jump to a specific page.
     */
    public void goToSpecificPage() {
    }

    /**
     * Returns the value of the attribute <code>pagination</code>.
     * 
     * @return the pagination object, that stores the information for pagination
     */
    public Pagination getPagination() {
	return pagination;
    }

    /**
     * Sets the value of the attribute <code>pagination</code>.
     * 
     * @param pagination
     *            the new pagination object, that stores the information for
     *            pagination
     */
    public void setPagination(Pagination pagination) {
    }

    /**
     * Returns the ManagedProperty <code>SessionUser</code>.
     * 
     * @return the session of the user
     */
    public SessionUser getSessionUser() {
	return sessionUser;
    }

    /**
     * Sets the ManagedProperty <code>SessionUser</code>.
     * 
     * @param userSession
     *            session of the user
     */
    public void setSessionUser(SessionUser userSession) {
    }

}
