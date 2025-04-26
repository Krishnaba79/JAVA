package com.example.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.Model.Customer;
import com.example.Model.Order;
public class Database {
	



	
		
		private static final List<Customer> Customer = null;
		@Autowired
		JdbcTemplate template;
		
		public JdbcTemplate getTemplate() {
			return template;
			
		}
		
		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
		
		public int insertCustomer(Customer customer) {
			String sql = "INSERT INTO HomePracticeMVCMovie VALUES(?,?,?,?)";
			int rows = template.update(sql,customer.getCustomer_name(),customer.getEmail());
			return rows;
		}
		
		public int insertProducer(Order order) {
			String sql = "INSERT INTO HomePracticeMVCProducer VALUES(?,?,?)";
			int rows = template.update(sql,order.getCustomer_name(),order.getOrder_date());
			return rows;
		}
		
		
		
		
		
		
		
		public Customer getOne(int id) {
			String sql = "SELECT Customer_id,Customer_name,Email FROM practice WHERE Customer_id=?";
			Customer customer = template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Customer>(Customer.class));
			return customer;
		}
		
		
		
		public Order getOneOrder(int id) {
			String sql = "SELECT Order_id,Customer_name,Order_date FROM practice WHERE Order_id=?";
			Order order = template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Order>(Order.class));
			return order;
		}
		
		public int updateCustomer(Order order) {
			String sql = "UPDATE practice SET Customer_id=?,Customer_name=?,Email=? WHERE Customer_id=?";
			int rows = template.update(sql,Customer.getCustomer_id(),Customer.getCustomer_name(),Customer.Email());
			return rows;
		}
		
		public int updateOrder(Order order) {
			String sql = "UPDATE practice  SET Order_id=?,Order_name=?,Order_date=? WHERE Order_id=?";
			int rows = template.update(sql,order.getOrder_id(),order.getCustomer_name(),order.getOrder_date());
			return rows;
		}
		
		public int deleteCustomer(int id) {
			String sql = "DELETE FROM practice WHERE Customer_id=?";
			int rows = template.update(sql,id);
			return rows;
		}
		
		public int deleteOrder(int id) {
			String sql = "DELETE FROM practice WHERE Order_id=?";
			int rows = template.update(sql,id);
			return rows;
		}

	}


}
