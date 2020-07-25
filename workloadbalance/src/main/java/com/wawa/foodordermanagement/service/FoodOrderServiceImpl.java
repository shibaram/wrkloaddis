package com.wawa.foodordermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wawa.foodordermanagement.dao.MenuItemDAO;
import com.wawa.foodordermanagement.dao.OrderDAO;
import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.entity.Order;

@Service
public class FoodOrderServiceImpl implements FoodOrderService {
	
	@Autowired
	private MenuItemDAO menuItemDAO;
	
	@Autowired
	private OrderDAO orderDAO;
	


	@Override
	public Order saveOrder(Order order) {
		return orderDAO.saveOrder(order);
	}


	@Override
	public List<MenuItem> getAllMenuItems() {
		
		return menuItemDAO.getAllMenuItems();
	}

	
	@Override
	public List<Order> getAllOrders() {		
		return menuItemDAO.getAllOrders();
	}


	@Override
	public boolean getOrderStatus(String orderId) {
		
		return false;
	}
	

}
