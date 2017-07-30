package action;

import java.util.List;
import java.util.Map;

import dao.CostDAO;
import dao.DAOException;
import dao.DAOFactory;
import entity.Cost;

public class ListCostAction {
	private int perPages = 5;
	
	//Input
	private int page = 1;
	
	private Map<String ,String> statusOptions;
	
	public Map<String, String> getStatusOptions() {
		return statusOptions;
	}

	public void setStatusOptions(Map<String, String> statusOptions) {
		this.statusOptions = statusOptions;
	}

	//Output
	private int totalPages; 
	
	private List<Cost> costList;
	private CostDAO costDAO = DAOFactory.getCostDAO();
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public List<Cost> getCostList() {
		return costList;
	}

	public void setCostList(List<Cost> costList) {
		this.costList = costList;
	}
	
	public String execute() throws DAOException{
		costList = costDAO.findAll(page, perPages);
		totalPages = costDAO.getTotalPages(perPages);
		
		statusOptions = costDAO.getCostStatusOptions();
		return "success";
	}

}
