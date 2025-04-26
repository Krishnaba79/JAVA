package com.example.Model;

public class Order {
	private int Order_id;
	public int getOrder_id() {
		return Order_id;
	}
	public void setCustomer_id(int customer_id) {
		Order_id = customer_id;
	}
	private String customer_name;
	private String order_date;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public static void setCustomer_name(int int1) {
		// TODO Auto-generated method stub
		
	}
	

}
