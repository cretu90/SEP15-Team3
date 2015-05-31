/**
 * This package represents system functionality. 
 */
package de.ofCourse.system;

import java.util.List;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Represents a PhaseListener that is responsible for blocking unauthorized
 * access to a certain page.<br>
 * It prevents users from getting to a certain page without having the required
 * rights.
 * 
 * <p>
 * In case a user requests a page without having the necessary rights, he is
 * redirected to the start page of the system.<br>
 * CheckPhase implements the interface <code>PhaseListener</code>.
 * 
 * @author Tobias Fuchs
 *
 */
public class CheckPhase implements PhaseListener {

    /**
     * Default serial version id
     */
    private static final long serialVersionUID = -5454041563674183939L;

    /**
     * List that contains the pages accessible for an anonymous user.
     */
    private List<String> pageListForAnonymousUsers;

    /**
     * List that contains the pages accessible for a registered user.
     */
    private List<String> pageListForRegisteredUsers;

    /**
     * List that contains the pages accessible for course leader.
     */
    private List<String> pageListForCourseLeaders;

    /**
     * List that contains the pages accessible for an system administrator.
     */
    private List<String> pageListForAdministrators;

    /**
     * Constructor of the class <code>CheckPhase</code>.<br>
     * It fills the lists with the pages a user with a specific user role is
     * allowed to access.
     */
    public CheckPhase() {
	// TODO: CheckPhase Construtor
    }

    /**
     * Handles the check whether the user has the required rights to get to the
     * requested page.<br>
     * If the user has this rights, he is directed to the requested page.<br>
     * Otherwise he is redirected to the start page of the system.
     * 
     * @param event
     *            the phase events
     */
    @Override
    public void afterPhase(PhaseEvent event) {
	// TODO CheckPhase afterPhase()

    }

    /**
     * Handle a notification that the processing for a particular phase of the
     * request processing life cycle is about to begin.
     * 
     * @param event
     *            the phase events
     */
    @Override
    public void beforePhase(PhaseEvent event) {
	// TODO CheckPhase beforePhase()

    }

    /**
     * Returns the identifier of the request processing phase during which this
     * listener is interested in processing PhaseEvent events.
     * 
     * @return the id of the <code>RESTORE_VIEW</code> phase
     */
    @Override
    public PhaseId getPhaseId() {
	return PhaseId.RESTORE_VIEW;
    }

    /**
     * Redirects to the specified path.
     * 
     * @param redirectPath
     *            The path to redirect to
     */
    private void redirect(String redirectPath) {
	FacesContext context = FacesContext.getCurrentInstance();
	NavigationHandler navHandler = context.getApplication()
		.getNavigationHandler();
	navHandler.handleNavigation(context, null, redirectPath
		+ "?faces-redirect=true");
    }

    /**
     * @param context
     * @return
     */
    private boolean isAccessPermittedAnonymous(FacesContext context) {
	boolean permitted = false;
	//TODO: CheckPhase isPermitted
	return permitted;
    }

    /**
     * @param context
     * @return
     */
    private boolean isAccessPermittedRegistered(FacesContext context) {
	boolean permitted = false;
	//TODO: CheckPhase isPermitted
	return permitted;
    }

    /**
     * @param context
     * @return
     */
    private boolean isAccessPermittedCourseLeader(FacesContext context) {
	boolean permitted = false;
	//TODO: CheckPhase isPermitted
	return permitted;
    }

    /**
     * @param context
     * @return
     */
    private boolean isAccessPermittedAdministrator(FacesContext context) {
	boolean permitted = false;
	//TODO: CheckPhase isPermitted
	return permitted;
    }

}
