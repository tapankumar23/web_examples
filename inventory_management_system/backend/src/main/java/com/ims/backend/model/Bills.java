package com.ims.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

public class Bills {
	
	@Id
	@Column(name="B_ID")
	private Integer billId;
	
	@Column(name="U_ID")
	private Integer userId;
	
	@Column(name="CUST_ID")
	private Integer categoryId;
	
	@Column(name="DATE")
	private Date date;
	
	@Column(name="DISCOUNT")
	private Float discount;
	
	@Column(name="PAYMENT")
	private String payment;
	
	@Column(name="TOTAL")
	private Integer total;
	
	@Column(name="STATUS")
	private String status;
	
	@CreationTimestamp
	private Date created;
	
	@CreationTimestamp
	private Date updated;

	public Integer getBillId(){return billId;}
	public void setBillId(Integer billId){this.billId=billId;}
	public Integer getUserId(){return userId;}
	public void setUserId(Integer userId){this.userId=userId;}
	public Integer getCategoryId(){return categoryId;}
	public void setCategoryId(Integer categoryId){this.categoryId=categoryId;}
	public Date getDate(){return date;}
	public void setDate(Date date){this.date=date;}
	public Float getDiscount(){return discount;}
	public void setDiscount(Float discount){this.discount=discount;}
	public String getPayment(){return payment;}
	public void setPayment(String payment){this.payment=payment;}
	public Integer getTotal(){return total;}
	public void setTotal(Integer total){this.total=total;}
	public String getStatus(){return status;}
	public void setStatus(String status){this.status=status;}
	public Date getCreated(){return created;}
	public void setCreated(Date created){this.created=created;}
	public Date getUpdated(){return updated;}
	public void setUpdated(Date updated){this.updated=updated;}
	
	@Override
	public String toString() {
		return "Bills [billId=" + billId + ", userId=" + userId + ", categoryId=" + categoryId + ", date=" + date
				+ ", discount=" + discount + ", payment=" + payment + ", total=" + total + ", status=" + status
				+ ", created=" + created + ", updated=" + updated + "]";
	}
}
