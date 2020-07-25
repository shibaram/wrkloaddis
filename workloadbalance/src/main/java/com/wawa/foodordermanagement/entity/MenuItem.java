package com.wawa.foodordermanagement.entity;

public class MenuItem {

	private long menu_item_id;
	private String item_type;
	private String item_id;
	private String item_description;
	private double item_price;
	private String image_url;
	
	public MenuItem() {
		
	}
	
	public MenuItem(long menu_item_id, String item_id, String item_type, String item_description, 
			double item_price, String img_url) {
		
		this.menu_item_id = menu_item_id;
		this.item_type = item_type;
		this.item_id = item_id;
		this.item_description = item_description;
		this.item_price = item_price;
		this.image_url = img_url;
	}

	public long getMenu_item_id() {
		return menu_item_id;
	}

	public void setMenu_item_id(Integer menu_item_id) {
		this.menu_item_id = menu_item_id;
	}

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}

	public void setMenu_item_id(long menu_item_id) {
		this.menu_item_id = menu_item_id;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
}
