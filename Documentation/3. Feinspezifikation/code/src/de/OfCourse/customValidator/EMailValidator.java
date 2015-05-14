/**
 * 
 */
package de.OfCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * This class checks wether the input has a valid mail format (e.g. one and only one @ sign) 
 * and wether it is already existing in da database.
 * 
 * @author Kathi 
 *
 */
public class EMailValidator implements Validator {

  
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
