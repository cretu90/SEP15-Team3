/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the inserted mail is already existing in the database and whether 
 * the input has an valid mail format.
 * 
 * @author Katharina Hölzl
 *
 */
public class EMailValidator implements Validator {

  
    /**
     * Gets called when you want to register or change your mail address when 
     * you’re already registered. The method checks if the entered mail has a 
     * valid format (e.g. one and only one @ sign) and whether it is already 
     * existing in the database.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
