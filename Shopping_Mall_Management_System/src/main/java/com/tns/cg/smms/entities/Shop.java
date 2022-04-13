package com.tns.cg.smms.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shop")

public class Shop implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "shopId")
	private int shopId;
	@Column(name = "shopCategory")
	private String shopCategory;
	@Column(name = "shopName")
	private String shopName;
	@Column(name = "customers")
	private String customers;
	@Column(name = "shopStatus")
	private String shopStatus;
	@Column(name = "leaseStatus")
	private String leaseStatus;

//Mapping
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> shopEmployeeID;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> itemID;

//GETTER & SETTER

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public List<Employee> getShopEmployeeID() {
		return shopEmployeeID;
	}

	public void setShopEmployeeID(List<Employee> shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public List<Item> getItemID() {
		return itemID;
	}

	public void setItemID(List<Item> itemID) {
		this.itemID = itemID;
	}

}
