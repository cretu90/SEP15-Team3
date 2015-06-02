/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import de.ofCourse.Database.dao.UserDAO;
import de.ofCourse.model.Language;
import de.ofCourse.model.User;
import de.ofCourse.system.Connection;
import de.ofCourse.system.Transaction;
import de.ofCourse.utilities.PasswordHash;

/**
 * Provides the functionality to register in the the system by entering the
 * required user data.<br>
 * After the registration a verification link is sent to the entered email
 * address to ensure that it is a valid address.
 * <p>
 * Whether the user can log on the system after verifying the entered email
 * address depends on the type of account activation determined by the
 * administrator.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>authenticate</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class RegisterUserBean {

    /**
     * Stores the transaction that is used for database interaction.
     */
    private Transaction transaction;
    
    /**
     * Represents a user object. It stores the data which is entered by the user
     * who wants to register.
     */
    private User userToRegistrate;
    
    private String registerPassword;
    
    private String registerConfirmPassword;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUserBean sessionUser;

    /**
     * Registers a new user with the entered user data in the system.<br>
     * It creates with the entered data a new database entry and sends a mail
     * with a verification link to the entered email address which is used to
     * ensure that the entered email address really exists.<br>
     * If there goes something wrong during registration, e.g. the chosen
     * username is already in use, a error message is displayed.
     */
    public String registerUser() {
	
	// Eingegebenes Passwort hashen
	// TODO salt
	String passwordHash = PasswordHash.hashPW(this.getRegisterPassword(), );
	
	// Datenbankverbindung initialisieren
	this.transaction = new Connection();
	transaction.start();
	
	// Überprüfen, ob die eingegebene E-Mail-Adresse im System bereits existiert.
	if(UserDAO.emailExists(transaction, this.getUserToRegistrate().getEmail())) {
	    
	    // Fehlermeldung in den FacesContext werfen, wenn die Mail schon existiert.
            FacesContext facesContext = FacesContext.getCurrentInstance();
            FacesMessage msg = new FacesMessage("E-Mail existiert bereits!");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            facesContext.addMessage(null, msg);
            facesContext.renderResponse();
	} else {	
	    
	    // Gibt es die angegebene E-Mail-Adresse noch nicht, erstelle einen
	    // neuen Benutzer.
	    UserDAO.createUser(this.transaction, this.getUserToRegistrate(), passwordHash);
	}
	
	//TODO Erfolgsmeldung ausgeben
	
	return "/facelets/open/index.xhtml?faces-redirect=false";
    }
    
    
    /**
     * Returns the ManagedProperty <code>SessionUser</code>.
     * 
     * @return the session of the user
     */
    public SessionUserBean getSessionUser() {
	return sessionUser;
    }

    /**
     * Sets the ManagedProperty <code>SessionUser</code>.
     * 
     * @param userSession
     *            session of the user
     */
    public void setSessionUser(SessionUserBean userSession) {
    }

    public String getRegisterPassword() {
        return registerPassword;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword;
    }

    public String getRegisterConfirmPassword() {
        return registerConfirmPassword;
    }

    public void setRegisterConfirmPassword(String registerConfirmPassword) {
        this.registerConfirmPassword = registerConfirmPassword;
    }

    public User getUserToRegistrate() {
        return userToRegistrate;
    }

}
