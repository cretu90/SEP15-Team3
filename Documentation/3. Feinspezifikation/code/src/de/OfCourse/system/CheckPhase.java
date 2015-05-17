/**
 * This package represents system functionality. 
 */
package de.OfCourse.system;

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
	// TODO Auto-generated method stub

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
	// TODO Auto-generated method stub

    }

    /**
     * Returns the identifier of the request processing phase during which this
     * listener is interested in processing PhaseEvent events.
     */
    @Override
    public PhaseId getPhaseId() {
	// TODO Auto-generated method stub
	return null;
    }

}
