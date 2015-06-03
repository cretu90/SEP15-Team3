/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * This class checks wether the image file has the right file extension, in this case .jpg. Furthermore it checks, wether the
 * conditions of the maximum file and permitted resolution of the image (logo or image of a course) are kept.
 * 
 * @author Kathi
 *
 */
public class ImageValidator implements Validator {

  
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
