package org.just4fun.test;

import java.io.Serializable;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;

//@ManagedBean(name = "employeeAData", eager = true)
//@SessionScoped
public class EmployeeAData implements Serializable {
	   private static final long serialVersionUID = 1L;

	   private static final Employee[] employees =  new Employee[] {
	      new Employee("John", "Marketing", 30,2000.00),
	      new Employee("Robert", "Marketing", 35,3000.00),
	      new Employee("Mark", "Sales", 25,2500.00),
	      new Employee("Chris", "Marketing", 33,2500.00),
	      new Employee("Peter", "Customer Care", 20,1500.00)
	   };

	   private DataModel<Employee> employeeDataModel 
	      = new ArrayDataModel<Employee>(employees);

	   public DataModel<Employee> getEmployees() { 
	      return employeeDataModel; 
	   }	
}
