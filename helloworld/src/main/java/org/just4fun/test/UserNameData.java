package org.just4fun.test;

import java.io.Serializable;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

//@ManagedBean(name = "userNameData", eager = true)
//@SessionScoped
public class UserNameData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double salary;
	private String password;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
