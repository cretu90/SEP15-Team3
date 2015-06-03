/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import de.ofCourse.model.Course;
import de.ofCourse.model.PaginationData;

/**
 * Displays the courses that are attended by a certain user and offers the user
 * the possibility to go to the details pages pages of the courses he attends.
 * <p>
 * 
 * Supports pagination to display the courses.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>myCourses</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@ViewScoped
public class MyCoursesBean implements Pagination {

    /**
     * List of courses that the user attends
     */
    private List<Course> registeredCourses;

    /**
     * This attribute represents a pagination object. It stores all the
     * information that is necessary for pagination, e.g. the number of elements
     * per page.
     */
    private PaginationData pagination;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUserBean sessionUser;

    /**
     * Returns a list of courses that the user attends
     * 
     * @return list of courses the user attends
     */
    public List<Course> getRegisteredCourses() {
	return registeredCourses;
    }


    /**
     * Sets the value of the attribute <code>registeredCourses</code>.
     * 
     * @param registeredCourses
     *            list of courses the user attends
     */
    public void setRegisteredCourses(List<Course> registeredCourses) {
    }

    /**
     * Redirects the user to the <code>courseDetail</code> page of the selected
     * course.
     * 
     * @return link to the <code>courseDetail</code> page
     */
    public String loadCourseDetailsPageOfSelectedCourse() {
	return null;
    }

    /**
     * {@inheritDoc}}
     */
    @Override
    public int getActualPageNumber() {
	return 0;
    }

    /**
     * {@inheritDoc}}
     */
    @Override
    public void goToSpecificPage() {
    }

    /**
     * {@inheritDoc}}
     */
    @Override
    public void sortBySpecificColumn(String columnname) {
	// TODO Auto-generated method stub

    }
    
    /**
     * Returns the value of the attribute <code>pagination</code>.
     * 
     * @return the pagination object, that stores the information for pagination
     */
    public PaginationData getPagination() {
	return pagination;
    }

    /**
     * Sets the value of the attribute <code>pagination</code>.
     * 
     * @param pagination
     *            the new pagination object, that stores the information for
     *            pagination
     */
    public void setPagination(PaginationData pagination) {
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
