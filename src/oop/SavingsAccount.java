package oop;

import java.lang.Override;

public class SavingsAccount extends BankAccount {
    private static final double miniBal = 5000.00;

    SavingsAccount(String accountNumber, String accountName, double bal) {
        super(accountNumber, accountName, bal);
    }

    @Override
    public double withdraw(double amount) {
        double bal = getBalance();
       if(amount >0){
         if (getBalance() - amount >= miniBal) {
            System.out.println("Successfully withdrew: " + miniBal);
        }else{
            System.out.println("withdrawal failed!"); 
        }
       }else{
        System.out.println("invalid withdrawal amount!");
       }
       return bal;
    }
}
