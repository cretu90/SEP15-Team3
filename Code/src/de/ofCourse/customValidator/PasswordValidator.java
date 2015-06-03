/**
 * 
 */
package de.ofCourse.customValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Checks whether the inserted password fulfills certain security requirements
 * regarding length and choice of signs.
 * 
 * @author Katharina H�lzl
 *
 */

@FacesValidator("passwordValidator")
public class PasswordValidator implements Validator {

    /**
     * Gets called when you want to register or change your password when you�re
     * already registered. The method checks if the provided requirements like
     * usage of at least 8 signs, usage of at least one special character, usage
     * of at least one number and usage of lower and upper case. Furthermore
     * it's not allowed to use mutations like '�'.
     */

    private Pattern pattern;
    private Matcher matcher;

    private static final String PasswordPattern = "((?=.*\\d)(?=.*[a-z])"
	    + "(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

    public PasswordValidator() {
	pattern = Pattern.compile(PasswordPattern);
    }

    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object value)
	    throws ValidatorException {
	
	matcher = pattern.matcher(value.toString());
	
	if (!matcher.matches()) {
	    throw new ValidatorException(
		    new FacesMessage(
			    "Das Passwort muss mindestens 8 Zeichen lang sein, "
			    + "ein Sonderzeichen, Ziffern und Gro�- und "
			    + "Kleinbuchstaben enthalten. �, �, �, � sind "
			    + "nicht erlaubt."));
	}

    }

}
