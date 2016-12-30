package com.ims.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "i_customers")
public class Customer {

	@Id
	@Column(name="cust_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long customerId;
	
	@Column(name="cust_name")
	private String customerName;
	
	@Column(name="tel")
	private String telephone;
	
	@Column(name="address")
	private String adddress;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="purchased")
	private Float purchased;
	
	@Column(name="status")
	private Character status;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@CreationTimestamp
	private Date created;
	
	@CreationTimestamp
	private Date updated;
	
	public Long getCustomerId(){return customerId;}
	public void setCustomerId(Long customerId){this.customerId=customerId;}
	public String getCustomerName(){return customerName;}
	public void setCustomerName(String customerName){this.customerName=customerName;}
	public String getTelephone(){return telephone;}
	public void setTelephone(String telephone){this.telephone=telephone;}
	public String getAdddress(){return adddress;}
	public void setAdddress(String adddress){this.adddress=adddress;}
	public String getGender(){return gender;}
	public void setGender(String gender){this.gender=gender;}
	public Float getPurchased(){return purchased;}
	public void setPurchased(Float purchased){this.purchased=purchased;}
	public Character getStatus(){return status;}
	public void setStatus(Character status){this.status=status;}
	public String getCity(){return city;}
	public void setCity(String city){this.city=city;}
	public String getCountry(){return country;}
	public void setCountry(String country){this.country=country;}
	public Date getCreated(){return created;}
	public void setCreated(Date created){this.created=created;}
	public Date getUpdated(){return updated;}
	public void setUpdated(Date updated){this.updated=updated;}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", telephone=" + telephone
				+ ", adddress=" + adddress + ", gender=" + gender + ", purchased=" + purchased + ", status=" + status
				+ ", city=" + city + ", country=" + country + ", created=" + created + ", updated=" + updated + "]";
	}
}
