/**
 * 
 */
package de.ofCourse.model;

import java.util.Date;
import java.util.List;

/**
 * This class contains all inforamtion about a Course
 * 
 * @author Sebastian
 *
 */
public class Course {

    private int courseID;
    
    /**
     * title, the coursetitel
     * 
     */
    private String title;
    /**
     * description, the description of the course (could include information,
     * needed equipment etc)
     * 
     */
    private String description;
    /**
     * nextCourseUnit, the next CourseUnit of the Course which will be hold.
     * 
     */
    private CourseUnit nextCourseUnit;
    /**
     * startdate, the Date when the Course will start.
     * 
     */
    private Date startdate;
    /**
     * enddate, the Date when the Course will end.
     * 
     */
    private Date enddate;
    /**
     * maxUsers, the maximal amount of Users the Course can handle.
     * 
     */
    private int maxUsers;
    /**
     * courseImage, the Logo of the Course
     */
    private String courseImage;
    /**
     * courseUnits, a List of the CourseUnits which the Course provides
     * 
     */
    private List<CourseUnit> courseUnits;
    /**
     * courseAdmins, a list of courseAdmins who can hold and create CourseUnits
     * of the Course
     * 
     */
    private List<User> courseAdmins;
    /**
     * users, a list of users who participate in the course
     * 
     */
    private List<User> users;
    /**
     * usersToInform, list of users who wanted to be inform about changes in the
     * course
     * 
     */
    private List<User> usersToInform;

    public String getTitle() {
	return title;
    }

    public String getDescription() {
	return description;
    }

    public CourseUnit getNextCourseUnit() {
	return nextCourseUnit;
    }

    public Date getStartdate() {
	return startdate;
    }

    public Date getEnddate() {
	return enddate;
    }

    public int getMaxUsers() {
	return maxUsers;
    }

    public String getCourseImage() {
	return courseImage;
    }

    public List<CourseUnit> getCourseUnits() {
	return courseUnits;
    }

    public List<User> getCourseAdmins() {
	return courseAdmins;
    }

    public List<User> getUsers() {
	return users;
    }

    public List<User> getUsersToInform() {
	return usersToInform;
    }

    public void setTitle(String title) {
    }

    public void setDescription(String description) {
    }

    public void setNextCourseUnit(CourseUnit nextCourseUnit) {
    }

    public void setStartdate(Date startDate) {
    }

    public void setEnddate(Date endDate) {
    }

    public void setMaxUsers(int maxUsers) {
    }

    public void setCourseUnits(List<CourseUnit> courseUnits) {
    }

    public void setCourseAdmins(List<User> coursAdmins) {
    }

    public void setUsers(List<User> users) {
    }

    public void setUsersToInform(List<User> usersToInform) {
    }

    public void setCourseImage(String image) {
    }

    /**
     * @return the courseID
     */
    public int getCourseID() {
	return courseID;
    }

    /**
     * @param courseID the courseID to set
     */
    public void setCourseID(int courseID) {
	this.courseID = courseID;
    }

}
