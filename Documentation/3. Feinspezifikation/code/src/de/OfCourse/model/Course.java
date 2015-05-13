/**
 * 
 */
package de.OfCourse.model;

import java.util.Date;
import java.util.List;

/**
 * @author
 *
 */
public class Course {

    private String title;
    private String description;
    private CourseUnit nextCourseUnit;
    private Date startdate;
    private Date enddate;
    private int maxUsers;
    private String courseImage;
    private List<CourseUnit> courseUnits;
    private List<User> courseAdmins;
    private List<User> users;
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

}
