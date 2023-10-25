package org.example;

public class SavingsAccount extends BankAccount{
    double interestRate;

    public SavingsAccount(double balance, double minimumBalance, double interestRate, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    public void giveInterest() {
        double interestValue = getBalance()*interestRate;
        setBalance(getBalance() + interestValue);
    }

}
