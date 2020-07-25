package com.wawa.foodordermanagement.entity;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Customer")
*/
public class Order {	
	 
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String orderId; 
	private String channel;
	private String status;

	
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
	
	
	
	
}
