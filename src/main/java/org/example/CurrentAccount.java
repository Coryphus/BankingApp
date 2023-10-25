package org.example;

public class CurrentAccount extends BankAccount{
    double maxWithdraw;

    public CurrentAccount(double balance, double minimumBalance, double maxWithdraw, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);
        this.maxWithdraw = maxWithdraw;
    }

    public void withdraw(double withdraw){
        if(withdraw > maxWithdraw) {
            System.out.println("Error, your max withdraw amount is " + maxWithdraw);
        } else {
            setBalance(getBalance() - withdraw);
        }
    }


}
