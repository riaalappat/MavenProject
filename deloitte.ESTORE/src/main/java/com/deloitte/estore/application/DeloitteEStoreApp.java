package com.deloitte.estore.application;


import org.hibernate.Transaction;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServicImpl;


public class DeloitteEStoreApp {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		
		
		Session ssn=sf.openSession();
		Transaction tx=ssn.beginTransaction();
		Query q=ssn.createQuery("from Product");
		List<Product> products=q.getResultList();
		products.forEach(System.out::println);
		
		tx.commit();
		ssn.close();
		

	}
}
