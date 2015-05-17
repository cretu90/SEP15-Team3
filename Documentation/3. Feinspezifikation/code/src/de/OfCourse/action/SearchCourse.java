/**
 * This package represents the business logic of the ofCourse system.
 */
package de.OfCourse.action;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import de.OfCourse.model.Course;
import de.OfCourse.model.Pagination;

/**
 * Provides the service of displaying the course offer of the system and the
 * service of searching for courses in the system.<br>
 * The user can search for courses by certain parameters and a entered
 * respective search term. Furthermore this class realizes the functionality to
 * display the complete course offer of the system. In addition it is possible
 * to constrain the displayed course offer.<br>
 * This class supports pagination to display the found courses.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet <code>search</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@ViewScoped
public class SearchCourse {

    /**
     * Stores the display period that was selected by the user. With the display
     * period the user can constrain the time period in which the displayed
     * courses take place.
     */
    private String displayPeriod;

    /**
     * Stores whether the user only wants to search for free courses
     */
    private boolean searchOnlyFreeCourses;

    /**
     * Stores the the search result that is displayed on the page. In this case
     * it's a list of users.
     */
    private List<Course> searchResult;

    /**
     * Stores the search parameter that was selected by the user
     */
    private String searchParam;

    /**
     * Stores the search term that was entered by the user
     */
    private String searchTerm;

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
     * Displays the course offer of the system.<br>
     * The user can constrain by selecting a display period in which time period
     * the shown courses take place. Furthermore it is also possible to display
     * the complete course offer of the system. The courses are displayed by
     * using pagination.
     * 
     */
    public void displayCoursesInSpecificPeriod() {
    }

    /**
     * Returns the value of the attribute <code>displayPeriod</code> that stores
     * the selected display period.
     * 
     * @return the selected display period
     */
    public String getDisplayPeriod() {
	return displayPeriod;
    }

    /**
     * Sets the value of the attribute code>displayPeriod</code> that stores the
     * selected display period.
     * 
     * @param displayPeriod
     *            the selected display period
     */
    public void setDisplayPeriod(String displayPeriod) {
    }

    /**
     * Searches for courses in the system according to the selected search
     * parameter and the respective search term. <br>
     * It performs a database request with the entered search parameter and
     * search term. The search result is stored locally so it can be displayed
     * in the facelet.
     */
    public void search() {
    }

    /**
     * Returns whether only free courses are to be displayed.
     * 
     * @return whether only free courses are to be displayed
     */
    public boolean getSearchOnlyFreeCourses() {
	return searchOnlyFreeCourses;
    }

    /**
     * Returns the value of the attribute <code>searchResult</code> that stores
     * the found database entries which are to be displayed.
     * 
     * @return list of found courses
     */
    public List<Course> getSearchResult() {
	return searchResult;
    }

    /**
     * Sets the value of the attribute <code>searchResult</code> that stores the
     * found database entries which are to be displayed.
     * 
     * @param searchResult
     *            list of users found in the database for the actual search
     */
    public void setSearchResult(List<Course> searchResult) {
    }

    /**
     * Returns the value of the attribute <code>searchParam</code> that stores
     * the selected search parameter.
     * 
     * @return the selected search parameter
     */
    public String getSearchParam() {
	return searchParam;
    }

    /**
     * Sets the value of the attribute <code>searchParam</code> that stores the
     * selected search parameter.
     * 
     * @param searchParam
     *            the selected search parameter
     */
    public void setSearchParam(String searchParam) {
    }

    /**
     * Returns the value of the attribute <code>searchTerm</code> that stores
     * the entered search term.
     * 
     * @return the entered search term
     */
    public String getSearchTerm() {
	return searchTerm;
    }

    /**
     * Sets the value of the attribute <code>searchTerm</code> that stores the
     * entered search term.
     * 
     * @param searchTerm
     *            the entered search term
     */
    public void setSearchTerm(String searchTerm) {
    }

    /**
     * Redirects the user to the <code>courseDetail</code> page of a certain
     * course .
     * 
     * @return link to the course detail page
     */
    public String loadCourseDetailPageOfSelectedCourse() {
	return null;
    }

    /**
     * Realizes the sorting of certain pages(that means the entries fetched from
     * the database). This method is necessary for the paging.
     * 
     * @param columnname
     *            parameter by which the page is sorted
     * 
     */
    public void sortBySpecificColumn(String columnname) {
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
