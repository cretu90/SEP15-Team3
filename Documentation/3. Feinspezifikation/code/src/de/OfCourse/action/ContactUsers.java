/**
 * This package represents the business logic of the ofCourse system.
 */
package de.OfCourse.action;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import de.OfCourse.exception.MailingException;

/**
 * Provides the service of sending messages between the course leader and the
 * participants of a course or a course unit.
 * 
 * <p>
 * The class is responsible for sending messages to the participants of a course
 * or a course unit if there are made changes relating to this course or course
 * unit.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class ContactUsers {

    /**
     * This Managed Property represents a mail - object that contains all
     * necessary information for establishing a connection to the SMTP - server.
     */
    @ManagedProperty("#{mail}")
    private Mail mail;

    /**
     * The subject of the message that was entered by the user
     */
    private String subject;

    /**
     * The message to send that was entered by the user
     */
    private String messageToSend;

    /**
     * List of recipients that are to receive the message.
     */
    private List<String> mailRecipients;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user an the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUser sessionUser;

    /**
     * Sends messages from the course leader to the participants of one of his
     * courses or course units in case of there are made changes relating to the
     * course or course unit about the course leader wants to inform. The
     * participants only recieve these messages if they registered for course
     * news as they signed in the course.
     * 
     * @throws MailingException
     *             if a mailing execption occured
     */
    public void sendEMail() throws MailingException {
    }

    /**
     * Returns the value of the attribute <code>mail</code>.
     * 
     * @return the mail object
     */
    public Mail getMail() {
	return mail;
    }

    /**
     * Sets the value of the attribute <code>mail</code>.
     * 
     * @param mail
     *            the new mail object that contains the new neccessary
     *            information for establishing a connection to the SMTP - server
     */
    public void setMail(Mail mail) {
    }

    /**
     * Returns the value of the attribute <code>subject</code>.
     * 
     * @return the subject of the message
     */
    public String getSubject() {
	return subject;
    }

    /**
     * Sets the value of the attribute <code>subject</code>.
     * 
     * @param subject
     *            the new subject of the message
     */
    public void setSubject(String subject) {
    }

    /**
     * Returns the value of the attribute <code>messageToSend</code>.
     * 
     * @return the message that is to be send
     */
    public String getMessageToSend() {
	return messageToSend;
    }

    /**
     * Sets the value of the attribute <code>messageToSend</code>.
     * 
     * @param messageToSend
     *            the new message that is to be send
     */
    public void setMessageToSend(String messageToSend) {
    }

    /**
     * Returns the value of the attribute <code>mailRecipients</code>.
     * 
     * @return the reciepients of the message
     */
    public List<String> getMailRecipients() {
	return mailRecipients;
    }

    /**
     * Sets the value of the attribute <code>mailRecipients</code>.
     * 
     * @param mailRecipients
     *            the new recipients of the message
     */
    public void setMailRecipients(List<String> mailRecipients) {
    }

    /**
     * Returns the ManagedProperty <code>SessionUser</code>.
     * 
     * @return the session of the user
     */
    public SessionUser getSessionUser() {
	return sessionUser;
    }

    /**
     * Sets the ManagedProperty <code>SessionUser</code>.
     * 
     * @param userSession
     *            session of the user
     */
    public void setSessionUser(SessionUser userSession) {
    }
}
