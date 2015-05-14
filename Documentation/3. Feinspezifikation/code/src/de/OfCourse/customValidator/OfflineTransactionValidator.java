/**
 * 
 */
package de.OfCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * This class checks in case of offline charging of an users credit, wether 
 * the entered name and the entered unserid belong to the same user.
 * 
 * @author Kathi
 *
 */
public class OfflineTransactionValidator implements Validator {

    
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
