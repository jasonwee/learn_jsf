package org.just4fun.test;

import java.io.Serializable;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

//@ManagedBean(name = "userData", eager = true)
//@SessionScoped
public class PropertyData implements Serializable {
   private static final long serialVersionUID = 1L;
   public String data = "1";

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }
}