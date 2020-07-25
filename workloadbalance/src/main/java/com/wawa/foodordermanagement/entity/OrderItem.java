package com.wawa.foodordermanagement.entity;

public class OrderItem {

	private Integer order_item_id;
	private String item_name;
	
	private Integer item_quantity;
	private String order_item_status;
	
	private String item_type;
	
	private String order_id;

	public OrderItem(Integer order_item_id, String item_name, Integer item_quantity, String order_item_status,
			String item_type, String order_id) {
		super();
		this.order_item_id = order_item_id;
		this.item_name = item_name;
		this.item_quantity = item_quantity;
		this.order_item_status = order_item_status;
		this.item_type = item_type;
		this.order_id = order_id;
	} 
	
	public OrderItem(String item_name, Integer item_quantity, String order_item_status,
			String item_type, String order_id) {
		super();		
		this.item_name = item_name;
		this.item_quantity = item_quantity;
		this.order_item_status = order_item_status;
		this.item_type = item_type;
		this.order_id = order_id;
	}

	public Integer getOrder_item_id() {
		return order_item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public Integer getItem_quantity() {
		return item_quantity;
	}

	public String getOrder_item_status() {
		return order_item_status;
	}

	public String getItem_type() {
		return item_type;
	}

	public String getOrder_id() {
		return order_id;
	}
	
	
	
}
