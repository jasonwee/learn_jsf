package org.just4fun.test;

import java.io.Serializable;
import java.util.Date;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

//@ManagedBean(name = "userData", eager = true)
//@SessionScoped
public class DateTime implements Serializable {
	   private static final long serialVersionUID = 1L;
	   public Date date;

	   public Date getDate() {
	      return date;
	   }

	   public void setDate(Date date) {
	      this.date = date;
	   }
}
