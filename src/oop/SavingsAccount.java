package oop;

import java.lang.Override;

public class SavingsAccount extends BankAccount {
    private static final double miniBal = 5000.00;

    SavingsAccount(String accountNumber, String accountName, double bal) {
        super(accountNumber, accountName, bal);
    }

    @Override
    public double withdraw(double amount) {
        double checkBal = getBalance() - amount;
        if (amount > 0) {
            if (checkBal < miniBal) {
                System.out.println("withdrawal failed: you can't withdraw such amount, try the lesser one");
            } else {
                setBal(checkBal);
                System.out.println("Successfully withdrew $" + amount);
                System.out.println("Your remaining balance is $" + checkBal);
            }
        } else {
            System.out.println("To withdraw from this account enter valid amount!");
        }
        return 0.0;
    }

}
