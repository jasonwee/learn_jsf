package org.just4fun.test;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;

//@ManagedBean(name = "messageBean", eager = true)
//@RequestScoped
public class MessageBean {
   private String message = "Hello World!";
	
   public String getMessage() {
      return message;
   }
   public void setMessage(String message) {
      this.message = message;
   }
}
