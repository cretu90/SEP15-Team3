/**
 * 
 */
package de.OfCourse.action;

/**
 * @author Fuchs
 *
 */
public class SystemConfiguration {

    private String accountActivationType;
    private float overdraftCredit;
    private System system;
    private SessionUser sessionUser;

    public void determineAccountActivationType() {
    }

    public String getAccountActivationType() {
	return accountActivationType;
    }

    public void setAccountActivationType(String accountActivationType) {
    }

    public void determineOverdraftCredit() {
    }

    public float getOverdraftCredit() {
	return overdraftCredit;
    }

    public void setOverdraftCredit(float overdraftCredit) {
    }

    public void uploadCustomStyleCSS() {
    }

    public void uploadLogo() {
    }

    public String loadEditImprintPage() {
	return null;
    }

    public String loadCreateNewUserPage() {
	return null;
    }

    public String loadManageUserPage() {
	return null;
    }

    public String loadCreateNewCoursePage() {
	return null;
    }

    public String loadManageCoursesPage() {
	return null;
    }

    public String loadStatisticPage() {
	return null;
    }

    public System getSystem() {
	return system;
    }

    public void setSystem(System system) {
    }

    public SessionUser getSessionUser() {
	return sessionUser;
    }

    public void setSessionUser(SessionUser userSession) {
    }

}
