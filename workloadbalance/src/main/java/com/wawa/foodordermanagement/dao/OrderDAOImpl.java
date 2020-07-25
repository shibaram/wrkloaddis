package com.wawa.foodordermanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wawa.foodordermanagement.entity.Customer;
import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.entity.Order;

@Repository
public class OrderDAOImpl implements OrderDAO{
	
	@Autowired
	DBHelper dbHelper;

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return DBHelper.saveOrder(order);
	}

}
