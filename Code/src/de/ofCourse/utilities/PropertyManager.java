/**
 * This package provides utility functionality for the ofCourse system.
 */
package de.ofCourse.utilities;

/**
 * Provides the functionality to read out a property file, which contains system
 * configuration data. The config-file have to exist under the
 * <ServletContext-Path>/config/ and is called ofCourse.properties.
 * 
 * @author Tobias Fuchs
 *
 */
public class PropertyManager {

    /**
     * Singleton-object of the PropertyManager class
     */
    private static PropertyManager propertyManager;

    /**
     * Name of the configuration file
     */
    private static String CONFIGFILENAME = "ofCourse.properties";

    /**
     * Path of the configuration file
     */
    private static String CONFIGFILEPATH = "/WEB-INF/config/";

    /**
     * Returns an instance of the PropertyManager class.
     * 
     * @return instance of the PropertyManager
     */
    public static PropertyManager getInstance() {
	return null;
    }

    /**
     * Returns a property value to a given key.
     * 
     * @param key
     *            the key to determine the property value
     * 
     * @return the value of the found property
     */
    public String getProperty(String key) {
	return null;
    }

    /**
     * Sets the value of the property to a given key.
     * 
     * @param key
     *            the key to determine the property value
     * @param value
     *            the new value
     */
    public void setProperty(String key, String value) {

    }

}
