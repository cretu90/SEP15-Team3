/**
 * 
 */
package de.OfCourse.action;

import de.OfCourse.model.Pagination;

/**
 * @author Fuchs
 *
 */
public class IncomeStatistics {

    private String displayParam;
    private Pagination pagination;
    private SessionUser sessionUser;

    public String displayStatistic() {
	return null;
    }

    public String getDisplayParam() {
	return displayParam;
    }

    public void setDisplayParam(String displayParam) {
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
