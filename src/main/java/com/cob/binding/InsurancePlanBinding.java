package com.cob.binding;

public class InsurancePlanBinding {
//	private int srNo;
	private String citizenName;
	private String insurancePlanName;
	private boolean eligible;

//	public int getSrNo() {
//		return srNo;
//	}
//
//	public void setSrNo(int srNo) {
//		this.srNo = srNo;
//	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public String getInsurancePlanName() {
		return insurancePlanName;
	}

	public void setInsurancePlanName(String insurancePlanName) {
		this.insurancePlanName = insurancePlanName;
	}

	public boolean isEligible() {
		return eligible;
	}

	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}

	@Override
	public String toString() {
		return "InsurancePlanBinding [citizenName=" + citizenName + ", insurancePlanName=" + insurancePlanName
				+ ", eligible=" + eligible + "]";
	}

}
