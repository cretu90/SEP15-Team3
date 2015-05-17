/**
 * This package represents the business logic of the ofCourse system.
 */
package de.OfCourse.action;

/**
 * Provides the service of editing and storing the imprint.
 * <p>
 * 
 * This class is ManagedBean and controller of the facelet
 * <code>editImprint</code>.
 * 
 * @author Tobias Fuchs
 *
 */
public class EditImprint {

    /**
     * Stores the imprint String which is edited
     */
    private String imprint;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user an the seleected
     * language.
     */
    private SessionUser sessionUser;

    /**
     * Stores the edited imprint text.<br>
     * By pressing the 'save' Button, the edited imprint text is saved and the
     * user is directed to the adminManagement page.
     * 
     * @return link back to the <code>adminManagement</code> page
     */
    public String editImprint() {
	return imprint;
    }

    /**
     * Returns the value of the attribute <code>imprint</code>.
     * 
     * @return the imprint text
     */
    public String getImprint() {
	return imprint;
    }

    /**
     * Sets the value of the attribute <code>imprint</code>.
     * 
     * @param imprint
     *            the imprint text to set
     */
    public void setImprint(String imprint) {
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
