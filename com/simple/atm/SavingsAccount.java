package com.simple.atm;

public class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount(double bal, int pin, float rate){
        super(bal, pin);
        this.interestRate = rate;
    }

    public double calculateInterest(){
        double interest = this.getBalance() * this.interestRate;
        return interest;
    }
}
