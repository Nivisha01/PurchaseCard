package com.purchasecardservice.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PurchaseCard {
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	@Column(name="purcahseId")
	private Integer purchaseId;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="price")
	private float price;
	
	@Column(name="paymentMode")
	private String paymentMode;
	
	public PurchaseCard(String customerName, Float price, String paymentMode, Integer purchaseId) {
		super();
		this.customerName = customerName;
		this.price = price;
		this.paymentMode = paymentMode;
		this.purchaseId = purchaseId;
	}
	public PurchaseCard() {
		super();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Integer getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerName, purchaseId, paymentMode, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseCard other = (PurchaseCard) obj;
		return Objects.equals(customerName, other.customerName) && Objects.equals(purchaseId, other.purchaseId)
				&& Objects.equals(paymentMode, other.paymentMode) && Objects.equals(price, other.price);
	}
	@Override
	public String toString() {
		return "PurchaseCard [customerName=" + customerName + ", price=" + price + ", paymentMode=" + paymentMode
				+ ", purchaseId=" + purchaseId + "]";
	}
	
}
