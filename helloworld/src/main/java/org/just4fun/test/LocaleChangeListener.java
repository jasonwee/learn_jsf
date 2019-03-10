package org.just4fun.test;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class LocaleChangeListener implements ValueChangeListener {
	
	   @Override
	   public void processValueChange(ValueChangeEvent event)
	      throws AbortProcessingException {
	      
	      //access country bean directly
	      UserHandlerData userHanlderData = (UserHandlerData) FacesContext.getCurrentInstance().
	      getExternalContext().getSessionMap().get("userHandlerData");
	      userHanlderData.setSelectedCountry(event.getNewValue().toString());
	   }

}
