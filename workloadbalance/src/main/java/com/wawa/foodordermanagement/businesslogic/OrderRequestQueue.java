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
		boolean veg_counter_available = false;
		boolean nonveg_counter_available = false;
		
		if(orderItems!= null && orderItems.size() > 0 ) {
			
			for(OrderItem item : orderItems) {
				
				String item_type = item.getItem_type();
				
				
				OrderConsolidator orderConsolidator = new OrderConsolidator();
				if("NONVEG".equalsIgnoreCase(item_type)) {
					if(orderConsolidator.checkNonVegCounterStaffAvailibility()) {
						nonveg_counter_available = true;
					}
				}else if("VEG".equalsIgnoreCase(item_type)) {
					if(orderConsolidator.checkVegCounterStaffAvailibility()) {
						veg_counter_available = true;
					}
				}
			}
			
			if(nonveg_counter_available || veg_counter_available) {
				return true;
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
