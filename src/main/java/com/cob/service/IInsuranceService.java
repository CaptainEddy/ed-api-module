package com.cob.service;

import com.cob.binding.CitizenBinding;
import com.cob.binding.InsurancePlanBinding;
import com.cob.entity.CitizenEntity;

public interface IInsuranceService {
	public CitizenBinding getCitizenDetails(int citizenId);
	public InsurancePlanBinding getEligiblePlanDetails(CitizenEntity citizenEntity);
}
