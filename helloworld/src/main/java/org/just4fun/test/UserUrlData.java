package org.just4fun.test;

import java.io.Serializable;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

//@ManagedBean(name = "userUrlData", eager = true)
//@SessionScoped
public class UserUrlData implements Serializable {

	private static final long serialVersionUID = 1L;
	public UrlData data;

	public UrlData getData() {
		return data;
	}

	public void setData(UrlData data) {
		this.data = data;
	}
}
