/**
 * 
 */
package de.ofCourse.customValidator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks in case of offline charging of an users credit, whether 
 * the entered name and the entered user id belong to the same user and if the 
 * id is existing in the database.
 * 
 * @author Kathi
 *
 */
public class OfflineTransactionValidator implements Validator {

    /**
     * This validation method gets called when you want to charge the account 
     * of an registered user with credits. The method checks if the inserted 
     * name and the entered user id belong to the same user. Furthermore it 
     * checks, if the id is existing in the database.
     */
    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
	    throws ValidatorException {
	// TODO Auto-generated method stub

    }

}
