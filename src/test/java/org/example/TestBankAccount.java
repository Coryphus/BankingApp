package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBankAccount {
    @Test
    public void TestGetBalance(){
        BankAccount acc1 = new BankAccount(5555,0, "Bob");

        Assertions.assertEquals(5555, acc1.getBalance());

    }

    @Test
    public void TestDeposit(){
        BankAccount acc1 = new BankAccount(0,0, "Henry");
        double initialBalance = 0;
        double deposit = 1000;

        acc1.deposit(deposit);

        Assertions.assertEquals(initialBalance + deposit, acc1.getBalance());

    }

    @Test
    public void TestWithdraw(){
        BankAccount acc1 = new BankAccount(102793,347, "");
        double initialBalance = 102793;
        double withdraw = 1000;

        acc1.withdraw(withdraw);

        Assertions.assertEquals(initialBalance - withdraw, acc1.getBalance());

    }

}