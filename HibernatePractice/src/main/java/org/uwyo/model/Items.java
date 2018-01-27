package org.uwyo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class Items {
	
	@Id
	@Column(name="ITEMID")
	private int itemId;
	
	@Column(name="ITEMNAME")
	private int itemName;
	
	@Column(name="INITIALPRICE")
	private float initialPrice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemName() {
		return itemName;
	}

	public void setItemName(int itemName) {
		this.itemName = itemName;
	}

	public float getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(int initialPrice) {
		this.initialPrice = initialPrice;
	}
}
