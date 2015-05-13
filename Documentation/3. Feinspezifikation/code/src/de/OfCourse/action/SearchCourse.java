package de.OfCourse.action;

import java.util.List;

import de.OfCourse.model.Course;
import de.OfCourse.model.Pagination;

public class SearchCourse {

    private String displayPeriod;
    private boolean searchOnlyFreeCourses;
    private String searchTerm;
    private String searchParam;
    private List<Course> searchResult;
    private Pagination pagination;
    private SessionUser sessionUser;

    public void displayCoursesInSpecificPeriod() {
    }

    public String getDisplayPeriod() {
	return displayPeriod;
    }

    public void setDisplayPeriod(String displayPeriod) {
    }

    public void search() {
    }

    public boolean getSearchOnlyFreeCourses() {
	return searchOnlyFreeCourses;
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

    public List<Course> getSearchResult() {
	return searchResult;
    }

    public void setSearchResult(List<Course> searchResult) {
    }

    public String loadCourseDetailsPageOfSelectedCourse() {
	return null;
    }

    public void sortBySpecificColumn() {
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
	return null;
    }

    public void setSessionUser(SessionUser userSession) {
    }

}
