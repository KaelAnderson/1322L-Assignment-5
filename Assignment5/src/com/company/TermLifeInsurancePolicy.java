package com.company;

public class TermLifeInsurancePolicy extends InsurancePolicy{
    private String beneficiary;
    private int term;
    private double termPayout;
    TermLifeInsurancePolicy(String inputName, String inputBeneficiary, int inputTerm, double inputTermPayout){
        super(inputName);
        beneficiary = inputBeneficiary;
        term = inputTerm;
        termPayout = inputTermPayout;
    }
    public String getBeneficiary() {
        return beneficiary;
    }
    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }
    public int getTerm() {
        return term;
    }
    public void setTerm(int term) {
        this.term = term;
    }
    public double getTermPayout() {
        return termPayout;
    }
    public void setTermPayout(double termPayout) {
        this.termPayout = termPayout;
    }

    @Override
    void selectPolicyCoverage() {
    System.out.println("selecting policy coverages");
    }

    @Override
    void calculatePremium() {
    System.out.println("calculating and updating premium");
    }

    @Override
    public String toString() {
        return "TermLifeInsurancePolicy{" +
                "beneficiary='" + beneficiary + '\'' +
                ", term=" + term +
                ", termPayout=" + termPayout +
                '}';
    }
}
