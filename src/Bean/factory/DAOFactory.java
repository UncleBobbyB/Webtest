package Bean.factory;

import Bean.dao.IProductDao;
import Bean.service.ProductService;

public class DAOFactory {

	public static IProductDao getIEmpDAOInstance() throws Exception {
		return new ProductService();
	}
}
