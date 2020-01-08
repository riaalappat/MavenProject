package com.deloitte.estore.application;

import java.util.Arrays;
import java.util.List;

import javax.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.model.Seller;


public class Mmain {

			public static void main(String[] args) {
				SessionFactory sf=new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Product.class)
						.addAnnotatedClass(Seller.class)
						.buildSessionFactory();
				
				
				Seller seller =new Seller(501,"ABC",201536,null);
				Seller seller2 =new Seller(601,"XYZ",201537,null);
				Product product=new Product (101,"MOUSE",300,null);
				
				
				product.getSellers().add(seller);
				product.getSellers().add(seller2);
				seller.getProducts().add(product);
				seller2.getProducts().add(product);
				
//				
			    Session ssn=sf.openSession();
			    Product p=ssn.get(Product.class, 101);
				Transaction tx=ssn.beginTransaction();
				ssn.save(seller);
				ssn.save(seller2);
				ssn.save(product);
				
				tx.commit();
				ssn.close();
				

			}
		}






