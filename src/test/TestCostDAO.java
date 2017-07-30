package test;

import java.util.List;

import org.junit.Test;

import dao.CostDAO;
import dao.DAOException;
import dao.DAOFactory;
import entity.Cost;

public class TestCostDAO {

	@Test
	public void test() throws DAOException {
		CostDAO costDAO = DAOFactory.getCostDAO();
		int totalPages = costDAO.getTotalPages(5);
		
		for(int i = 1; i <= totalPages;++i){
			List<Cost> costList = costDAO.findAll(i, 5);
			System.out.println("#" + i);
			for (Cost cost : costList) {
				System.out.println(cost.getId());
			}
		}
	}

}
