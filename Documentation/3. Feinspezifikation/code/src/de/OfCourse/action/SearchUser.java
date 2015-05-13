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
public class SearchUser {

    private List<User> searchResult;
    private String searchParam;
    private String searchTerm;
    private Pagination pagination;
    private SessionUser sessionUser;

    public void search() {
    }

    public List<User> getSearchResult() {
	return searchResult;
    }

    public void setSearchResult(List<User> searchResult) {
    }

    public String getSearchParam() {
	return searchParam;
    }

    public void setSearchParam(String searchParam) {
    }

    public String getSearchTerm() {
	return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
    }

    public String loadUserProfilPageOfSelectedUser() {
	return null;
    }

    public void sortBySpecificColumn(String columnname) {
    }

    public int getActualPageNumber() {
	return 0;
    }

    public void goToSpecificPage() {
    }

    public Pagination getPagination() {
	return pagination;
    }

    public void setPagination(Pagination pagination) {
    }

    public SessionUser getSessionUser() {
	return sessionUser;
    }

    public void setSessionUser(SessionUser userSession) {
    }

}
