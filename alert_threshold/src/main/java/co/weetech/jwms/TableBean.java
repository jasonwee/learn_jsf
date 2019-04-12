package co.weetech.jwms;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;

/*
 * https://javaserverfaces.github.io/docs/2.3/managed-bean-javadocs/deprecated-list.html
 * https://javaee.github.io/tutorial/jsf-configure002.html
 * https://thomasleduc.wordpress.com/2014/06/01/jsf-managedbean-to-named/
 * https://stackoverflow.com/questions/38040947/the-type-managedbean-is-deprecated
 * 
 */
@ManagedBean
@SessionScoped
public class TableBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private boolean sortAscending = true; 
	
	private static final ArrayList<Order> orderList = 
			new ArrayList<Order>(Arrays.asList(
					
					new Order("A0001", "Intel CPU", 
							new BigDecimal("700.00"), 1),
					new Order("A0002", "Harddisk 10TB", 
							new BigDecimal("500.00"), 2),
					new Order("A0003", "Dell Laptop", 
							new BigDecimal("11600.00"), 8),
					new Order("A0004", "Samsung LCD", 
							new BigDecimal("5200.00"), 3),
					new Order("A0005", "A4Tech Mouse", 
							new BigDecimal("100.00"), 10)
				));

	//private DataModel<Order> orders = new ArrayDataModel<Order>(orderList.toArray(new Order[orderList.size()]));
	
	public ArrayList<Order> getOrderList() {
		//return orders;
		return orderList;
	}
	
	//sort by order no
	public String sortByOrderNo() {
	    
		if(sortAscending){
			
			//ascending order
			Collections.sort(orderList, new Comparator<Order>() {

				@Override
				public int compare(Order o1, Order o2) {
					
					return o1.getOrderNo().compareTo(o2.getOrderNo());
					
				}

			});
			sortAscending = false;
			
		}else{

			//descending order
			Collections.sort(orderList, new Comparator<Order>() {

				@Override
				public int compare(Order o1, Order o2) {
					
					return o2.getOrderNo().compareTo(o1.getOrderNo());
					
				}

			});
			sortAscending = true;
		}

		return null;
	}

	
	public String saveAction() {
	    
		//get all existing value but set "editable" to false 
		for (Order order : orderList){
			order.setEditable(false);
		}
		
		//return to current page
		return null;
		
	}
	
	public String editAction(Order order) {
	    
		order.setEditable(true);
		return null;
	}
	
	
	String orderNo;
	String productName;
	BigDecimal price;
	int qty;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}


	public String addAction() {
	    
		Order order = new Order(this.orderNo, this.productName, 
			this.price, this.qty);
		
		orderList.add(order);
		
		return null;
	}
 
	public String deleteAction(Order order) {
	    
		orderList.remove(order);
		return null;
	}

	
	public static class Order{
		
		String orderNo;
		String productName;
		BigDecimal price;
		int qty;
		boolean editable;

		public Order(String orderNo, String productName, BigDecimal price, int qty) {
			this.orderNo = orderNo;
			this.productName = productName;
			this.price = price;
			this.qty = qty;
		}
		
		public String getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public boolean isEditable() {
			return editable;
		}
		public void setEditable(boolean editable) {
			this.editable = editable;
		}
	}
}
