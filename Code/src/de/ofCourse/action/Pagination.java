/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import de.ofCourse.model.PaginationData;

/**
 * Provides the service of pagination for the system <code>ofCourse</code>.<br>
 * That means that only a fixed number of data sets are displayed at once on the
 * current page.
 * <p>
 * 
 * The user has the possibility to browse through the different pages. <br>
 * In order to ensure the performance of the system only the entries that are to
 * display on the requested page of pagination are fetched from the database.
 * <p>
 * 
 * This Interface is implemented by some classes that represent the business
 * logic of the system, more precisely in the ManagedBeans of the package
 * <code>de.ofCourse.action</code>.
 * 
 * @author Tobias Fuchs
 *
 */
public interface Pagination {


    /**
     * Realizes the display of certain pages, that means only a fixed number of
     * database entries are presented at once. Furthermore it is responsible for
     * the navigation between the pages, especially for getting the next page,
     * the previous page or to jump to a specific page.
     * 
     */
    public void goToSpecificPage();

    /**
     * Realizes the sorting of certain pages(that means the entries fetched from
     * the database). This method is necessary for the paging.
     * 
     * @param columnname
     *            parameter by which the page is sorted
     * 
     */
    public void sortBySpecificColumn();
    
    /**
     * Returns the value of the attribute <code>pagination</code>.
     * 
     * @return the pagination object, that stores the information for pagination
     */
    public PaginationData getPagination();

    /**
     * Sets the value of the attribute <code>pagination</code>.
     * 
     * @param pagination
     *            the new pagination object, that stores the information for
     *            pagination
     */
    public void setPagination(PaginationData pagination);

}
