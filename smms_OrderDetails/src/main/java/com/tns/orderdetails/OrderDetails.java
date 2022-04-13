package com.tns.orderdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetails {
	
	@Column(name = "id")
	private Integer id;
	@Column(name = "date_Of_Purchase")
	private String dateOfPurchase;
	@Column(name = "total")
	private float total;
	@Column(name = "payment_mode")
	private String paymentMode;
	
	public OrderDetails() {
		super();
		
	}

	public OrderDetails(Integer id, String dateOfPurchase, float total, String paymentMode) {
		super();
		this.id = id;
		this.dateOfPurchase = dateOfPurchase;
		this.total = total;
		this.paymentMode = paymentMode;
	}

	
	//GETTER & SETTER
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total + ", paymentMode="
				+ paymentMode + "]";
	}

}
