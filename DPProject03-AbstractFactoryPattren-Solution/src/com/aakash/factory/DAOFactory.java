package com.aakash.factory;

import com.aakash.dao.DAO;

public interface DAOFactory {
	public DAO createDAO(String type);
}
