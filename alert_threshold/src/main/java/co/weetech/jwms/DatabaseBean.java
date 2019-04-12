package co.weetech.jwms;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DatabaseBean implements Serializable {
	// resource injection
	@Resource(name = "jdbc/localhost")
	private DataSource ds;

	// if resource injection is not support, you still can get it manually.
	/*
	 * public DatabaseBean(){ try { Context ctx = new InitialContext(); ds =
	 * (DataSource)ctx.lookup("java:comp/env/jdbc/localhost"); } catch
	 * (NamingException e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	// connect to DB and get customer list
	public List<Customer> getCustomerList() throws SQLException {

		if (ds == null)
			throw new SQLException("Can't get data source");

		// get database connection
		Connection con = ds.getConnection();

		if (con == null)
			throw new SQLException("Can't get database connection");

		PreparedStatement ps = con.prepareStatement("select customer_id, name, address, created_date from customer");

		// get customer data from database
		ResultSet result = ps.executeQuery();

		List<Customer> list = new ArrayList<Customer>();

		while (result.next()) {
			Customer cust = new Customer();

			cust.setCustomerID(result.getLong("customer_id"));
			cust.setName(result.getString("name"));
			cust.setAddress(result.getString("address"));
			cust.setCreated_date(result.getDate("created_date"));

			// store all data into a List
			list.add(cust);
		}

		return list;
	}
	
	public static class Customer {
		

		public long customerID;
		public String name;
		public String address;
		public Date created_date;
		
		public long getCustomerID() {
			return customerID;
		}
		public void setCustomerID(long customerID) {
			this.customerID = customerID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Date getCreated_date() {
			return created_date;
		}
		public void setCreated_date(Date created_date) {
			this.created_date = created_date;
		}
		
	}

}
