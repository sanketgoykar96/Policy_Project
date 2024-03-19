package com.sanket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
