package test;

import org.junit.Test;

import dao.DAOException;
import dao.DAOFactory;
import entity.Admin;

public class TestAdminDAO {

	@Test
	public void test() throws DAOException {
		Admin admin = DAOFactory.getAdminDAO().findByCodeAndPwd("123456", "123456");
		System.out.println(admin.getName());
	}

}
