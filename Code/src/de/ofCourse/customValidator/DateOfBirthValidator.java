/**
 * 
 */
package de.ofCourse.customValidator;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the inserted date is in the future or more than 150 years in the past.
 * 
 * @author Katharina Hölzl
 *
 */

@FacesValidator("dateOfBirthValidator")
public class DateOfBirthValidator implements Validator {

   
    /**
     * Gets called when you want to register or change your date of birth when 
     * you’re already registered. This method checks if the entered date is in 
     * the future or more than 150 years in the past.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// Date dateOfBirth = (Date) value;
	
	//SimpleDateFormat formatter = new SimpleDateFormat(
        //        "dd.MM.yyyy");
	
	//if(){
	    throw new ValidatorException(new FacesMessage("Datumsangabe nicht korrekt."));
	//}

    }

}
