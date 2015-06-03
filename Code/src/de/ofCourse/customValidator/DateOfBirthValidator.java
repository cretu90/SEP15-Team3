/**
 * 
 */
package de.ofCourse.customValidator;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the inserted date is in the future or more than 150 years in
 * the past.
 * 
 * @author Katharina H�lzl
 *
 */

@FacesValidator("dateOfBirthValidator")
public class DateOfBirthValidator implements Validator {

    /**
     * Gets called when you want to register or change your date of birth when
     * you�re already registered. This method checks if the entered date is in
     * the future or more than 150 years in the past.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object value)
	    throws ValidatorException {
	Date dateToday = new Date();
	String dateOfBirthString = value.toString();

	try {
	    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
	    Date dateOfBirth = format.parse(dateOfBirthString);

	    long spread = dateToday.getTime() - dateOfBirth.getTime();
	    long hundredFiftyYears = 150 * 365 * 24 * 60 * 60;
	    long past = dateToday.getTime() - hundredFiftyYears;

	    if ((spread < 0) || (dateOfBirth.getTime() < past)) {
		throw new ValidatorException(new FacesMessage("Datum liegt in "
			+ "der Zukunft oder mehr als 150 Jahre zur�ck."));
	    }

	} catch (ParseException e) {
	    throw new ValidatorException(new FacesMessage("Datum muss dem"
		    + "Format dd.MM.yyyy entsprechen."));
	}
    }

}
