package dao;

import dao.impl.AdminDAOImpl;
import dao.impl.CostDAOHibernateImpl;

public class DAOFactory {
	//public static CostDAO costDAO = new CostDAOImpl();
	public static CostDAO costDAO = new CostDAOHibernateImpl();
	public static AdminDAO adminDAO = new AdminDAOImpl();
	
	public static CostDAO getCostDAO(){
		return costDAO;
	}
	
	public static AdminDAO getAdminDAO(){
		return adminDAO;
	}
}
