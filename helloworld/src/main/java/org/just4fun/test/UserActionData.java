package org.just4fun.test;

import java.io.Serializable;
//import java.util.LinkedHashMap;
import java.util.Map;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
//import javax.faces.event.ValueChangeEvent;

//@ManagedBean(name = "userActionData", eager = true)
//@SessionScoped
public class UserActionData  implements Serializable {
	   private static final long serialVersionUID = 1L;
	   private static Map<String,String> countryMap;
	   private String data = "sample data";
		
	   public String showResult() {
	      return "action_result";
	   }

	   public void updateData(ActionEvent e) {
	      data="Hello World";
	   }

	   public String getData() {
	      return data;
	   }

	   public void setData(String data) {
	      this.data = data;
	   }
}
