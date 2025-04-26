package com.example.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.example.Model.Employee;
import com.mysql.cj.exceptions.RSAException;


public class EmployeeDB {
	
	@Autowired
	JdbcTemplate template;
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertData(Employee emp) {
		String sql = "INSERT INTO emp VALUES('" + emp.getId() + "','" + emp.getName() + "')";
		int rows = template.update(sql);
		return rows;
	}
	
	public List<Employee> getAll(){
		String sql = "SELECT * FROM emp";
		List<Employee> empList = template.query(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				return employee;
			}
			
		});
		return empList;
	}
	
	public Employee getOneEmployee(int id) {
		String sql = "SELECT * FROM emp WHERE id=?";
		Employee employee = template.queryForObject(sql, new Object[] {id},new BeanPropertyRowMapper<Employee>(Employee.class));
		
		return employee;
	}
	
	public int updateStu(Employee employee) {
	    String sql = "UPDATE emp SET name=? WHERE id=?";
	    
	    int id =  employee.getId();
	    int rows = template.update(sql, employee.getName(), id);
	    return rows;
	}
	
	public int delEmployee(int id) {
		String mainSQLQuery = "DELETE FROM emp WHERE id=?";
	    int rows = template.update(mainSQLQuery , id);
	    return rows;
	}


}
