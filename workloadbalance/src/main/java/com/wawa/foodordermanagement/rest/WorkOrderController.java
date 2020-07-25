package com.wawa.foodordermanagement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.service.FoodOrderService;
import com.wawa.foodordermanagement.entity.Order;


@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:3000")
public class WorkOrderController {

	@Autowired
	private FoodOrderService foodOrderService;
	
	
	@GetMapping("/menuitem")
	public List<MenuItem> getAllMenuItems(){
		return foodOrderService.getAllMenuItems();
	}
	
	@PostMapping("/customerorder")
	public ResponseEntity<String> saveOrder(@RequestBody Order payload){
		foodOrderService.saveOrder(payload);
		return new ResponseEntity<>("Order saved successfully", HttpStatus.OK);
	}
	
	@GetMapping("/customerorders")
	public List<Order> getAllOrders(){
		return foodOrderService.getAllOrders();
	}
	
	@GetMapping("/orderstatus")
	public boolean getOrderstatus(@RequestParam String orderId){
		return foodOrderService.getOrderStatus(orderId);
	}
	

}
