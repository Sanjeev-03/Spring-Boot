package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Parking_Details")
public class Parking {
	
	@Id
	
	private int Allot_No;
	
	private String Reg_No;
	
	private String Cust_Name;
	
	private String Time_in;
	
	private long phone_number;

	public int getAllot_No() {
		return Allot_No;
	}

	public void setAllot_No(int allot_No) {
		Allot_No = allot_No;
	}

	public String getReg_No() {
		return Reg_No;
	}

	public void setReg_No(String reg_No) {
		Reg_No = reg_No;
	}

	public String getCust_Name() {
		return Cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}

	public String getTime_in() {
		return Time_in;
	}

	public void setTime_in(String time_in) {
		Time_in = time_in;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public Parking(int allot_No, String reg_No, String cust_Name, String time_in, long phone_number) {
		super();
		Allot_No = allot_No;
		Reg_No = reg_No;
		Cust_Name = cust_Name;
		Time_in = time_in;
		this.phone_number = phone_number;
	}
	
	public Parking()
	{
		
		
	}
	
	
	

}
