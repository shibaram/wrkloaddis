package com.wawa.foodordermanagement.service;

import java.util.List;

import com.wawa.foodordermanagement.entity.Customer;
import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.entity.OrderItem;
import com.wawa.foodordermanagement.entity.Order;

public interface FoodOrderService {
	
	//public List<OrderItem> getAllOrderItems();
	public List<MenuItem> getAllMenuItems();
	//public void addItem(Customer c);
	
	public List<Order> getAllOrders();
	
}
