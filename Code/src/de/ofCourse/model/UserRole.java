/**
 * 
 */
package de.ofCourse.model;

/**
 * This class repressents the different roles a User can have in the System
 * 
 * @author
 *
 */
public enum UserRole {
    /**
     * The standart Role. A user is only registrated and has no administrative
     * privileges
     */
    REGISTERED_USER,
    /**
     * a course_leader has administraive privileges on his course. He can create
     * new courseUnits and add or remove users from the course
     */
    COURSE_LEADER,
    /**
     * this role is the highest in the system and has full administrative
     * privileges
     */
    SYSTEM_ADMINISTRATOR;
}
