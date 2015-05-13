/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.model.Course;
import de.OfCourse.model.Pagination;

/**
 * @author Fuchs
 *
 */
public class MyCourses {
    
    private List<Course> registeredCourses;
    private Pagination pagination;
    private SessionUser sessionUser;

    public List<Course> getRegisteredCourses(){
	return registeredCourses;}
    public void setRegisteredCourses(List<Course> registeredCourses){}
    public String loadCourseDetailsPageOfSelectedCourse(){
	return null;}
    public int getActualPageNumber(){
	return 0;}
    public void goToSpecificPage(){}
    public Pagination getPagination(){
	return pagination;}
    public void setPagination(Pagination pagination){}
    public SessionUser getSessionUser(){
	return sessionUser;}
    public void setSessionUser(SessionUser userSession){}
    
}
