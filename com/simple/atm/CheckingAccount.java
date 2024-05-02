package com.simple.atm;

public class CheckingAccount extends Account{
    private double fee;

    public CheckingAccount(double bal, int pin, double fee)
    {
        super(bal, pin);
        this.fee = fee;

    }

    public double getFee()
    {
        return fee;
    }

}
