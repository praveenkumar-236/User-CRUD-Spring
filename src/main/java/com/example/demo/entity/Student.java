package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Student {
	
	@Id
	private int s_no;
	private String First_name;
	private String Last_name;
	private String DOB;
	private String Address;
	
	//no argument constructor
	public Student() {
		super();
	}
	
	//argument constructor
	public Student(int s_no, String first_name, String last_name, String dOB, String address) {
		super();
		this.s_no = s_no;
		First_name = first_name;
		Last_name = last_name;
		DOB = dOB;
		Address = address;
	}
	
	//getter and setter implementation
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	//toString implementation
	@Override
	public String toString() {
		return "Student [s_no=" + s_no + ", First_name=" + First_name + ", Last_name=" + Last_name + ", DOB=" + DOB
				+ ", Address=" + Address + "]";
	}
		
	
	
}