package org.example;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private final String accountHolderName;

    public BankAccount(double balance, double minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        if((balance-withdraw) < minimumBalance) {
            System.out.println("Error, you are withdrawing beyond your minimum balance of " + minimumBalance + "\n");
            System.out.println("You have a balance of "+ balance);
        } else {
            balance -= withdraw;
        }
    }


}
