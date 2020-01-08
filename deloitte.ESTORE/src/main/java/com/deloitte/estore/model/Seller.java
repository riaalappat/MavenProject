package com.deloitte.estore.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.*;
import javax.persistence.*;
	@Entity
	@Table(name="Seller_details")
	public class Seller {
		
		@Id
		int sellerId;
		String sellerName;
		int gstn;
		
		
		public Seller() {}
		
		

		public Seller(int sellerId, String sellerName, int gstn, List<Product> products) {
			super();
			this.sellerId = sellerId;
			this.sellerName = sellerName;
			this.gstn = gstn;
			this.products = new ArrayList();
		}



		public int getSellerId() {
			return sellerId;
		}



		public void setSellerId(int sellerId) {
			this.sellerId = sellerId;
		}



		public String getSellerName() {
			return sellerName;
		}



		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}



		public int getGstn() {
			return gstn;
		}



		public void setGstn(int gstn) {
			this.gstn = gstn;
		}



		public List<Product> getProducts() {
			return products;
		}



		public void setProducts(List<Product> products) {
			this.products = products;
		}



		@ManyToMany
		private List<Product> products=new ArrayList<>();


		@Override
		public String toString() {
			return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", gstn=" + gstn + ", products="
					+ products + "]";
		}
		
		
		}
		
		
		
		

		
		