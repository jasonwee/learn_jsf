package org.just4fun.test;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class UserActionListener implements ActionListener {
	@Override
	public void processAction(ActionEvent arg0) throws AbortProcessingException {

		// access userData bean directly
		UserActionData userActionData = (UserActionData) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("userActionData");
		userActionData.setData("Hello World");
	}
}
