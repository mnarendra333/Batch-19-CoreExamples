package com.pragim.utility;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pragim.model.Student;

public class SelectStudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setStuId(rs.getInt(1));
		obj.setStuName(rs.getString(2));
		obj.setAddr(rs.getString(3));
		
		return obj;
	}

}
