/**
 * Contains all custom exceptions that may occur in the OfCourse system.
 */
package de.ofCourse.exception;

import javax.faces.FacesException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;

/**
 * Handles all occuring exceptions concerning the OfCourse system.
 *
 * @author Ricky Strohmeier
 *
 */
public class CustomExceptionHandler extends ExceptionHandlerWrapper {

    private ExceptionHandler wrapped;
    
    /**
	 * Wraps the exception handler.
	 *
	 * @return the instance of the wrapped exception handler
	 *
	 */
    @Override
    public ExceptionHandler getWrapped() {
	// TODO Auto-generated method stub
	return null;
    }

	/**
	 * Calls the <code>handle</code> method from <code>wrapped</code>.
	 *
	 * @throws FacesException if an error occurs while the algorithm to handle the exception occurs.
	 *
	 */
    @Override
    public void handle() throws FacesException {

    }
}
