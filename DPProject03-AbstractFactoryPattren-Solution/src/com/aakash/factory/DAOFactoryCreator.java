package com.aakash.factory;
//
//abstract Factory Pattern  returning one of several factory classes obj
public class DAOFactoryCreator {

	//Factory of factories
	public static DAOFactory buildDAOFactory(String type) {
		DAOFactory factory=null;
		if(type.equalsIgnoreCase("DB"))
			factory=new DBDAOFactory();
		else if(type.equalsIgnoreCase("Excel"))
			factory=new ExcelDAOFactory();
		else
			throw new IllegalArgumentException();
		return factory;
	}
}
