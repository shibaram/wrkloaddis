package com.wawa.foodordermanagement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.service.FoodOrderService;
import com.wawa.foodordermanagement.entity.Order;

//    /order/menuitem

@RestController
@RequestMapping("/order")
public class WordOrderController {

	@Autowired
	private FoodOrderService foodOrderService;
	
	
	
	@GetMapping("/menuitem")
	public List<MenuItem> getAllMenuItems(){
		return foodOrderService.getAllMenuItems();
	}
	
	@GetMapping("/customerorders")
	public List<Order> getAllOrders(){
		return foodOrderService.getAllOrders();
	}
	
	/*
	 * @PostMapping("/customersPortfolio") public List<CustomerPortfolio>
	 * getAllCustomers(@RequestBody Customer[] customers){ return
	 * customerPortfolioService.getCustomersPortfolio(customers); }
	 */
	
	/*
	 * @ExceptionHandler public ResponseEntity<CustomerErrorResponse>
	 * handleException(CustomerException e) {
	 * 
	 * CustomerErrorResponse errorRes = new CustomerErrorResponse();
	 * 
	 * errorRes.setStatus(HttpStatus.BAD_REQUEST.value());
	 * errorRes.setErrorMessage(e.getMessage());
	 * errorRes.setTimeStamp(System.currentTimeMillis());
	 * 
	 * 
	 * return new ResponseEntity<CustomerErrorResponse>(errorRes,
	 * HttpStatus.BAD_REQUEST);
	 * 
	 * }
	 */

}
