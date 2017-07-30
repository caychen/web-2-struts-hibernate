package action;

import dao.CostDAO;
import dao.DAOFactory;
import entity.Cost;

public class ValidateCostName implements BaseAction{

	private String name;
	private boolean ok = false;
	
	private CostDAO costDAO = DAOFactory.getCostDAO();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(name);
		Cost cost = costDAO.findByName(name);
		if(cost == null)
			ok = true;
		return "success";
	}

}
