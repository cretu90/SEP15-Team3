/**
 * 
 */
package de.OfCourse.model;

/**
 * @author
 *
 */
public class Pagination {

    /**
     * 
     */
    private int itemsPerPage;
    /**
     * 
     */
    private int shownPageNum;
    /**
     * 
     */
    private String sortColumn;
    /**
     * 
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
