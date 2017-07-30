package action;

import dao.CostDAO;
import dao.DAOFactory;
import data.Constance.UpdateType;
import entity.Cost;

public class AddCostAction implements BaseAction {

	private Cost cost;
	
	private CostDAO costDAO = DAOFactory.getCostDAO();
	
	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		costDAO.update(cost,UpdateType.Save);
		return "success";
	}

}
