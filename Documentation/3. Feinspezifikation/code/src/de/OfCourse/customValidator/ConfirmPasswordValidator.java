/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks wether the two inserted passwords are equal.
 * 
 * @author Katharina Hölzl
 *
 */
public class ConfirmPasswordValidator implements Validator {

    /**
     * This validation method gets called when you want to register or change 
     * your password when you’re already registered. Therefore you have to insert 
     * your password twice due to security issues. This method checks if the two 
     * passwords are equal.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
