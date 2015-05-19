/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * This class checks whether the image file has the right file extension, in this case .jpg. Furthermore it checks, whether the
 * conditions of the maximum file and permitted resolution of the image of an user are kept.
 * 
 * @author Kathi
 *
 */
public class UserImageValidator implements Validator {

    
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
