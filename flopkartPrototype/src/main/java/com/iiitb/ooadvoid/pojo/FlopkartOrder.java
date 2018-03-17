package com.iiitb.ooadvoid.pojo;

import java.util.Date;

public class FlopkartOrder {
	private Integer id;
	private String shippingAddress;
	private Integer UserId;
	private String status;   
	private String orderDate;
	private Integer totalAmount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getorderDate() {
		return orderDate;
	}
	public void setorderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public Integer gettotalAmount() {
		return totalAmount;
	}
	public void settotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer UserId) {
		this.UserId = UserId;
	}
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status = status;
	}
	public String getshippingAddress() {
		return shippingAddress;
	}
	public void setshippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
