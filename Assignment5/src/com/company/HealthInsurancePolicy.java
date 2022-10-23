package com.company;

public class HealthInsurancePolicy extends InsurancePolicy implements Deductible{
    private double deductibleLimit;
    private double totalDeductiblePaid = 0;
    private double coPayment;
    private double totalCoPaymentPaid = 0;
    private double totalOutOfPocket;
    HealthInsurancePolicy(String inputName, double inputDeductibleLimit, double inputCoPayment, double inputTotalOutOfPocket){
        super(inputName);
        deductibleLimit = inputDeductibleLimit;
        coPayment = inputCoPayment;
        totalOutOfPocket = inputTotalOutOfPocket;
    }
    public double getDeductibleLimit() {
        return deductibleLimit;
    }
    public void setDeductibleLimit(double deductibleLimit) {
        this.deductibleLimit = deductibleLimit;
    }
    public double getTotalDeductiblePaid() {
        return totalDeductiblePaid;
    }
    public void setTotalDeductiblePaid(double totalDeductiblePaid) {
        this.totalDeductiblePaid = totalDeductiblePaid;
    }
    public double getCoPayment() {
        return coPayment;
    }
    public void setCoPayment(double coPayment) {
        this.coPayment = coPayment;
    }
    public double getTotalCoPaymentPaid() {
        return totalCoPaymentPaid;
    }
    public void setTotalCoPaymentPaid(double totalCoPaymentPaid) {
        this.totalCoPaymentPaid = totalCoPaymentPaid;
    }
    public double getTotalOutOfPocket() {
        return totalOutOfPocket;
    }
    public void setTotalOutOfPocket(double totalOutOfPocket) {
        this.totalOutOfPocket = totalOutOfPocket;
    }
    @Override
    public boolean hasMetDeductible() {
        if (totalDeductiblePaid >= deductibleLimit){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean hasMetTotalOutOfPocket() {
        if((totalDeductiblePaid + totalCoPaymentPaid) >= totalOutOfPocket){
            return true;
        }else {
            return false;
        }
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
        return "HealthInsurancePolicy{" +
                "deductibleLimit=" + deductibleLimit +
                ", totalDeductiblePaid=" + totalDeductiblePaid +
                ", coPayment=" + coPayment +
                ", totalCoPaymentPaid=" + totalCoPaymentPaid +
                ", totalOutOfPocket=" + totalOutOfPocket +
                '}';
    }
}
