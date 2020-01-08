
package com.deloitte.estore.model;

import org.hibernate.Session;
import javax.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import org.hibernate.Transaction;

public class Manager{
	
		public static void main(String[] args) {
			try {
				
			
			SessionFactory sf=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Product.class)
					.addAnnotatedClass(Seller.class)
					.buildSessionFactory();
			
			
			Product product=new Product (101,"MOUSE",300,null);
			Seller seller =new Seller(501,"ABC",201536,null);
			Seller seller2 =new Seller(502,"ABC",201836,null);
			
			product.getSellers().add(seller);
			product.getSellers().add(seller2);
			seller.getProducts().add(product);
			seller2.getProducts().add(product);
			
			
			Session ssn=sf.openSession();
			Transaction tx=ssn.beginTransaction();
			 ssn.save(product);
			ssn.save(seller);
			ssn.save(seller2);
			tx.commit();
			ssn.close();
			}
			
			catch(Exception e) {
				System.out.println(e);
			}

		}
	}



