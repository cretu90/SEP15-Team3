package de.OfCourse.exception;

import javax.faces.FacesException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;

public class CustomExceptionHandler extends ExceptionHandlerWrapper {

    private ExceptionHandler wrapped;
    
    
    @Override
    public ExceptionHandler getWrapped() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void handle() throws FacesException {

    }
}
