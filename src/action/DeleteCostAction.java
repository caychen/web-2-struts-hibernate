package action;

import dao.CostDAO;
import dao.DAOFactory;

public class DeleteCostAction implements BaseAction {

	private Integer id;
	private Integer page;
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	private CostDAO costDAO = DAOFactory.getCostDAO();
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		costDAO.delete(id);
		return "global";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
