package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import dao.AdminDAO;
import dao.DAOException;
import dao.DAOFactory;
import data.Constance;
import entity.Admin;

public class LoginAction implements SessionAware{

	private Admin admin;
	private Map<String, Object> session;
	
	private String errMsg;
	
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	private AdminDAO adminDAO = DAOFactory.getAdminDAO();
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String execute() throws DAOException{
		//System.out.println(admin.getPassword());
		admin = adminDAO.findByCodeAndPwd(admin.getCode(), admin.getPassword());
		if(admin != null){
			//把用户信息存到session
			session.put(Constance.ADMIN_KEY, admin);
			//System.out.println("success");
			return "success";
		}else{
			return "fail";
		}
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session = arg0;
	}
}
