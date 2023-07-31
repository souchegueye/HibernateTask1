package com.momo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productdetails")
public class ProductDetails {

	@Id
	@Column(name = "pid")
	private int prodId;
	@Column(name = "pname")
	private String prodname;
	@Column(name = "price")
	private double prodPrice;
	@Column(name = "quantity")
	private int prodQuantity;
	@Override
	public String toString() {
		return "ProductDetails [prodId=" + prodId + ", prodname=" + prodname + ", prodPrice=" + prodPrice
				+ ", prodQuantity=" + prodQuantity + ", prodTax=" + prodTax + ", prodTotalPrice=" + prodTotalPrice
				+ "]";
	}

	@Column(name = "tax")
	private double prodTax;
	@Column(name = "totalprice")
	private double prodTotalPrice;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdQuantity() {
		return prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	public double getProdTax() {
		return prodTax;
	}

	public void setProdTax(double prodTax) {
		this.prodTax = prodTax;
	}

	public double getProdTotalPrice() {
		return prodTotalPrice;
	}

	public void setProdTotalPrice(double prodTotalPrice) {
		this.prodTotalPrice = prodTotalPrice;
	}

}