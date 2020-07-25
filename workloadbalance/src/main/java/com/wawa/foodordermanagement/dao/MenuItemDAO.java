package com.wawa.foodordermanagement.dao;

import java.util.List;

import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.entity.Order;

public interface MenuItemDAO {

	public List<MenuItem> getAllMenuItems();
	//public void addCustomer(Customer c);
	public List<Order> getAllOrders();
}
