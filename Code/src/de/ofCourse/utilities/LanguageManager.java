/**
 * This package provides utility functionality for the ofCourse system.
 */
package de.ofCourse.utilities;

import java.util.Map;

/**
 * Represents a LanguageManager that handles the available languages and is
 * responsible to read out the language properties.<br>
 * Uses specified parameters in faces-config.xml and uses the property files
 * language_de.properties and language_en.properties under the path
 * <ServletContext-Path>/languages/
 * 
 * @author Tobias Fuchs
 *
 */
public class LanguageManager {

    /**
     * Singleton-object of the LanguageManager class
     */
    private static LanguageManager languageManager;

    /**
     * The supported languages
     */
    private Map<String, Object> availableLanguages;

    /**
     * Returns an instance of the LanguageManager class.
     * 
     * @return instance of the LanguageManager
     */
    public static LanguageManager getInstance() {
	return null;
    }

    /**
     * Returns a map of all supported languages.
     * 
     * @return the supported languages
     */
    public Map<String, Object> getSupportedLanguages() {
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
     * Provides the functionality to switch to a given language.
     * 
     * @param language
     *            the chosen language
     */
    public void switchLanguage(String language) {
    }

}
