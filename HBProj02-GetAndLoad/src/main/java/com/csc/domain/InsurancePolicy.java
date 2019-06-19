package com.csc.domain;

public interface InsurancePolicy {

	public void setPolicyId(int id);

	public int getPolicyId();

	public void setPolicyName(String name);

	public String getPolicyName();

	public void setPolicyTenure(int tenure);

	public int getPolicyTenure();

	public void setPolicyPremium(int premium);

	public int getPolicyPremium();
}
