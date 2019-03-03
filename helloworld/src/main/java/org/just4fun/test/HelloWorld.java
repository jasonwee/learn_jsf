package org.just4fun.test;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.RequestScoped;

//@ManagedBean(name = "helloWorld", eager=true)
//@RequestScoped
public class HelloWorld {
	//@ManagedProperty(value = "#{message}")
	private MessageBean messageBean;
	private String message;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}
	
	public MessageBean getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}
	

	public String getMessage() {
		System.out.println("hi");
		if (messageBean != null) {
			System.out.println("hi1.1");
			message = messageBean.getMessage();
			System.out.println("message " + message);
		} else {
			System.out.println("hi1.2");
			messageBean = new MessageBean();
			message = messageBean.getMessage();
		}
		System.out.println("hi1");
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
