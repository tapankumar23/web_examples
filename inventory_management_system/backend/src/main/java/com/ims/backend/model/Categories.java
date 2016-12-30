package com.ims.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "i_categories")
public class Categories {

	@Id
	@Column(name="C_ID")
	private Integer categoryId;
	
	@Column(name="C_NAME")
	private String categoryName;
	
	@Column(name="C_DESC")
	private String categoryDesc;

	public Integer getCategoryId(){return categoryId;}
	public void setCategoryId(Integer categoryId){this.categoryId=categoryId;}
	public String getCategoryName(){return categoryName;}
	public void setCategoryName(String categoryName){this.categoryName=categoryName;}
	public String getCategoryDesc(){return categoryDesc;}
	public void setCategoryDesc(String categoryDesc){this.categoryDesc=categoryDesc;}

	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDesc="
				+ categoryDesc + "]";
	}
}
