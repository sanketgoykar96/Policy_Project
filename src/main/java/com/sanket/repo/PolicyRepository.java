package com.sanket.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy,Long>{

}
