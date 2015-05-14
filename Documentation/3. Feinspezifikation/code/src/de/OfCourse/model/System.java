/**
 * 
 */
package de.OfCourse.model;

/**
 * This class contains all information which are relevant for the System
 * @author Sebastian
 *
 */
public class System {

    /**
     * css, the css which defines the look of the WebSite
     */
    private String css;
    /**
     * imprint, the Impressum for the WebSite
     */
    private String imprint;
    /**
     * logo, the Logo of the Company or club
     */
    private String logo;
    /**
     * title, the title of the company or club
     */
    private String title;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {
	return false;
    }

    /**
     * @return
     */
    public String getCSS() {
	return this.css;
    }

    /**
     * @return
     */
    public String getImprint() {
	return this.imprint;
    }

    /**
     * @return
     */
    public String getLogo() {
	return this.logo;
    }

    /**
     * @return
     */
    public String getTitle() {
	return this.title;
    }

    /**
     * @param css
     */
    public void setCss(String css) {
	this.css = css;
    }

    /**
     * @param imprint
     */
    public void setImprint(String imprint) {
	this.imprint = imprint;
    }

    /**
     * @param logo
     */
    public void setLogo(String logo) {
	this.logo = logo;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
	this.title = title;
    }

}
