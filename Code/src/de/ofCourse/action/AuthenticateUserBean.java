/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import javax.annotation.PostConstruct;
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
 * Provides the function that a user can log in the system by entering his
 * username and his password.<br>
 * <p>
 * It is checked whether the user is registered in the system.<br>
 * In case of this is true, the user is logged in the system. Otherwise the
 * access to the system isn't granted.<br>
 * 
 * This class is ManagedBean and controller of the facelet
 * <code>authenticate</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@RequestScoped
public class AuthenticateUserBean {

    /**
     * Represents a user object. It stores the entered username and the entered
     * password, which are needed to log in.
     */
    private User loginUser = new User();
    
    
    /**
     * The password which was inserted by the user.
     */
    private String loginPassword;
    
    /**
     * Stores the transaction that is used for database interaction.
     */
    private Transaction transaction;

    /**
     * This ManagedProperty represents the actual session of a user. It stores
     * the id, the userRole, the userStatus of the user and the selected
     * language.
     */
    @ManagedProperty("#{sessionUser}")
    private SessionUserBean sessionUser;

    @PostConstruct
    private void init(){
	this.sessionUser = new SessionUserBean();
    }
    
    /**
     * Returns the link to the <code>myCourses</code> page if the entered
     * username and the respective password are valid.<p>
     * It is checked whether the entered username and the respective password
     * belong to a user that is registered in the system. If this is true, the
     * log in action is successful and the user is directed to his
     * <code>myCourses</code> page.<br>
     * Otherwise there's displayed an error message an the user stays on this
     * page.
     * 
     * @return link to the next page 
     */
    public String login() {
	
	String passwordHash = PasswordHash.hashPW(this.loginPassword);
	
	this.transaction = new Connection();
	transaction.start();
	int id = UserDAO.proveLogin(this.transaction, this.getLoginUser().getUsername(), passwordHash);
	
	if(id == -1) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            FacesMessage msg = new FacesMessage("Benutzername oder Passwort falsch!");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            facesContext.addMessage(null, msg);
            facesContext.renderResponse();

            return "/facelets/open/authenticate.xhtml?faces-redirect=false";
	} else if(id == -2) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            FacesMessage msg = new FacesMessage("Benutzerkonto nicht aktiv!");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            facesContext.addMessage(null, msg);
            facesContext.renderResponse();

            return "/facelets/open/authenticate.xhtml?faces-redirect=false";
	} else {
	    sessionUser.setLanguage(Language.de);
	    sessionUser.setUserID(id);
	    sessionUser.setUserRole(UserDAO.getUserRole(this.transaction, id));
	    sessionUser.setUserStatus(UserDAO.getUserStatus(this.transaction, id));

            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().
        	    getExternalContext().getSession(true);
            session.setAttribute("userID", id);
            session.setAttribute("userRole", sessionUser.getUserRole());
            
            return "/facelets/user/registeredUser/myCourses.xhtml?faces-redirect=true";
	}
	
	return null;
    }

    /**
     * Returns the value of the attribute <code>loginUser</code>.
     * 
     * @return the user who wants to log in
     */
    public User getLoginUser() {
	return loginUser;
    }

    /**
     * Sets the value of the attribute <code>loginUser</code>.
     * 
     * @param userToLogIn
     *            the users who wants to log in
     */
    public void setLoginUser(User loginUser) {
	this.loginUser= loginUser;
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
    public void setSessionUser(SessionUserBean sessionUser) {
	this.sessionUser = sessionUser;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

}
