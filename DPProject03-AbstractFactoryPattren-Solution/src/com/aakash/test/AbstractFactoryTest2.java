package com.aakash.test;

import com.aakash.dao.DAO;
import com.aakash.dao.DBCourseDAO;
import com.aakash.factory.DAOFactory;
import com.aakash.factory.DAOFactoryCreator;
import com.aakash.factory.DBDAOFactory;
import com.aakash.factory.ExcelDAOFactory;

public class AbstractFactoryTest2 {

	public static void main(String[] args) {
		//get Factory throuhg Abstract Factory(super factory)
		DAOFactory  factory=DAOFactoryCreator.buildDAOFactory("Excel");
		// create DAO classes objects using  factory
		DAO studDAO=factory.createDAO("Student");
		DAO  courseDAO=factory.createDAO("course");
		studDAO.insert();
		System.out.println("..........");
		courseDAO.insert();
	}

}
/*
Output ::

DBCourseDAO.insert() :: Inserting Student Details In Excel
..........
DBCourseDAO.insert() :: Inserting Course Details In Excel

*/
