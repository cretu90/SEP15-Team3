/**
 * 
 */
package de.OfCourse.model;

/**
 * @author
 *
 */
public class SmtpServer {

    /**
     * 
     */
    private String hostaddr;
    /**
     * 
     */
    private String password;
    /**
     * 
     */
    private int port;
    /**
     * 
     */
    private String username;
    /**
     * 
     */
    private boolean authenticated;
    /**
     * 
     */
    private boolean tls;

    /**
     * @return the hostaddr
     */
    public String getHostaddr() {
	return hostaddr;
    }

    /**
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
