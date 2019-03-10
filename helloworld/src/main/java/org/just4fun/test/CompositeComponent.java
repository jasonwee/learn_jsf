package org.just4fun.test;

import java.io.Serializable;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

//@ManagedBean(name = "compositeComponent", eager = true)
//@SessionScoped
public class CompositeComponent implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		return "result";
	}
}