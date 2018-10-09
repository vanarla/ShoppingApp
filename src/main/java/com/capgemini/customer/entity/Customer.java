package com.capgemini.customer.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")

 public class Customer {

	@Id
	private int customerId;
	private String customerPassword;
	private String firstName;
	private String lastName;
	private long contactNumber;
	private Address address;
	
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerPassword, String firstName, String lastName,long contactNumber) {
		super();
		this.customerId = customerId;
		this.customerPassword=customerPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber=contactNumber;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
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
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerPassword=" + customerPassword + ", firstName="
				+ firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber + ", address=" + address
				+ "]";
	}
	
	
	
}
