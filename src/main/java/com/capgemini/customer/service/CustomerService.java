package com.capgemini.customer.service;

import com.capgemini.customer.entity.Customer;
import com.capgemini.customer.exceptions.AuthenticationFailedException;
import com.capgemini.customer.exceptions.CustomerNotFoundException;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer findCustomerById(int customerId) throws CustomerNotFoundException;
	public Customer updateCustomer(Customer customer);
	public Customer authenticateCustomer(int cusomerId,String password) throws AuthenticationFailedException;
	public void deleteCustomer(int customerId);
}
