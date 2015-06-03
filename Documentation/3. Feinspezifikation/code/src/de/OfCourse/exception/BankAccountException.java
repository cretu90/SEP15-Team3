/**
 * Contains all custom exceptions that may occur in the OfCourse system.
 */
package de.ofCourse.exception;

/**
 * Occurs if there happened a problem concerning the connection to the bank database.
 * The BankAccountException is a runtime exception.
 *
 * @author Ricky Strohmeier
 *
 */
public class BankAccountException extends RuntimeException {

    private static final long serialVersionUID = -1548054471568691956L;

}
