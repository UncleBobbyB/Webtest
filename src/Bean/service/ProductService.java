package Bean.service;

import java.util.*;

import Bean.dao.IProductDao;
import Bean.dao.ProductDaoImpl;
import Bean.db.DBConnection;
import Bean.pojo.Product;

public class ProductService implements IProductDao {

	private DBConnection dbconn = null;
	private IProductDao dao = null;
	
	public ProductService() throws Exception {
		this.dbconn = new DBConnection();
		this.dao = new ProductDaoImpl(this.dbconn.getConnection());
	}
	
	@Override
	public boolean addProduct(Product product) throws Exception {
		boolean flag = false;
		try {
			if (this.dao.findByProductId(product.getProduct_id()) == null) {
				flag = this.dao.addProduct(product);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbconn.close();
		}
		return flag;
	}
	@Override
	public List<Product> findAll(String product_name) throws Exception {
		List<Product> all = null;
		try {
			all = this.dao.findAll(product_name);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbconn.close();
		}
		return all;
	}
	@Override
	public Product findByProductId(String product_id) throws Exception {
		Product product = null;
		try {
			product = this.dao.findByProductId(product_id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbconn.close();
		}
		return product;
	}
	
}
