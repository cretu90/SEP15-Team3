/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the image file has the right file extension and whether some 
 * other conditions like maximum file and permitted resolution of the image 
 * of an user are kept.
 * 
 * @author Katharina Hölzl
 *
 */
public class UserImageValidator implements Validator {

    /**
     * Gets called when you want to change your own image in the profile. The 
     * method checks if the image file has the right file extension, in this 
     * case .jpg. Furthermore it checks, if the conditions of the maximum file 
     * and permitted resolution of the image are kept.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
