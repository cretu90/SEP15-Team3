/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.model.Pagination;
import de.OfCourse.model.User;

/**
 * @author Fuchs
 *
 */
public class ListParticipents {
    
    private List<User> participients;
    private List<User> usersToDelete;
    private Pagination pagination;
    private SessionUser sessionUser;
    
    public List<User> getParticipients(){
	return participients;}
    public void setParticipients(List<User> participients){}
    public void deleteUsersFromCourse(){}
    public List<User> getUsersToDelete(){
	return usersToDelete;}
    public void setUsersToDelete(List<User> usersToDelete){}
    public String cancel(){
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
