/**
 * This package provides utility functionality for the ofCourse system.
 */
package de.OfCourse.utilities;

/**
 * Provides the services of hashing a given plaintext password concatenated with
 * a salt by using a SHA hash algorithm.
 * 
 * @author Tobias Fuchs
 *
 */
public class PasswordHash {

    /**
     * Returns the encrypted form of a given plaintext password.<br>
     * The password is encrypted by concatenating it with the given salt and
     * using a one way SHA hash algorithm.
     * 
     * @param password
     *            password you want to encrypt
     * @param salt
     *            salt you use for encryption
     *
     * @return encrypted password
     * 
     */
    public static String hash(String password, int salt) {
	return null;
    }
}
