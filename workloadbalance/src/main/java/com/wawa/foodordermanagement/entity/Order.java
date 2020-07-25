package com.wawa.foodordermanagement.entity;

import java.util.List;

import com.wawa.foodordermanagement.entity.OrderItem;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Order")
*/
public class Order {	
	 
	//@GeneratedValue(strategy=GenerationType.ID)
	private String orderId; 
	private String channel;
	private String status;
	private List<OrderItem> orderItems;
	
	public Order() {
		
	}

	public Order(String orderId, String channel, String status) {
		super();
		this.orderId = orderId;
		this.channel = channel;
		this.status = status;
	}



	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getChannel() {
		return channel;
	}


	public void setChannel(String channel) {
		this.channel = channel;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
}
