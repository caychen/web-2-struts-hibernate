package action;

import java.util.Map;

import dao.CostDAO;
import dao.DAOFactory;
import entity.Cost;


public class DetailAction implements BaseAction{

	private Integer id;
	private Map<String, String> statusOptions;
	private Cost cost;
	private Integer page;
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	private CostDAO costDAO = DAOFactory.getCostDAO();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}
	
	public Map<String, String> getStatusOptions() {
		return statusOptions;
	}

	public void setStatusOptions(Map<String, String> statusOptions) {
		this.statusOptions = statusOptions;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		statusOptions = costDAO.getCostStatusOptions();
		cost = costDAO.findById(id);
		return "success";
	}

	
	
}
