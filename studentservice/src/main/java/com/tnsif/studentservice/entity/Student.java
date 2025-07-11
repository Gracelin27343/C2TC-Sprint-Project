package com.tnsif.studentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) //COLUMN IN TABLE
	private Long id;// primary key
	private String name;
	private String department;
	private int registernumber;
	private int contactnumber;
	private int arrear;
	private double fees;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getRegisternumber() {
		return registernumber;
	}
	public void setRegisternumber(int registernumber) {
		this.registernumber = registernumber;
	}
	public int getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(int contactnumber) {
		this.contactnumber = contactnumber;
	}
	public int getArrear() {
		return arrear;
	}
	public void setArrear(int arrear) {
		this.arrear = arrear;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", registernumber="
				+ registernumber + ", contactnumber=" + contactnumber + ", arrear=" + arrear + ", fees=" + fees + "]";
	}
	
	
	
}
