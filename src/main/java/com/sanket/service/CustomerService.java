package com.sanket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.model.Customer;
import com.sanket.repo.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	 private CustomerRepository customerRepository;

	    
//	    public CustomerService(CustomerRepository customerRepository) {
//	        this.customerRepository = customerRepository;
//	    }

	    public List<Customer> getAllCustomers() {
	        return customerRepository.findAll();
	    }

	    public Optional<Customer> getCustomerById(Long id) {
	        return customerRepository.findById(id);
	    }

	    public Customer saveCustomer(Customer customer) {
	        return customerRepository.save(customer);
	    }

	    public void deleteCustomerById(Long id) {
	        customerRepository.deleteById(id);
	    }

}
