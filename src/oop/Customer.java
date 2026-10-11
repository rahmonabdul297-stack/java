package oop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String customerId;
    List<BankAccount> accounts;
    Customer(String name, String custumerId){
         this.name=name;
         this.customerId=custumerId;
         this.accounts=new ArrayList<>();
    }
    public void addBankAcc(BankAccount account){
       accounts.add(account);
    }

    public void displayAccounts() {
        
        System.out.println("CUSTOMER ACCOUNT SUMMARY");
        System.out.println("========================");
        System.out.println("Name        : " + name);
        System.out.println("Customer ID : " + customerId);
        System.out.println("----------------------------------------");
        for (BankAccount acc : accounts) {
            System.out.println("Balance     : ₦" + acc.getBalance());
            System.out.println("----------------------------------------");
        }
    }
}
