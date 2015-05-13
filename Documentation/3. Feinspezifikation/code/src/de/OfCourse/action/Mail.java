/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.model.SmtpServer;

/**
 * @author Fuchs
 *
 */
public class Mail {
    
    private SmtpServer smtpServer;

    public void sendMail(List<String> recipients, String sender,
	    String subject, String message) {
    }

    public void sendAuthentificationMessage(int userID) {
    }

    public void sendConfirmationMessage(int userID) {
    }

    public void sendRegistrationMessage(int userID) {
    }

    public void sendNewPasswordMessage(int userID) {
    }

    public SmtpServer getSmtpServer() {
	return smtpServer;
    }

    public void setSmtpServer(SmtpServer smtpServer) {
    }

}
