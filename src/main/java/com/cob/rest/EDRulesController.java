package com.cob.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cob.binding.CitizenBinding;
import com.cob.binding.InsurancePlanBinding;
import com.cob.service.InsuranceService;

@RestController
public class EDRulesController {

	@Autowired
	private InsuranceService insuranceService;

//	private CitizenBinding citizenBinding;

//	@GetMapping(path = "/getDetails/{citizenId}")
//	public CitizenBinding getCitizenDetails(@PathVariable int citizenId) {
//		citizenBinding = insuranceService.getCitizenDetails(citizenId);
//		return citizenBinding;
//	}

	@PostMapping(path = "/getPlans")
	public ResponseEntity<InsurancePlanBinding> getEligiblePlans(@RequestBody CitizenBinding citizenBinding) {
		InsurancePlanBinding insurancePlanBinding = insuranceService.getEligiblePlanDetails(citizenBinding);
		return new ResponseEntity<InsurancePlanBinding>(insurancePlanBinding, HttpStatus.OK);
	}
}
