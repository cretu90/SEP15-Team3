/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.model.Course;
import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class CourseManagement {

    private User leaderToAdd;
    private SessionUser sessionUser;
    private Course course;
    private List<User> leadersToDelete;

    public String createCourse() {
	return null;
    }

    public void uploadCoursePic() {
    }

    public String deleteCourse() {
	return null;
    }

    public void addCourseLeader() {
    }

    public User getLeaderToAdd() {
	return leaderToAdd;
    }

    public void setLeaderToAdd(User leaderToAdd) {
    }

    public void removeCourseLeaders() {
    }

    public List<User> getLeadersToDelete() {
	return leadersToDelete;
    }

    public void setLeadersToDelete(List<User> leadersToDelete) {
    }

    public Course getCourse() {
	return course;
    }

    public void setCourse(Course course) {
    }

    public SessionUser getSessionUser() {
	return sessionUser;
    }

    public void setSessionUser(SessionUser userSession) {
    }
}
