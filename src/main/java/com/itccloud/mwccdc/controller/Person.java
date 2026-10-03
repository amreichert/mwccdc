package com.itccloud.mwccdc.controller;

public class Person {
	
	public Person(String firstName, String lastName, String gender, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
	}
	
	
	private String firstName;
	private String lastName;
	private String gender;
	private Address address;
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", address="
				+ address + "]";
	}

}

