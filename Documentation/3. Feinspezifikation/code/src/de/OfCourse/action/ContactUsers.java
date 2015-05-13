/**
 * 
 */
package de.OfCourse.action;

import java.util.List;

import de.OfCourse.exception.MailingException;

/**
 * @author Fuchs
 *
 */
public class ContactUsers {
    
    private Mail mail;
    private String subject;
    private String messageToSend;
    private List<String> mailRecipients;
    private SessionUser sessionUser;

    
    public void sendEMail() throws MailingException{}
    public Mail getMail(){
	return mail;}
    public void setMail(Mail mail){}
    public String getSubject(){
	return subject;}
    public void setSubject(String subject){}
    public String getMessageToSend(){
	return messageToSend;}
    public void setMessageToSend(String messageToSend){}
    public List<String> getMailRecipients(){
	return mailRecipients;}
    public void setMailRecipients(List<String> mailRecipients){}
    public SessionUser getSessionUser(){
	return sessionUser;}
    public void setSessionUser(SessionUser userSession){}
}
