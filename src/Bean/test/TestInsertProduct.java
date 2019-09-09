package Bean.test;

import Bean.factory.DAOFactory;
import Bean.pojo.Product;

public class TestInsertProduct {

	public static void main (String[] args) {
//		System.out.println("****************************************");
		Product product = null;
		try {
			for (int i = 0; i < 5; i++) {
				product = new Product();
				product.setProduct_id("10086" + i);
				product.setProduct_name("水杯" + i);
				product.setPrice(100 + i);
				product.setInfo("杯子");
				DAOFactory.getIEmpDAOInstance().addProduct(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
