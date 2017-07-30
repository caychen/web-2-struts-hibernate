package action;

import dao.CostDAO;
import dao.DAOFactory;
import entity.Cost;

public class ShowCostFormAction implements BaseAction {

	private Integer page;
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}


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
		cost = costDAO.findById(cost.getId());
		return "success";
	}

}
