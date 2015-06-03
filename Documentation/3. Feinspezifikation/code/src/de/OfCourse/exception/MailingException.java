/**
 * Contains all custom exceptions that may occur in the OfCourse system.
 */
package de.ofCourse.exception;

/**
 * Occurs if there happened a failure concering the systems mail service.
 * E.g. the server is not reachable or a mail could not be sent.
 *
 * @author Ricky Strohmeier
 *
 */
public class MailingException extends RuntimeException{

    private static final long serialVersionUID = 7556546921801557343L;

}
