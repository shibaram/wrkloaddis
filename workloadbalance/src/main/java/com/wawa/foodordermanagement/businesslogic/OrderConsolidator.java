package com.wawa.foodordermanagement.businesslogic;

import java.util.List;

import com.wawa.foodordermanagement.entity.Order;
import com.wawa.foodordermanagement.entity.Staff;

public class OrderConsolidator {

	/*
	 * //Order public Order pullOrderFromQueue() {
	 * 
	 * }
	 */
	
	public boolean checkVegCounterStaffAvailibility() {
		
		List<Staff> vegStffGroup = CounterStaffGroup.getVegStaffs();
		
		if(vegStffGroup.size() > 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean checkNonVegCounterStaffAvailibility() {
		
		List<Staff> nonVegStffGroup = CounterStaffGroup.getNonvegStaffs();
		
		if(nonVegStffGroup.size() > 0) {
			return true;
		}
		
		return false;
	}
	
	/*
	 * public boolean orderStatus() {
	 * 
	 * }
	 */
	
	//public checkOrder
	
}
