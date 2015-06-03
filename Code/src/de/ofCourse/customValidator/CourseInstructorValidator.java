/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the entered name of the course instructor exists in the system.
 * 
 * @author Katharina Hölzl
 *
 */
public class CourseInstructorValidator implements Validator {

    /**
     * TGets called when you want to add a course instructor to a course unit 
     * or to a course. The method checks if the entered name of the course 
     * instructor exists in the system.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
