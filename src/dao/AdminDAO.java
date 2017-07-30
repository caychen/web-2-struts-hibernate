package dao;

import entity.Admin;

public interface AdminDAO {
	public Admin findByCodeAndPwd(String code, String pwd) throws DAOException;
}
