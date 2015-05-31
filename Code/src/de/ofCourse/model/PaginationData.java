/**
 * This package represents all the models which are used
 */
package de.ofCourse.model;

import java.io.Serializable;

/**
 * Contains all information for the pagination progress
 * 
 * @author Sebastian
 *
 */
public class PaginationData implements Serializable {

    /**
     * Stores the number of items shown on one page.
     */
    private int itemsPerPage;
    /**
     * Stores the current displayed page.
     */
    private int shownPageNum;
    /**
     * Stores the displayed column name the page is sorted
     */
    private String sortColumn;
    /**
     * Stores whether the displayed data in ascending order or not
     */
    private boolean sortAsc;

    /**
     * Number of pages to display
     */
    private int numberOfPages;

    /**
     * Returns the number of pages that are displayed.
     * 
     * @return the number of pages
     */
    public int getNumberOfPages() {
	return numberOfPages;
    }

    /**
     * Sets the number of pages that are displayed.
     * 
     * @param numberOfPages
     *            the number of pages
     */
    public void setNumberOfPages(int numberOfPages) {
	this.numberOfPages = numberOfPages;
    }

    /**
     * Returns the value of the attribute <code>itemsPerPage</code>.
     * 
     * @return the number of items shown on one page
     */
    public int getItemsPerPage() {
	return itemsPerPage;
    }

    /**
     * Sets the value of the attribute <code>itemsPerPage</code>.
     * 
     * @param itemsPerPage
     *            new amount of items which are shown on the page
     */
    public void setItemsPerPage(int itemsPerPage) {
	this.itemsPerPage = itemsPerPage;
    }

    /**
     * Returns the value of the attribute <code>shownPageNum</code>.
     * 
     * @return the page number currently displayed
     */
    public int getShownPageNum() {
	return shownPageNum;
    }

    /**
     * Sets the value of the attribute <code>shownPageNum</code>.
     * 
     * @param shownPageNum
     *            new Page Number which is shown
     */
    public void setShownPageNum(int shownPageNum) {
	this.shownPageNum = shownPageNum;
    }

    /**
     * Returns the value of the attribute <code>sortColum</code>.
     * 
     * @return the displayed column name the page is sorted
     */
    public String getSortColumn() {
	return sortColumn;
    }

    /**
     * Sets the value of the attribute <code>sortColum</code>.
     * 
     * @param sortColumn
     *            new column name the page should sort
     */
    public void setSortColumn(String sortColumn) {
	this.sortColumn = sortColumn;
    }

    /**
     * Returns the value of the attribute <code>sortAsc</code>.
     * 
     * @return whether the displayed data in ascending order or not
     */
    public boolean isSortAsc() {
	return sortAsc;
    }

    /**
     * Sets the value of the attribute <code>sortAsc</code>.
     * 
     * @param sortAsc
     *            whether the data is sorted ascending or not
     */
    public void setSortAsc(boolean sortAsc) {
	this.sortAsc = sortAsc;
    }

}
