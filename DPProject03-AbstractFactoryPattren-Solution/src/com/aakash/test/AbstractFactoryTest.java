package com.aakash.test;

import com.aakash.dao.DAO;
import com.aakash.dao.DBCourseDAO;
import com.aakash.factory.DAOFactory;
import com.aakash.factory.DAOFactoryCreator;
import com.aakash.factory.DBDAOFactory;
import com.aakash.factory.ExcelDAOFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		//Get Factory through Abstract Factory(Super Factory)
		DAOFactory factory=DAOFactoryCreator.buildDAOFactory("DB");
		//create DAO Classes Object using factory
		DAO studDAO=factory.createDAO("student");
		DAO courseDAO=factory.createDAO("course");
		studDAO.insert();
		System.out.println("---------------------");
		courseDAO.insert();

	}

}
/*
Output ::

DBCourseDAO.insert() :: Inserting Student Details In DB
---------------------
DBCourseDAO.insert() :: Inserting Course Details In DB

*/
