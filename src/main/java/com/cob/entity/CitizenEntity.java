package com.cob.entity;

public class CitizenEntity {
	private String citizenName;
	private double citizenIncome;
	private int citizenAge;
	private boolean haveKidsLessThan16;
	private String insurancePlanName;

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public double getCitizenIncome() {
		return citizenIncome;
	}

	public void setCitizenIncome(double citizenIncome) {
		this.citizenIncome = citizenIncome;
	}

	public int getCitizenAge() {
		return citizenAge;
	}

	public void setCitizenAge(int citizenAge) {
		this.citizenAge = citizenAge;
	}

	public boolean isHaveKidsLessThan16() {
		return haveKidsLessThan16;
	}

	public void setHaveKidsLessThan16(boolean haveKidsLessThan16) {
		this.haveKidsLessThan16 = haveKidsLessThan16;
	}

	public String getInsurancePlanName() {
		return insurancePlanName;
	}

	public void setInsurancePlanName(String insurancePlanName) {
		this.insurancePlanName = insurancePlanName;
	}
}
