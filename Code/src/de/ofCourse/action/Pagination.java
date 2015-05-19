/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

/**
 * @author Tobias Fuchs
 *
 */
public interface Pagination {



    /**
     * Returns the number of the actual displayed page.<br>
     * This method is necessary for the paging.
     * 
     * @return the number of the actual displayed page
     */
    public int getActualPageNumber();

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
    public void sortBySpecificColumn(String columnname);

}
