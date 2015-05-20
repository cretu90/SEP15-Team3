/**
 * This package represents all the models which are used
 */
package de.ofCourse.model;

/**
 * contains all Information for the SMTP Server which is needed for
 * the E-Mail dispatch
 * 
 * @author Sebastian
 *
 */
public class SmtpServer {

    /**
     * stores the URL address to the E-Mail Server
     * 
     */
    private String hostaddr;
    /**
     * stores the password for the Login on the E-Mail Server
     * 
     */
    private String password;
    /**
     * port, the portnumber which is needed for the connection with the E-Mail
     * Server
     * 
     */
    private int port;
    /**
     *  stores the username for the Login on the E-Mail Server
     * 
     */
    private String username;
    /**
     * 
     * 
     */
    private boolean authenticated;
    /**
     * 
     */
    private boolean tls;

    /**
     * 
     * @return the hostaddr
     */
    public String getHostaddr() {
	return hostaddr;
    }

    /**
     * Sets the value of the attribute <code>hostaddr</code>.
     * 
     * @param hostaddr
     *            the hostaddr to set
     */
    public void setHostaddr(String hostaddr) {
	this.hostaddr = hostaddr;
    }

    /**
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * Sets the value of the attribute <code>password</code>.
     * 
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * @return the port
     */
    public int getPort() {
	return port;
    }

    /**
     * Sets the value of the attribute <code>port</code>.
     * 
     * @param port
     *            the port to set
     */
    public void setPort(int port) {
	this.port = port;
    }

    /**
     * @return the username
     */
    public String getUsername() {
	return username;
    }

    /**
     * Sets the value of the attribute <code>username</code>.
     * 
     * @param username
     *            the username to set
     */
    public void setUsername(String username) {
	this.username = username;
    }

    /**
     * @return the authenticated
     */
    public boolean isAuthenticated() {
	return authenticated;
    }

    /**
     * @param authenticated
     *            the authenticated to set
     */
    public void setAuthenticated(boolean authenticated) {
	this.authenticated = authenticated;
    }

    /**
     * @return the tls
     */
    public boolean isTls() {
	return tls;
    }

    /**
     * @param tls
     *            the tls to set
     */
    public void setTls(boolean tls) {
	this.tls = tls;
    }

}
