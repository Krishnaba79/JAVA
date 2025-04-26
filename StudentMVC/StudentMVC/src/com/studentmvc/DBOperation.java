package com.studentmvc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DBOperation {
	
	JdbcTemplate template;


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int saveStudent(Student s){
		String sql="INSERT INTO student VALUES("+ s.getRollno() +
				",'"+s.getName() + "','"+s.getEmail()+"',"+s.getSem()+")";
		int row=template.update(sql);
		return row;
	}
	
	public List<Student> getAllStudents(){
		String sql="SELECT * FROM student";
		List<Student> list=template.query(sql, new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student s=new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setSem(rs.getInt("sem"));
			
				return s;
			}
		});
		
		
		return list;
	}
	
	public Student getStudentByRoll(int roll){
		String sql="SELECT * FROM student WHERE rollno=?";
		Student s=template.queryForObject(sql, new Object[]{roll},
				new BeanPropertyRowMapper<Student>(Student.class));
		return s;
	}
	
	public int updateStudent(Student s){
		String sql="UPDATE student SET name='"+s.getName()
		+"',email='"+s.getEmail()+"',sem="+s.getSem()+
		" WHERE rollno="+s.getRollno();
		int row=template.update(sql);
		return row;
	}
	

}
