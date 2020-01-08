package com.deloitte.estore.service;
import com.deloitte.estore.model.Product;
import java.util.List;
import java.sql.Connection;


	

	public interface ProductService {
		
		boolean addProduct(Product product)throws Exception;
		boolean deleteProduct(Product product)throws Exception;
		boolean updateProduct(Product product)throws Exception;
		Product getProductById(int productId)throws Exception;
		List<Product> getAllProducts()throws Exception;
		Connection getDbConnection()throws Exception;

	}



