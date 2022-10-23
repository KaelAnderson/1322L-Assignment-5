package com.company;

public abstract class InsurancePolicy  {
    private String policyHolder;
    private int policyNumber;
    private static int numberOfPolicies = 0;
    private double premium = 0;
    InsurancePolicy(String inputName){
        policyHolder = inputName;
        policyNumber = ++numberOfPolicies;
    }
    public String getPolicyHolder() {
        return policyHolder;
    }
    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }
    public int getPolicyNumber() {
        return policyNumber;
    }
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    public static int getNumberOfPolicies() {
        return numberOfPolicies;
    }
    public static void setNumberOfPolicies(int numberOfPolicies) {
        InsurancePolicy.numberOfPolicies = numberOfPolicies;
    }
    public double getPremium() {
        return premium;
    }
    public void setPremium(double premium) {
        this.premium = premium;
    }
    abstract void selectPolicyCoverage();
    abstract void calculatePremium();

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyHolder='" + policyHolder + '\'' +
                ", policyNumber=" + policyNumber +
                ", premium=" + premium +
                '}';
    }
}
