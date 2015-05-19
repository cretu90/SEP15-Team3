/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import de.ofCourse.model.SmtpServer;

/**
 * Sends emails to lists of recipients and provides the service of sending
 * system-generated mails like the email - verification - mail.
 * <p>
 * The class has access to the SMTP - Server -settings which are needed to send
 * mails.
 * 
 * @author Tobias Fuchs
 */
@ManagedBean
@ApplicationScoped
public class MailBean {

    /**
     * SMTP-server-object, that is needed to get the settings of the server.
     */
    private SmtpServer smtpServer;

    /**
     * 
     * Sends an email to a list of recipients. The email contains a subject and
     * a message.
     * 
     * @param recipients
     *            List of recipients who receive the message
     * @param sender
     *            sender of the email
     * @param subject
     *            subject of the email
     * @param message
     *            message of the email
     */
    public void sendMail(List<String> recipients, String sender,
	    String subject, String message) {
    }

    /**
     * Generates an authentication messages.<br>
     * This message is sent when a user registers himself in the system. The
     * message contains an verification link, the verifies the entered email and
     * activates the account in case of the type of account activation is set to
     * email verification.
     * 
     * 
     * @param userID
     *            ID of the user, who receives the message.
     */
    public void sendAuthentificationMessage(int userID) {
    }

    /**
     * Generates a mail that requests an user to conform his email - address.<br>
     * This method is used if the user changes his email in his profile.
     * 
     * @param userID
     *            ID of the user, who receives the message.
     */
    public void sendConfirmationMessage(int userID) {
    }

    /**
     * Generates a message which is sent in case of a user has forgot his
     * password.<br>
     * The message contains the new generated password.
     * 
     * @param userID
     *            ID of the user, who receives the message.
     */
    public void sendNewPasswordMessage(int userID) {
    }

    /**
     * Returns the smtpServer - object that contains the settings of the smtp
     * server.
     * 
     * @return the smtpSever - object
     */
    public SmtpServer getSmtpServer() {
	return smtpServer;
    }

    /**
     * Sets smtpServer - object that contains the settings of the smtp server.
     * 
     * @param smtpServer
     *            smtpSserver - object to set
     */
    public void setSmtpServer(SmtpServer smtpServer) {
    }

}
