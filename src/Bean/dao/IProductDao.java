package Bean.dao;

import java.util.*;
import Bean.pojo.Product;

public interface IProductDao {
	
	/**
	 * 数据库 新增数据
	 * @param product 要增加的数据对象
	 * @return 是否增加成功的标记
	 * @throws Exception 抛出异常
	 */
	public boolean addProduct(Product product) throws Exception;
	
	/*
	 * 查询全部Product数据
	 * @param product_name 产品名称
	 * @return 返回全波查询结果，每一个product对象表示表的一行记录
	 * @throws Exceptoin 抛出异常 
	 */
	public List<Product> findAll(String product_name) throws Exception;
	
	/*
	 * 根据产品编号查询产品
	 * @param product_id 产品编号
	 * @return 产品的vo对象
	 * @throws Exception 抛出异常
	 */
	public Product findByProductId(String product_id) throws Exception;
}
