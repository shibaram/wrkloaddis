package com.wawa.foodordermanagement.service;

import java.util.List;

import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.entity.Order;

public interface FoodOrderService {
	
	public List<MenuItem> getAllMenuItems();
	
	public Order saveOrder(Order order);
	
	public List<Order> getAllOrders();

	public boolean getOrderStatus(String orderId);
	
}
