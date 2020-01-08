package com.deloitte.estore.repo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.estore.model.Product;

public class ProductRepoImpl implements ProductRepo{
	Connection con=null;
	
	@Override
	public Connection getDbConnection() {
		// TODO Auto-generated method stub
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		}
		catch(Exception e) {}
			return con;
	}
	 
	
	@Override
	public boolean addProduct(Product product) throws Exception {
		
		
		Connection con=getDbConnection();
		PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");
		ps.setInt(1, product.getPID());
		ps.setString(2, product.getPNAME());
		ps.setFloat(3, product.getPRICE());
		return ps.executeUpdate()>0;
		
	}

	@Override
	public boolean deleteProduct(Product product)  throws Exception{
		// TODO Auto-generated method stub
		Connection con=getDbConnection();
		PreparedStatement ps=con.prepareStatement("delete from  product where PID=?");
		ps.setInt(1, product.getPID());
	
		return ps.executeUpdate()>0;
	
	}

	@Override
	public boolean updateProduct(Product product) throws Exception{
		// TODO Auto-generated method stub
		Connection con=getDbConnection();
		PreparedStatement ps=con.prepareStatement("update product set PNAME=?, PRICE=? where PID=?");
		ps.setString(1, product.getPNAME());
		ps.setFloat(2, product.getPRICE());
		ps.setInt(3, product.getPID());
		return ps.executeUpdate()>0;
		
	}

	@Override
	public Product getProductById(int productId)throws Exception {
		// TODO Auto-generated method stub
		Connection con=getDbConnection();
		PreparedStatement ps=con.prepareStatement("select * from product where PID=?");
		ps.setInt(1, productId);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
		
		Product pr=new Product();
		pr.setPID(productId);
		pr.setPNAME(rs.getString("PNAME"));
		pr.setPRICE(rs.getFloat("PRICE"));
		return pr;
		}
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		Connection con=getDbConnection();
		PreparedStatement ps=con.prepareStatement("select * from product ");
		
		ResultSet rs=ps.executeQuery();
		List<Product> products=new ArrayList<>();
		while(rs.next()) {
		
		Product pr=new Product();
		pr.setPID(rs.getInt("PID"));
		pr.setPNAME(rs.getString("PNAME"));
		pr.setPRICE(rs.getFloat("PRICE"));
		products.add(pr);
		}
		return products;
		
	}

	
		
	

}
