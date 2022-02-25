package com.cob.service;

import org.springframework.stereotype.Service;

import com.cob.binding.CitizenBinding;
import com.cob.binding.InsurancePlanBinding;

@Service
public class InsuranceService {

	private InsurancePlanBinding insurancePlanBinding = new InsurancePlanBinding();

	public InsurancePlanBinding getEligiblePlanDetails(CitizenBinding citizenBinding) {

		switch (citizenBinding.getInsurancePlanName()) {
		case "SNAP":
			if (citizenBinding.getCitizenIncome() >= 0 && citizenBinding.getCitizenIncome() <= 200) {

				insurancePlanBinding.setInsurancePlanName(citizenBinding.getInsurancePlanName());
				insurancePlanBinding.setCitizenName(citizenBinding.getCitizenName());
				insurancePlanBinding.setEligible(true);

				System.out.println(insurancePlanBinding);

			}

			break;

		case "CCAP":
			if (citizenBinding.getCitizenIncome() <= 200 && citizenBinding.isHaveKidsLessThan16() == true) {

				insurancePlanBinding.setInsurancePlanName(citizenBinding.getInsurancePlanName());
				insurancePlanBinding.setCitizenName(citizenBinding.getCitizenName());
				insurancePlanBinding.setEligible(true);

				System.out.println(insurancePlanBinding);
			}

			break;

		case "QQAP":
			if (citizenBinding.getCitizenAge() >= 65) {

				insurancePlanBinding.setInsurancePlanName("QQAP");
				insurancePlanBinding.setCitizenName(citizenBinding.getCitizenName());
				insurancePlanBinding.setEligible(true);

				System.out.println(insurancePlanBinding);
			}
			
			break;
		default:
			insurancePlanBinding.setInsurancePlanName(null);
			insurancePlanBinding.setCitizenName(null);
			
			System.out.println(insurancePlanBinding);
			break;
		}
		
		return insurancePlanBinding;
	}
}
