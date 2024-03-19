package com.sanket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.model.Policy;
import com.sanket.repo.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

//    public PolicyService(PolicyRepository policyRepository) {
//        this.policyRepository = policyRepository;
//    }

	public List<Policy> getAllPolicies() {
		return policyRepository.findAll();
	}

	public Optional<Policy> getPolicyById(Long id) {
		return policyRepository.findById(id);
	}

	public Policy savePolicy(Policy policy) {
		return policyRepository.save(policy);
	}

	public void deletePolicyById(Long id) {
		policyRepository.deleteById(id);
	}
}
