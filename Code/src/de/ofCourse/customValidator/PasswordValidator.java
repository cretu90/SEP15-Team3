/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the inserted password fulfills certain security requirements 
 * regarding length and choice of signs. 
 * 
 * @author Katharina Hölzl
 *
 */
public class PasswordValidator implements Validator {

    /**
     * Gets called when you want to register or change your password when 
     * you’re already registered. The method checks if the provided requirements 
     * like usage of at least 8 signs, usage of at least one special character, 
     * usage of at least one number and usage of lower  and upper case. 
     * Furthermore it's not allowed to use mutations like 'ß'.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
