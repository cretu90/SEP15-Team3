/**
 * 
 */
package de.OfCourse.model;

/**
 * This class represents the different statuses which the user can have
 * 
 * @author Sebastian
 *
 */
public enum UserStatus {
    /**
     * The visitor of the page is not logged in
     */
    ANONYMOUS,
    /**
     * The user is registrated but has not been activated yet
     */
    NOT_ACTIVATED,
    /**
     * The user is registrated and activated
     */
    REGISTERED,
    /**
     * The user is inactiv(because he has deleted his profil or was deleted by an adminstrator)
     */
    INACTIVE;
}
