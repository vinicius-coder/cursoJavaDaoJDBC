package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class ExSellerFindById {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST1: SellerFindByID ===");
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
	}

}
