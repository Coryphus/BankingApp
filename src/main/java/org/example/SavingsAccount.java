package org.example;

public class SavingsAccount extends BankAccount{
    float interestRate;

    public SavingsAccount(double balance, double minimumBalance, float interestRate, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    public void giveInterest() {
        setBalance(getBalance()* interestRate/100);
    }

}
