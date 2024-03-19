package com.sanket.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.model.Policy;
import com.sanket.service.PolicyService;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {
	
	@Autowired
    private PolicyService policyService;

    
//    public PolicyController(PolicyService policyService) {
//        this.policyService = policyService;
//    }

    @PostMapping
    public ResponseEntity<Policy> createPolicy(@RequestBody Policy policy) {
        Policy savedPolicy = policyService.savePolicy(policy);
        return new ResponseEntity<>(savedPolicy, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<Policy>> getAllPolicies() {
        List<Policy> policies = policyService.getAllPolicies();
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Policy> getPolicyById(@PathVariable("id") Long id) {
//        return policyService.getPolicyById(id)
//                .map(policy -> new ResponseEntity<>(policy, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePolicy(@PathVariable("id") Long id) {
        policyService.deletePolicyById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
