package Bank;

public class Main {
      public static void main(String[] args) {
        BankAccout Client = new BankAccout("ABDUL RAHMON", "2367007948", 2000.00);
        Client.deposit(4000.40);
        Client.withdraw(500, 4321);
        Client.displayAccount();
    }
}
