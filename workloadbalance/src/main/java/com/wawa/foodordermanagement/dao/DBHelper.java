package com.wawa.foodordermanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wawa.foodordermanagement.entity.MenuItem;

@Repository
public class DBHelper {
	
	private static volatile List<MenuItem> menuItemsDbData = new ArrayList<MenuItem>();
	static {
		
		//MenuItem(long menu_item_id, String item_id, String item_type, String item_description)
		MenuItem item1 = new MenuItem(10000, "CHIBUR001", "NON-VEG", "Chicken Burger", 2.99);
		MenuItem item2 = new MenuItem(10001, "VEGBUR001", "VEG", "Veg Burger", 1.99);
		MenuItem item3 = new MenuItem(10002, "VEGPIZ001", "VEG", "Veg Pizza", 5.99);
		MenuItem item4 = new MenuItem(10003, "CHIPIZ001", "NON-VEG", "Chicekn Pizza", 6.99);
				
		menuItemsDbData.add(item1);
		menuItemsDbData.add(item2);
		menuItemsDbData.add(item3);
		menuItemsDbData.add(item4);
		
		
	}
	
	DBHelper(){
		
	}
	
	public static List<MenuItem> getAllMenuItemsDataFromDb(){
		return menuItemsDbData;
	}
	
	

}

