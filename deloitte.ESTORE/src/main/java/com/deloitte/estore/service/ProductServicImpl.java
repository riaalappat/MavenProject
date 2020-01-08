package com.deloitte.estore.service;

import java.sql.Connection;
import java.util.List;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.repo.ProductRepo;
import com.deloitte.estore.repo.ProductRepoImpl;


public class ProductServicImpl implements ProductService {
	
	ProductRepo repo;
	public ProductServicImpl(){
		repo=new ProductRepoImpl();
	}
	

	@Override
	public Connection getDbConnection() throws Exception{
		
			return  null;
	}
	 
	
	@Override
	public boolean addProduct(Product product) throws Exception {
		
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) throws Exception  {
		// TODO Auto-generated method stub
		
		//return repo.deleteProduct(product);
		return false;
	}

	@Override
	public boolean updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return repo.updateProduct(product);
		
	}

	@Override
	public Product getProductById(int productId) throws Exception {
		// TODO Auto-generated method stub
		return repo.getProductById(productId);
		
	}

	@Override
	public List<Product> getAllProducts() throws Exception{
		
		return repo.getAllProducts();
		
	}


	

	
		
		
	
	
	

}
