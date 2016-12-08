package com.ims.backend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "i_users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String emailId;
	private String password;
	private String phone;
	
	@CreationTimestamp
	private Date created;
	
	public User() {}
	public User(Long userId, String firstName, String lastName, String userName, String emailId, String password, String phone, Date created) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.phone = phone;
		this.created = created;
	}

	public Long getUserId(){return userId;}
	public void setUserId(Long userId){this.userId=userId;}
	public String getFirstName(){return firstName;}
	public void setFirstName(String firstName){this.firstName=firstName;}
	public String getLastName(){return lastName;}
	public void setLastName(String lastName){this.lastName=lastName;}
	public String getUserName(){return userName;}
	public void setUserName(String userName){this.userName=userName;}
	public String getEmailId(){return emailId;}
	public void setEmailId(String emailId){this.emailId=emailId;}
	public String getPassword(){return password;}
	public void setPassword(String password){this.password=password;}
	public String getPhone(){return phone;}
	public void setPhone(String phone){this.phone=phone;}
	public Date getCreated(){return created;}
	public void setCreated(Date created){this.created=created;}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", emailId=" + emailId + ", password=" + password + ", phone=" + phone + ", created="
				+ created + "]";
	}
}
