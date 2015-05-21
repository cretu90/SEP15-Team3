/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the inserted date is in the future or more than 150 years in the past.
 * 
 * @author Katharina Hölzl
 *
 */
public class DateOfBirthValidator implements Validator {

   
    /**
     * Gets called when you want to register or change your date of birth when 
     * you’re already registered. This method checks if the entered date is in 
     * the futur or more than 150 years in the past.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
