package org.just4fun.test;

import java.io.Serializable;
import java.util.Date;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

//@ManagedBean(name = "userExpLangData", eager = true)
//@SessionScoped
public class UserExpLangData implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date createTime = new Date();
	private String message = "Hello World!";

	public Date getCreateTime() {
		return (createTime);
	}

	public String getMessage() {
		return (message);
	}
}
