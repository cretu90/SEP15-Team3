/**
 * 
 */
package de.OfCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * This class checks wether a valid cvc number was inserted.
 * 
 * @author Kathi
 *
 */
public class CVCValidator implements Validator {

  
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
