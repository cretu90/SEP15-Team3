/**
 * 
 */
package de.OfCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * This class checks wether the inserted password fullfills certain security requirements regarding
 * length and coice of signs. Provided requirements to the passwords ar at least 8 signs,
 * at least one special charakter, at least one number, usage of lower and upper case. Furthermore
 * it's not allowed to use mutations like 'ß'.
 * 
 * @author Kathi
 *
 */
public class PasswordValidator implements Validator {

    
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
