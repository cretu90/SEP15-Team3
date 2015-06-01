/**
 * This package represents all the models which are used
 */
package de.ofCourse.model;

/**
 * represents the different roles a User can have in the System
 * 
 * @author Sebastian
 *
 */
public enum UserRole {
    /**
     * The standard Role. A user is only registered and has no administrative
     * privileges
     */
    REGISTERED_USER,
    /**
     * a course_leader has administrative privileges on his course. He can create
     * new courseUnits and add or remove users from the course
     */
    COURSE_LEADER,
    /**
     * this role is the highest in the system and has full administrative
     * privileges
     */
    SYSTEM_ADMINISTRATOR;
}
