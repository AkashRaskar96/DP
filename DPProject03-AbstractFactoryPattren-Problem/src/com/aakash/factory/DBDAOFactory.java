package com.aakash.factory;

import com.aakash.dao.DAO;
import com.aakash.dao.DBCourseDAO;
import com.aakash.dao.DBStudentDAO;

public class DBDAOFactory {
	public static DAO createDAO(String type) {
		DAO dao=null;
		if(type.equalsIgnoreCase("Student"))
			dao=new DBStudentDAO();
		else if(type.equalsIgnoreCase("course"))
			dao=new DBCourseDAO();
		else 
			throw new IllegalArgumentException("Invalid DAO Type");
		return dao;
	}
}

