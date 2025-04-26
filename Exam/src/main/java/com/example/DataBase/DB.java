package com.example.DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.Model.Child;
import com.example.Model.Mother;

public class DB {
	
	@Autowired
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insertMother(Mother mother) {
		String sql = "INSERT INTO MotherData VALUES(?,?,?,?,?,?)";
		int rows = template.update(sql,mother.getMothers_id(),mother.getMother_name(),mother.getChild_name(),mother.getHusband_name(),mother.getMother_age(),mother.getMo_phone_no());
		return rows;
	}

	public int insertChild(Child child) {
		String sql = "INSERT INTO ChildData VALUES(?,?,?,?,?,?,?)";
		int rows = template.update(sql,child.getChilds_id(),child.getChild_name(),child.getChild_birtdate(),child.getFather_name(),child.getMother_name(),child.getChild_age(),child.getCh_phone_no());
		return rows;
	}
	
	public List<Mother> viewMother()
	{
		String sql = "SELECT * FROM MotherData";
		List<Mother> mother = template.query(sql, new RowMapper<Mother>(){
			@Override
			public Mother mapRow(ResultSet rs, int rowNum) throws SQLException{
				Mother mother = new Mother();
				mother.setMother_name(rs.getString(""));
			}
		});
	}
}










