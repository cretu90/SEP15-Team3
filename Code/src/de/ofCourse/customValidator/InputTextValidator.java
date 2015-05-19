/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the inserted text has a correct character encoding.
 * 
 * @author Katharina Hölzl
 *
 */
public class InputTextValidator implements Validator {

    
    /**
     * This validation method gets called when make a request and it checks, 
     * if your entered text hast a correct character encoding.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
