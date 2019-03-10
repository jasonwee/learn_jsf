package org.just4fun.test;

import java.io.Serializable;

public class UserData implements Serializable {
	private static final long serialVersionUID = 1L;
	public String data = "1";
	private String name;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWelcomeMessage() {
		return "Hello " + name;
	}
}