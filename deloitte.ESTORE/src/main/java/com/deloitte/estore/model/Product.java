package com.deloitte.estore.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="Product_details")
public class Product {
	
	@Id
	@Column(name="PID")
	private int PID;
	private String PNAME;
	private float PRICE;
	
	@ManyToMany
	private List<Seller> sellers=new ArrayList<>();
	
	public Product() {}

	
	
public Product(int pID, String pNAME, float pRICE, List<Seller> sellers) {
		super();
		PID = pID;
		PNAME = pNAME;
		PRICE = pRICE;
		this.sellers = new ArrayList();
	}





	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public String getPNAME() {
		return PNAME;
	}

	public void setPNAME(String pNAME) {
		PNAME = pNAME;
	}

	public float getPRICE() {
		return PRICE;
	}

	public void setPRICE(float pRICE) {
		PRICE = pRICE;
	}
	
	public List<Seller> getSellers(){
		return sellers;
	}
	public void setSellers(List<Seller> sellers) {
		this.sellers=sellers;
	
	
	}



	@Override
	public String toString() {
		return "Product [PID=" + PID + ", PNAME=" + PNAME + ", PRICE=" + PRICE + ", sellers=" + sellers + "]";
	}
	
	
}
