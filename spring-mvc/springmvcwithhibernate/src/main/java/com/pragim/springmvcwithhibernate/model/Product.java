package com.pragim.springmvcwithhibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Product {
	
	
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", qty="
				+ qty + ", price=" + price + ", manDate=" + manDate
				+ ", expDate=" + expDate + "]";
	}
	
	@Id
	private int proId;
	
	@Column(length=30)
	private String proName;
	private int qty;
	private double price;
	private Date manDate;
	private Date expDate;
	
	
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getManDate() {
		return manDate;
	}
	public void setManDate(Date manDate) {
		this.manDate = manDate;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
	
	

}
