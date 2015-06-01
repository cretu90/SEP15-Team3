/**
 * This package represents system functionality. 
 */
package de.ofCourse.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.application.NavigationHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
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

		// Fetches the FacesContext parameters
		FacesContext fctx = event.getFacesContext();
		ExternalContext ctx = fctx.getExternalContext();
		Map<String, Object> sessionMap = ctx.getSessionMap();
		String servletPath = ctx.getRequestServletPath();

		// Is the user on the login page?
		boolean loginPage = false;
		UIViewRoot viewRoot = fctx.getViewRoot();
		if (viewRoot != null) {
			loginPage = fctx.getViewRoot().getViewId().endsWith("authenticate.xhtml");
		}

		// Is the user already authenticated?
		boolean loggedIn = sessionMap.containsKey("loggedin");
		
		//Fetch data from session
		

	
		

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
	 * Returns whether the given url contains a String from a list.
	 * 
	 * @param pages
	 *            list of Strings
	 * @param url
	 *            the url as String
	 * @return <code>true</code>, if the url contains one of the Strings<br>
	 *         <code>false</code>, otherwise
	 */
	private boolean urlContainsPageName(ArrayList<String> pages, String url) {
		boolean contains = false;

		for (int i = 0; i < pages.size() && !contains; ++i) {
			if (url.contains(pages.get(i))) {
				contains = true;
			}
		}
		return contains;
	}

}
