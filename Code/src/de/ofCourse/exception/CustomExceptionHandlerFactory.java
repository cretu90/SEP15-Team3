/**
 * Contains all custom exceptions that may occur in the OfCourse system.
 */
package de.ofCourse.exception;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 * Initializes a <code>ExceptionHandler</code> which handles all occuring exceptions.
 *
 * @author Ricky Strohmeier
 *
 */
public class CustomExceptionHandlerFactory extends ExceptionHandlerFactory{

	/**
	 * Returns an <code>ExceptionHandler</code> Object which handles the occured exception.
	 *
	 * @return the initialized <code>ExceptionHandler</code>
	 */
    @Override
    public ExceptionHandler getExceptionHandler() {
	// TODO Auto-generated method stub
	return null;
    }

}
