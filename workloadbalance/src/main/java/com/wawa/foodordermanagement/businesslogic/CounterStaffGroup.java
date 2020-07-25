package com.wawa.foodordermanagement.businesslogic;

import java.util.ArrayList;
import java.util.List;

import com.wawa.foodordermanagement.entity.Staff;

public class CounterStaffGroup {

	private static List<Staff> vegStaffs = new ArrayList<Staff>();
	private static List<Staff> nonvegStaffs = new ArrayList<Staff>();
	
	public static List<Staff> getVegStaffs() {
		return vegStaffs;
	}
	
	public static List<Staff> getNonvegStaffs() {
		return nonvegStaffs;
	}
	
	
	public void addVegStaff(Staff staff) {
		vegStaffs.add(staff);
	}
	
	public void addNonVegStaff(Staff staff) {
		nonvegStaffs.add(staff);
	}
	
}
