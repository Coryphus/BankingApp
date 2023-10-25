package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        CurrentAccount acc1 = new CurrentAccount(10000, 1000, 1000, "Josh");

        SavingsAccount acc2 = new SavingsAccount(12032, 100, 0.03, "Alex");

        BankAccount acc3 = new BankAccount(400, 10, "Connor");
    }
}
