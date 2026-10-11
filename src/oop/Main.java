package oop;

public class Main {
    public static void main(String[] args) {
        // 1. Create one Customer
        Customer customer = new Customer("Dudu", "User_001");

        // 2. Create a SavingsAccount
        BankAccount savings = new SavingsAccount("000101", "Dudu's Savings", 40000.0);
        // create a current Account
        BankAccount current = new CurrentAccount("001101", "Dudu's Current", 10000.0);

        // 3. Add both accounts to the customer
        customer.addBankAcc(savings);
        customer.addBankAcc(current);

        // 4. Deposit money into both accounts
        System.out.println("DEPOSIT OPERATIONS");
        savings.deposit(6000.0);
        current.deposit(10000.0);

        // 5. Attempt different withdrawals using Polymorphism via BankAccount[]
        System.out.println("\n POLYMORPHIC WITHDRAWAL OPERATIONS");
        BankAccount[] accounts = { savings, current };

        // Valid withdrawals
        System.out.println("\n withdrawwing from savings Account:");
        accounts[0].withdraw(1000);

        System.out.println("\n withdrawing current Account:");
        accounts[1].withdraw(20000.0);

        // Display the customer's accounts and final balances
        customer.displayAccounts();
    }
}