/**
 * This package represents all the models which are used
 */
package de.ofCourse.model;

/**
 * Contains all information for the pagination progress
 * 
 * @author Sebastian
 *
 */
public class PaginationData {

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
     * @return the itemsPerPage
     */
    public int getItemsPerPage() {
	return itemsPerPage;
    }

    /**
     * @param itemsPerPage
     *            the itemsPerPage to set
     */
    public void setItemsPerPage(int itemsPerPage) {
	this.itemsPerPage = itemsPerPage;
    }

    /**
     * @return the shownPageNum
     */
    public int getShownPageNum() {
	return shownPageNum;
    }

    /**
     * @param shownPageNum
     *            the shownPageNum to set
     */
    public void setShownPageNum(int shownPageNum) {
	this.shownPageNum = shownPageNum;
    }

    /**
     * @return the sortColumn
     */
    public String getSortColumn() {
	return sortColumn;
    }

    /**
     * @param sortColumn
     *            the sortColumn to set
     */
    public void setSortColumn(String sortColumn) {
	this.sortColumn = sortColumn;
    }

    /**
     * @return the sortAsc
     */
    public boolean isSortAsc() {
	return sortAsc;
    }

    /**
     * @param sortAsc
     *            the sortAsc to set
     */
    public void setSortAsc(boolean sortAsc) {
	this.sortAsc = sortAsc;
    }

}
