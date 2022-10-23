package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	ArrayList<InsurancePolicy> insurancePolicyArrayList = new ArrayList<>();
    boolean cont = true;
    Scanner scan = new Scanner(System.in);
    while (cont){
        System.out.println("1 – Create Health Insurance Policy\n" +
                "2 – Create Term-Life Insurance Policy\n" +
                "3 – Exit\n" +
                "Enter Choice:");
        switch (scan.nextInt()){
            case 1:
                System.out.println("Enter name of policy holder:");
                String name = scan.next();
                System.out.println("Enter deductible amount:");
                double deductible = scan.nextDouble();
                System.out.println("Enter co-payment amount:");
                double coPay = scan.nextDouble();
                System.out.println("Enter total out-of-pocket amount:");
                double outOfPocket = scan.nextDouble();
                insurancePolicyArrayList.add(new HealthInsurancePolicy(name,deductible,coPay,outOfPocket));
                break;
            case 2:
                System.out.println("Enter name of policy holder:");
                String inputname = scan.next();
                System.out.println("Enter name of beneficiary:");
                String beneficiary = scan.next();
                System.out.println("Enter number of years in term:");
                int termLength = scan.nextInt();
                System.out.println("Enter amount of payout:");
                double payout = scan.nextDouble();
                insurancePolicyArrayList.add(new TermLifeInsurancePolicy(inputname,beneficiary,termLength,payout));
                break;
            case 3:
                cont = false;
                break;
            default:
                System.out.println("Error: Please Enter Valid Input");
        }
    }
    for (int i = 0; i < insurancePolicyArrayList.size(); i++){
        System.out.println(insurancePolicyArrayList.get(i).getPolicyHolder());
        System.out.println(insurancePolicyArrayList.get(i).getPolicyNumber());
        if (insurancePolicyArrayList.get(i) instanceof HealthInsurancePolicy){
            System.out.println("Met Deductible: " + ((HealthInsurancePolicy) insurancePolicyArrayList.get(i)).hasMetDeductible());
            System.out.println("Met Total Out-of-Pocket: " + ((HealthInsurancePolicy) insurancePolicyArrayList.get(i)).hasMetTotalOutOfPocket());
        }
        System.out.println();
    }
    }
}
