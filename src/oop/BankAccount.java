package oop;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountName;

    BankAccount(String accNum, String accName, double bal) {
        accNum = accountNumber;
        accName = accountName;
        bal = balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBal(double balance) {
        this.balance = balance;
    }
}
