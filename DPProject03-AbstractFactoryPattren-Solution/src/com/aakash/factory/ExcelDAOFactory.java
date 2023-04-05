package com.aakash.factory;

import com.aakash.dao.DAO;
import com.aakash.dao.ExcelCourseDAO;
import com.aakash.dao.ExcelStudentDAO;

public class ExcelDAOFactory implements DAOFactory{
	@Override
	public DAO createDAO(String type) {
		DAO dao=null;
		if(type.equalsIgnoreCase("student"))
			dao=new ExcelStudentDAO();
		else if(type.equalsIgnoreCase("course"))
			dao=new ExcelCourseDAO();
		else
			throw new IllegalArgumentException("Ivalid DAO Type.....?");
		return dao;
	}
}
