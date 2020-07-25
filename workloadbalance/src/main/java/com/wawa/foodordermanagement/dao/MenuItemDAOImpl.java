package com.wawa.foodordermanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wawa.foodordermanagement.entity.Customer;
import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.entity.Order;

@Repository
public class MenuItemDAOImpl implements MenuItemDAO{
	
	@Autowired
	DBHelper dbHelper;

	@Override
	public List<MenuItem> getAllMenuItems() {		
		return DBHelper.getAllMenuItemsDataFromDb();
	}
	
	@Override
	public List<Order> getAllOrders() {		
		return DBHelper.getAllOrderDataFromDb();
	}

}
