package com.deloitte.estore.repo;
import com.deloitte.estore.model.Product;

import java.util.List;
import java.sql.Connection;

public interface ProductRepo {
	
	boolean addProduct(Product product)throws Exception;
	boolean deleteProduct(Product product)throws Exception;
	boolean updateProduct(Product product)throws Exception;
	Product getProductById(int productId)throws Exception;
	List<Product> getAllProducts()throws Exception;
	Connection getDbConnection()throws Exception;

}
