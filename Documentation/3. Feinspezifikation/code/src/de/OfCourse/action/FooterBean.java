/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Implements the forwarding to AGB page, imprint page and help page.<br>
 * <p>
 * This is the ManagedBean and Controller of the facelet <code>footer</code>.
 * 
 * @author Tobias Fuchs
 * 
 */
@ManagedBean
@RequestScoped
public class FooterBean {
    
    
    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUserBean sessionUser;

    /**
     * Redirects to the imprint page.
     * 
     * @return link to imprint page
     */
    public String loadImprintPage() {
	return null;
    }

    /**
     * Redirects to the AGB page.
     * 
     * @return link to AGB page
     */
    public String loadAGBPage() {
	return null;
    }

    /**
     * Redirects to the help page.
     * 
     * @return link to help page
     */
    public String loadHelpPage() {
	return null;
    }
    
    /**
     * Returns the ManagedProperty <code>SessionUser</code>.
     * 
     * @return the session of the user
     */
    public SessionUserBean getSessionUser() {
	return sessionUser;
    }

    /**
     * Sets the ManagedProperty <code>SessionUser</code>.
     * 
     * @param userSession
     *            session of the user
     */
    public void setSessionUser(SessionUserBean userSession) {
    }

}
