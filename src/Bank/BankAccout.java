package Bank;

import java.util.Scanner;

public class BankAccout {

    String accountName;
    String accountNumber;
    double balance;

    BankAccout(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double currentBalance;

    public void deposit(double Amount) {
        currentBalance = Amount + balance;
    }

    double remainBal;
    Scanner enterPin;

    public void withdraw(double amount, int withdrawalPin) {
        enterPin = new Scanner(System.in);
        System.out.println("Enter your pin: ");
        int pin = enterPin.nextInt();
        if ( pin != withdrawalPin) {
            System.out.println("Incorrect Pin, Try again!");
        } else {
            remainBal = currentBalance - amount;
        }

    }

    public void displayAccount() {
        System.out.println("initial Bal: " + balance);
        System.out.println("Bal after depositing: " + currentBalance);
        System.out.println("Remaining Balance: " + remainBal);
    }

}
