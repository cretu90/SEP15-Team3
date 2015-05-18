/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import de.ofCourse.model.Course;
import de.ofCourse.model.User;

/**
 * Provides functionality for administrators to create and delete courses and to
 * manage the leaders of courses, so to say, to add and to remove leaders from
 * courses.
 * 
 * <p>
 * Only the administrator is able to use this functionalities.<br>
 * Especially only he has the rights to manage the leaders of courses. In order
 * to do so he has the possibility to add a new leader to a course by entering
 * the data of the leader.<br>
 * For deleting a leader from a course the administrator has to selected the
 * leader to delete. He has the possibility to remove more than one leader from a
 * course at once.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class CourseManagementBean {

    /**
     * Stores an leader that is to be added to the course.
     */
    private User leaderToAdd;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUser sessionUser;

    /**
     * Stores the entered or displayed data of the course.
     */
    private Course course;

    /**
     * Stores a list of leaders that are to be removed from the course.
     */
    private List<User> leadersToDelete;

    /**
     * Creates a new course with the entered data and returns the courseDetails
     * page.<br>
     * That means that the method creates a new database entry for the course
     * and stores it in the database.
     * 
     * @return link to the courseDetail page
     */
    public String createCourse() {
	return null;
    }

    /**
     * Uploads a selected picture file from the local system to the server. The
     * picture needs to be a .jpg <br>
     */
    public void uploadCoursePic() {
    }

    /**
     * Deletes the actual displayed course from the system and returns the link
     * to the next page.<br>
     * That means that the method deletes the course from the database. All
     * course units of this course are deleted as well. The money that the
     * participants have paid for the course units is automatically transfered
     * back to their accounts.
     * 
     * @return link to next page
     */
    public String deleteCourse() {
	return null;
    }

    /**
     * Adds the selected course leaders to the course.<br>
     * That means the leaders are to the the courseAdmins list and the database
     * entry of the course is updated.
     */
    public void addCourseLeader() {
    }

    /**
     * Does some initializing work.
     */
    public void init(){}
    
    /**
     * Returns the value of the attribute <code>leaderToAdd</code>.
     * 
     * @return the leader that is to be added to the course
     */
    public User getLeaderToAdd() {
	return leaderToAdd;
    }

    /**
     * Sets the value of the attribute <code>leaderToAdd</code>.
     * 
     * @param leaderToAdd
     *            the new leader to add
     */
    public void setLeaderToAdd(User leaderToAdd) {
    }

    /**
     * Removes the selected course leaders from the course.<br>
     * That means the leaders are removed from the courseAdmins list and the
     * database entry of the course is updated.
     */
    public void removeCourseLeaders() {
    }

    /**
     * Returns the value of the attribute <code>leadersToDelete</code> that
     * stores the leaders the are selected and shall be deleted.
     * 
     * @return list of leaders
     */
    public List<User> getLeadersToDelete() {
	return leadersToDelete;
    }

    /**
     * Sets the value of the attribute <code>leadersToDelete</code>.
     * 
     * @param leadersToDelete
     *            new list of leaders
     */
    public void setLeadersToDelete(List<User> leadersToDelete) {
    }

    /**
     * Returns the value of the attribute <code>course</code>.
     * 
     * @return the course
     */
    public Course getCourse() {
	return course;
    }

    /**
     * Sets the value of the attribute <code>course</code>.
     * 
     * @param course
     *            the new value of the attribute course
     */
    public void setCourse(Course course) {
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
