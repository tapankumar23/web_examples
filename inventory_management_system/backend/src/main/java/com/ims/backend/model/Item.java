package com.ims.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "i_items")
public class Item {

	@Id
	@Column(name="I_ID")
	private Long itemId;
	
	@Column(name="C_ID")
	private Long categoryId;
	
	@Column(name="I_NAME")
	private String itemName;
	
	@Column(name="I_UNIT")
	private String unit;
	
	@Column(name="I_PRICE")
	private Float price;
	
	@Column(name="I_QUANTITY")
	private Integer quantity;
	
	@Column(name="I_STATUS")
	private String status;

	public Item(){ }
	public Item(Long itemId, Long categoryId, String itemName, String unit, Float price, Integer quantity,
			String status) {
		super();
		this.itemId = itemId;
		this.categoryId = categoryId;
		this.itemName = itemName;
		this.unit = unit;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
	}
	
	public Long getItemId(){return itemId;}
	public void setItemId(Long itemId){this.itemId=itemId;}
	public Long getCategoryId(){return categoryId;}
	public void setCategoryId(Long categoryId){this.categoryId=categoryId;}
	public String getItemName(){return itemName;}
	public void setItemName(String itemName){this.itemName=itemName;}
	public String getUnit(){return unit;}
	public void setUnit(String unit){this.unit=unit;}
	public Float getPrice(){return price;}
	public void setPrice(Float price){this.price=price;}
	public Integer getQuantity(){return quantity;}
	public void setQuantity(Integer quantity){this.quantity=quantity;}
	public String getStatus(){return status;}
	public void setStatus(String status){this.status=status;}
	
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", categoryId=" + categoryId + ", itemName=" + itemName + ", unit=" + unit
				+ ", price=" + price + ", quantity=" + quantity + ", status=" + status + "]";
	}
}
