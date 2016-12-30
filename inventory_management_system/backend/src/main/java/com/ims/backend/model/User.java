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
	private Long roleId;
	private String firstName;
	private String lastName;
	private String userName;
	private String emailId;
	private String password;
	private String phone;
	private String address;
	private Date lastLogin;
	private String uStatus;
	
	@CreationTimestamp
	private Date created;
	
	public Long getUserId(){return userId;}
	public void setUserId(Long userId){this.userId=userId;}
	public Long getRoleId(){return roleId;}
	public void setRoleId(Long roleId){this.roleId=roleId;}
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
	public String getAddress(){return address;}
	public void setAddress(String address){this.address=address;}
	public Date getLastLogin(){return lastLogin;}
	public void setLastLogin(Date lastLogin){this.lastLogin=lastLogin;}
	public String getuStatus(){return uStatus;}
	public void setuStatus(String uStatus){this.uStatus=uStatus;}
	public Date getCreated(){return created;}
	public void setCreated(Date created){this.created=created;}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", roleId=" + roleId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", emailId=" + emailId + ", password=" + password + ", phone=" + phone
				+ ", address=" + address + ", lastLogin=" + lastLogin + ", uStatus=" + uStatus + ", created=" + created
				+ "]";
	}
}
