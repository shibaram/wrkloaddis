package com.wawa.foodordermanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wawa.foodordermanagement.entity.MenuItem;
import com.wawa.foodordermanagement.entity.Order;
import com.wawa.foodordermanagement.entity.OrderItem;

@Repository
public class DBHelper {
	
	private static volatile List<MenuItem> menuItemsDbData = new ArrayList<MenuItem>();
	private static volatile List<Order> allOrdersDbData = new ArrayList<Order>();
	
	static {
		
		String pizza_url = "https://www.refrigeratedfrozenfood.com/ext/resources/NEW_RD_Website/DefaultImages/default-pizza.jpg?1430942592";
		String burger_url = "https://upload.wikimedia.org/wikipedia/commons/4/4d/Cheeseburger.jpg";
		
		//MenuItem(long menu_item_id, String item_id, String item_type, String item_description)
		MenuItem menuItem1 = new MenuItem(10000, "CHIBUR001", "NON-VEG", "Chicken Burger", 2.99, burger_url);
		MenuItem menuItem2 = new MenuItem(10001, "VEGBUR001", "VEG", "Veg Burger", 1.99, burger_url);
		MenuItem menuItem3 = new MenuItem(10002, "VEGPIZ001", "VEG", "Veg Pizza", 5.99, pizza_url);
		MenuItem menuItem4 = new MenuItem(10003, "CHIPIZ001", "NON-VEG", "Chicekn Pizza", 6.99, pizza_url);
				
		menuItemsDbData.add(menuItem1);
		menuItemsDbData.add(menuItem2);
		menuItemsDbData.add(menuItem3);
		menuItemsDbData.add(menuItem4);
		
		ArrayList<OrderItem> arrList = new ArrayList<OrderItem>();	
		
		//(Integer order_item_id, String item_name, Integer item_quantity, String order_item_status,
		//String item_type, String order_id) 
		OrderItem oi1 = new OrderItem(1000,"CHK-1",2,"InProgress","","");		
		OrderItem oi2 = new OrderItem(1001,"CHK-2",2,"InProgress","","");
		OrderItem oi3 = new OrderItem(1002,"CHK-3",2,"InProgress","","");
		OrderItem oi4 = new OrderItem(1003,"CHK-4",2,"InProgress","","");
		
		arrList.add(oi1);
		arrList.add(oi2);
		arrList.add(oi3);
		arrList.add(oi4);
		
		Order item1 = new Order("10000", "Mobile", "InProgress");
		item1.setOrderItems(arrList);
		
		ArrayList<OrderItem> arrList11 = new ArrayList<OrderItem>();
		
		OrderItem oi11 = new OrderItem(2000,"CHK-1",2,"InProgress","","");		
		OrderItem oi22 = new OrderItem(2001,"CHK-2",2,"InProgress","","");
		OrderItem oi33 = new OrderItem(2002,"CHK-3",2,"InProgress","","");
		OrderItem oi44 = new OrderItem(2003,"CHK-4",2,"InProgress","","");
		
		arrList11.add(oi11);
		arrList11.add(oi22);
		arrList11.add(oi33);
		arrList11.add(oi44);
		
		Order item12 = new Order("20000", "Web", "InProgress");
		
		item12.setOrderItems(arrList11);	
				
		allOrdersDbData.add(item1);
		allOrdersDbData.add(item12);
		
	} 
	
	
	DBHelper(){
		
	}
	
	public static List<MenuItem> getAllMenuItemsDataFromDb(){
		return menuItemsDbData;
	}
	
	public static List<Order> getAllOrderDataFromDb(){
		return allOrdersDbData;
	}

}

