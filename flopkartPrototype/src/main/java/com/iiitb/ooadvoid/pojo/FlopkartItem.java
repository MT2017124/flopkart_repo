package com.iiitb.ooadvoid.pojo;

public class FlopkartItem
{
	private Integer id;
	private Integer Listingid;
	private String CartId; 
	private String OrderId; // Contains value only if status is 'Ordered','Dispatched','Delivered' or 'Returned'
	private String status; // Takes values - 'Available','Ordered','Dispatched','Delivered','Returned','Deleted'
	
	
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getListingid() {
		return Listingid;
	}
	public void setListingid(Integer listingid) {
		Listingid = listingid;
	}
	public String getCartId() {
		return CartId;
	}
	public void setCartId(String cartId) {
		CartId = cartId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
