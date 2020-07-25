package com.wawa.foodordermanagement.entity;

public class Staff {

	private Integer staff_id;
	private String f_name;
	private String l_name;
	
	private String counter_type;
	
	private String contact_number;
	private String skill_type;
	
	public Staff() {
		
	}
	
	public Staff(Integer staff_id, String f_name, String l_name, String counter_type, String contact_number,
			String skill_type) {
		super();
		this.staff_id = staff_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.counter_type = counter_type;
		this.contact_number = contact_number;
		this.skill_type = skill_type;
	}

	public Integer getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getCounter_type() {
		return counter_type;
	}

	public void setCounter_type(String counter_type) {
		this.counter_type = counter_type;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getSkill_type() {
		return skill_type;
	}

	public void setSkill_type(String skill_type) {
		this.skill_type = skill_type;
	}
	
	
	
}
