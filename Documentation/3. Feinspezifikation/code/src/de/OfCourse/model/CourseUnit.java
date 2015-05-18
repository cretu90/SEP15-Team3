/**
 * 
 */
package de.ofCourse.model;

import java.util.Date;
import java.util.List;

/**
 * This class contains all information about a Courseunit
 * 
 * @author Sebastian
 *
 */
public class CourseUnit {
    
    private int courseUnitID;

    /**
     * title, the title of a courseunit
     */
    private String title;
    /**
     * description, the description of the courseunit (could include
     * information, needed equipment etc)
     */
    private String description;
    /**
     * starttime, the Date and time when the CourseUnit starts.
     */
    private Date startime;
    /**
     * endtime, the Date and time when the CourseUnit ends.
     */
    private Date endtime;
    /**
     * address, the address where the courseunit will be hold
     */
    private Address address;
    /**
     * price, the amount the user has to pay for the courseunit to take part in
     * it
     */
    private float price;
    /**
     * maxUsers, the maximal number of Users the courseunit can handle.
     */
    private int maxUsers;
    /**
     * minUsers, the minimal number of Users the courseunit needs to take place
     */
    private int minUsers;
    /**
     * courseAdmin, the courseAdmin who will hold the CourseUnit
     */
    private User courseAdmin;
    /**
     * cycle, saves the turnus and the amount of units which still have to take
     * place(only if the CourseUnit take place with regularity)
     */
    private Cycle cycle;
    /**
     * users, a list of users who take part in the CourseUnit
     * 
     */
    private List<User> users;
    /**
     * courseImage, the Logo of the CourseUnit
     */
    private String courseImage;
    /**
     * location, the room description where the CourseUnit will be hold (Is
     * needed besides the Address for example if the CourseUnit is hold in
     * specific rooms like the gym)
     */
    private String location;

    public String getTitle() {
	return null;
    }

    public String getDescription() {
	return null;
    }

    public Date getStarttime() {
	return null;
    }

    public Date getEndtime() {
	return null;
    }

    public Address getAddress() {
	return null;
    }

    public float getPrice() {
	return 0;
    }

    public int getMaxUsers() {
	return 0;
    }

    public int getMinUsers() {
	return 0;
    }

    public User getCourseAdmin() {
	return null;
    }

    public Cycle getCycle() {
	return null;
    }

    public List<User> getUsers() {
	return null;
    }

    public String getCourseImage() {
	return null;
    }

    public String getLocation() {
	return null;
    }

    public void setTitle(String title) {
    }

    public void setDescription(String discription) {
    }

    public void setStarttime(Date startingTime) {
    }

    public void setEndtime(Date endTime) {
    }

    public void setAddress(Address address) {
    }

    public void setPrice(float price) {
    }

    public void setCycle(Cycle cycle) {
    }

    public void setMaxUsers(int maxUsers) {
    }

    public void setMinUsers(int minUsers) {
    }

    public void setCourseAdmin(User courseAdmin) {
    }

    public void setUsers(List<User> users) {
    }

    public void setCourseImage(String image) {
    }

    public void setLocation(String location) {
    }

    /**
     * @return the courseUnitID
     */
    public int getCourseUnitID() {
	return courseUnitID;
    }

    /**
     * @param courseUnitId the courseUnitId to set
     */
    public void setCourseUnitID(int courseUnitId) {
	this.courseUnitID = courseUnitId;
    }
}
