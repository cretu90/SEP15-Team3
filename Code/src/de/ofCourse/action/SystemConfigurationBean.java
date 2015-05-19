/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Provides the functionalities for the administrator relating to the system,
 * like registration management or payment settings.
 * 
 * <p>
 * Furthermore it is responsible for directing the user to sites where the
 * administrator can manage the users of the system, like creating new users or
 * to sites where he can manage the courses of the system, like creating a new
 * course.
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>adminManagement</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class SystemConfigurationBean {

    /**
     * Stores the type of account activation that was selected by the
     * administrator.
     */
    private String accountActivationType;

    /**
     * Stores the overdraft credit that was granted by the administrator
     */
    private float overdraftCredit;

    /**
     * This system object stores system information and files that belong to the
     * system
     */
    private System system;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user an the selected
     * language.
     */
    private SessionUserBean sessionUser;

    /**
     * Determines the type of account activation, that means it updates the
     * setting relating to account activation in the database.
     */
    public void determineAccountActivationType() {
    }

    /**
     * Returns the value of the attribute <code>accountActivationType</code>
     * that stores the selected type of account activation.
     * 
     * @return the selected account activation type
     */
    public String getAccountActivationType() {
	return accountActivationType;
    }

    /**
     * Sets the value of the attribute <code>accountActivationType</code> that
     * stores the selected type of account activation.
     * 
     * @param accountActivationType
     *            the new type of account activation
     */
    public void setAccountActivationType(String accountActivationType) {
    }

    /**
     * Determines the granted overdraft credit, that means it updates the
     * setting relating to overdraft credit in the database.
     */
    public void determineOverdraftCredit() {
    }

    /**
     * Returns the value of the attribute <code>overdraftCredit</code> that
     * stores the granted overdraft credit.
     * 
     * @return the granted credit
     */
    public float getOverdraftCredit() {
	return overdraftCredit;
    }

    /**
     * Sets the value of the attribute <code>overdraftCredit</code> that stores
     * the the granted credit.
     * 
     * @param overdraftCredit
     *            the new overdraft credit
     */
    public void setOverdraftCredit(float overdraftCredit) {
    }

    /**
     * Redirects the user to a page where a new user can be created.
     * 
     * @return link to <code>createUser</code> page
     */
    public String loadCreateNewUserPage() {
	return null;
    }

    /**
     * Redirects the user to a page where he can managed the users of the
     * system.
     * 
     * @return link to next page
     */
    public String loadManageUserPage() {
	return null;
    }

    /**
     * Redirects the user to a page where a new course can be created.
     * 
     * @return link to <code>createCourse</code> page
     */
    public String loadCreateNewCoursePage() {
	return null;
    }

    /**
     * Redirects the user to a page where he can managed the courses of the
     * system.
     * 
     * @return link to next page
     */
    public String loadManageCoursesPage() {
	return null;
    }

    /**
     * Returns the value of the attribute <code>system</code>.
     * 
     * @return the system object
     */
    public System getSystem() {
	return system;
    }

    /**
     * Sets the value of the attribute <code>system</code>.
     * 
     * @param system
     *            the new system object.
     */
    public void setSystem(System system) {
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
