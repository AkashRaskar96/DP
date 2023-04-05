package com.aakash.test;

import com.aakash.dao.DAO;
import com.aakash.dao.DBCourseDAO;
import com.aakash.factory.DBDAOFactory;
import com.aakash.factory.ExcelDAOFactory;

public class AppProblemTest {

	public static void main(String[] args) {
		DAO studDAO=DBDAOFactory.createDAO("student");
		DAO courseDAO=ExcelDAOFactory.createDao("course");
		studDAO.insert();
		System.out.println("---------------------");
		courseDAO.insert();

	}

}
/*
Output ::
 
DBCourseDAO.insert() :: Inserting Student Details In DB
---------------------
DBCourseDAO.insert() :: Inserting Course Details In Excel
*/
