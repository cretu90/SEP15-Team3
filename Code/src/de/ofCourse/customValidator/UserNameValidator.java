/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the entered user name already exists in the system.
 * 
 * @author Kathi
 *
 */
public class UserNameValidator implements Validator {

    /**
     * This validation method gets called when you want to register or change 
     * your user name when you’re already registered. The method checks if the 
     * entered user name already exists in the system.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
