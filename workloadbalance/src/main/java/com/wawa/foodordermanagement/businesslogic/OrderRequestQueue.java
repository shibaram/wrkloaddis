package com.wawa.foodordermanagement.businesslogic;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.wawa.foodordermanagement.entity.Order;
import com.wawa.foodordermanagement.entity.OrderItem;

public class OrderRequestQueue {	

	 private static Queue<Order> orderRequestQueue = new LinkedList<Order>(); 
	  
	 public Queue<Order> getOrderRequestQueue() {
			return orderRequestQueue;
	 }

	//add order request to queue 
	 public static Order addOrderRequestToQueue(Order orderRequest) { 
		 orderRequestQueue.add(orderRequest); 
		 
		 return orderRequest;
	 }
	
	public boolean checkOrderServicable(Order orderRequest) {
		
		String orderId = orderRequest.getOrderId(); 
		String channel = orderRequest.getChannel();
		String status = orderRequest.getStatus();
		List<OrderItem> orderItems = orderRequest.getOrderItems();
		
		boolean service_order_flag = false;
		
		if(orderItems!= null && orderItems.size() > 0 ) {
			
			for(OrderItem item : orderItems) {
				Integer order_item_id = item.getOrder_item_id();
				String item_name = item.getItem_name();
				
				Integer item_quantity = item.getItem_quantity();
				String order_item_status;
				
				String item_type;
				String order_id;
				
			}
		}else {
			return false;
		}
		
		return true;
		
	}
	     
	public Order acceptOrderRequest() {
		
		Order order = orderRequestQueue.remove();
		
		return order;
		
	}
	      
	/*
	 * 
	 * 
	 * for (int i = 0; i < 5; i++) q.add(getOrderId()+i);
	 * 
	 * // Display contents of the queue. System.out.println("Elements of queue " +
	 * q);
	 * 
	 * // To remove the head of queue. String removedele = q.remove();
	 * System.out.println("removed element-" + removedele);
	 * 
	 * System.out.println(q);
	 * 
	 * // To view the head of queue String head = q.peek();
	 * System.out.println("head of queue-" + head);
	 * 
	 * // Rest all methods of collection // interface like size and contains // can
	 * be used with this // implementation. int size = q.size();
	 * System.out.println("Size of queue-" + size);
	 */
	        
	    
	 
	 



	public static String getOrderId() {
		 return "UISN12224";
	 }
	
}
