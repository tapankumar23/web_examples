package com.ims.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import org.hibernate.annotations.CreationTimestamp;

public class BillDetails {
	
	@EmbeddedId
	private BillDetailsPK billDetailsPK;
	
	@Column(name="PRICE")
	private Float price;
	
	@Column(name="QUANTITY")
	private Integer quantity;
	
	@CreationTimestamp
	private Date created;
	
	@CreationTimestamp
	private Date updated;

	public BillDetailsPK getBillDetailsPK(){return billDetailsPK;}
	public void setBillDetailsPK(BillDetailsPK billDetailsPK){this.billDetailsPK=billDetailsPK;}
	public Float getPrice(){return price;}
	public void setPrice(Float price){this.price=price;}
	public Integer getQuantity(){return quantity;}
	public void setQuantity(Integer quantity){this.quantity=quantity;}
	public Date getCreated(){return created;}
	public void setCreated(Date created){this.created=created;}
	public Date getUpdated(){return updated;}
	public void setUpdated(Date updated){this.updated=updated;}
}

@Embeddable
class BillDetailsPK implements Serializable {
	@Column(name="B_ID")
	private Integer billId;
	
	@Column(name="I_ID")
	private Integer itemsId;

	public Integer getBillId(){return billId;}
	public void setBillId(Integer billId){this.billId=billId;}
	public Integer getItemsId(){return itemsId;}
	public void setItemsId(Integer itemsId){this.itemsId=itemsId;}
}
