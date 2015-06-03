/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the inserted price has a valid format.
 * 
 * @author Katharina H�lzl
 *
 */
public class PriceValidator implements Validator {

    /**
     * Gets called when you want to set the price of a course unit. The method 
     * checks if the entered price has a valid format, for example it has to be 
     * not negative and it needs 2 decimal places.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
