package com.csc.domain;

public final class InsurancePolicyImpl {

	private int policyId;
	private String policyName;
	private int tenure;
	private int premium;

	public InsurancePolicyImpl() {
		System.out.println("InsurancePolicyImpl:0-param constructor");
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "InsurancePolicyImpl [policyId=" + policyId + ", policyName=" + policyName + ", tenure=" + tenure
				+ ", premium=" + premium + "]";
	}

}
