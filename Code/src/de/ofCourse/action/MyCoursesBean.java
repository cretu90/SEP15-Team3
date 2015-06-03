/**
 * This package represents the business logic of the ofCourse system.
 */
package de.ofCourse.action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import de.ofCourse.Database.dao.CourseDAO;
import de.ofCourse.exception.InvalidDBTransferException;
import de.ofCourse.model.Course;
import de.ofCourse.model.CourseUnit;
import de.ofCourse.model.PaginationData;
import de.ofCourse.model.User;
import de.ofCourse.model.UserRole;
import de.ofCourse.model.UserStatus;
import de.ofCourse.system.Connection;
import de.ofCourse.system.Transaction;

/**
 * Displays the courses that are attended by a certain user and offers the user
 * the possibility to go to the details pages pages of the courses he attends.
 * <p>
 * 
 * Supports pagination to display the courses.
 * 
 * <p>
 * This class is ManagedBean and controller of the facelet
 * <code>myCourses</code>.
 * 
 * @author Tobias Fuchs
 *
 */
@ManagedBean
@ViewScoped
public class MyCoursesBean implements Pagination, Serializable {

	/**
	 * Stores the transaction that is used for database interaction.
	 */
	private Transaction transaction;

	private static final long serialVersionUID = 1L;

	/**
	 * List of courses that the user attends
	 */
	private ArrayList<Course> registeredCourses;

	/**
	 * This attribute represents a pagination object. It stores all the
	 * information that is necessary for pagination, e.g. the number of elements
	 * per page.
	 */
	private PaginationData pagination;

	/**
	 * This ManagedProperty represents the actual session of a user. It stores
	 * the id, the userRole, the userStatus of the user and the selected
	 * language.
	 */
	@ManagedProperty("#{sessionUser}")
	private SessionUserBean sessionUser;

	// _________________________________________________________________
	// ------------------TESTDATEN-----------------------

	private Course course1;
	private Course course2;
	private Course course3;

	private ArrayList<Course> ordered;

	/**
     * 
     */
	@PostConstruct
	private void init() {

		// Prüfen ob ich das brauche
		this.registeredCourses = new ArrayList<Course>();

		// _____________________________________________________
		// Methoden um weiterhin die Seite testen zu können ohne login
		this.sessionUser = new SessionUserBean();
		this.sessionUser.setUserStatus(UserStatus.REGISTERED);
		// _____________________________________________________

		pagination = new PaginationData();
		this.pagination.setSortAsc(true);
		this.pagination.setElementsPerPage(10);
		this.pagination.setSortColumn("title");
		this.pagination.setCurrentPageNumber(0);

		transaction = new Connection();

		this.actualizeDisplayData();

		// ///////////////////////////////////////////
		registeredCourses = new ArrayList<Course>();
		ordered = new ArrayList<Course>();

		course1 = new Course();
		course1.setTitle("Yoga");
		course1.setCourseID(111);

		CourseUnit unit = new CourseUnit();
		unit.setLocation("hier");
		unit.setStarttime(new Date(100, 0, 20, 12, 0));
		course1.setNextCourseUnit(unit);

		User admin1 = new User();
		admin1.setUsername("Hans");
		User admin2 = new User();
		admin2.setUsername("Detlef");

		ArrayList<User> admins = new ArrayList<User>();
		admins.add(admin1);
		admins.add(admin2);
		course1.setCourseAdmins(admins);

		course2 = new Course();
		course2.setTitle("Boxen");
		course2.setCourseID(222);
		CourseUnit unit1 = new CourseUnit();
		unit1.setLocation("dort");
		unit1.setStarttime(new Date(101, 0, 21, 22, 0));
		course2.setNextCourseUnit(unit1);
		course2.setCourseAdmins(admins);

		course3 = new Course();
		course3.setTitle("CrossFit");
		course3.setCourseID(333);
		CourseUnit unit2 = new CourseUnit();
		unit2.setLocation("dorthier");
		unit2.setStarttime(new Date(110, 0, 11, 22, 0));
		course3.setNextCourseUnit(unit2);
		course3.setCourseAdmins(admins);

		registeredCourses.add(course1);
		registeredCourses.add(course2);
		registeredCourses.add(course3);

		ordered.add(course2);
		ordered.add(course3);
		ordered.add(course1);

	}

	// _________________________________________________________________

	/**
     * 
     */
	private void actualizeDisplayData() {

		// ______________________________________________________
		// Kann für Test auskommentiert werden
		// ______________________________________________________
		transaction.start();
		// ________________________________________________________

		try {
			// TODO: DAO - Methode fürs zählen

			// ______________________________________________________
			// Kann für Test auskommentiert werden
			// ______________________________________________________
			this.pagination.actualizeNumberOfPages(CourseDAO
					.getNumberOfMyCourses(transaction,
							this.sessionUser.getUserID()));

			this.registeredCourses = (ArrayList<Course>) CourseDAO
					.getCoursesOf(transaction, this.sessionUser.getUserID());
			// ___________________________________________________________
			this.transaction.commit();
		} catch (InvalidDBTransferException e) {
			// TODO: Logging message
			this.transaction.rollback();
		}
	}

	/**
	 * Redirects the user to the <code>courseDetail</code> page of the selected
	 * course.
	 * 
	 * @return link to the <code>courseDetail</code> page
	 */
	public String loadCourseDetailsPageOfSelectedCourse() {
		return "/facelets/open/courses/courseDetail.xhtml?faces-redirect=true";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getActualPageNumber() {
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void goToSpecificPage() {

		this.pagination.actualizeCurrentPageNumber(FacesContext
				.getCurrentInstance().getExternalContext()
				.getRequestParameterMap().get("page"));

		// ______________________________________________________
		// Kann für Test auskommentiert werden
		// ______________________________________________________
		transaction.start();
		// ________________________________________________________

		try {

			this.registeredCourses = (ArrayList<Course>) CourseDAO
					.getCoursesOf(transaction, this.sessionUser.getUserID());
			this.transaction.commit();
		} catch (InvalidDBTransferException e) {
			// TODO: Logging message
			this.transaction.rollback();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void sortBySpecificColumn() {
		// Not needed in MyCoursesBean
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PaginationData getPagination() {
		return pagination;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setPagination(PaginationData pagination) {
		this.pagination = pagination;
	}

	/**
	 * Returns a list of courses that the user attends
	 * 
	 * @return list of courses the user attends
	 */
	public ArrayList<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	/**
	 * Sets the value of the attribute <code>registeredCourses</code>.
	 * 
	 * @param registeredCourses
	 *            list of courses the user attends
	 */
	public void setRegisteredCourses(ArrayList<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
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
	public void setSessionUser(SessionUserBean userSession) {
		this.sessionUser = userSession;
	}

}
