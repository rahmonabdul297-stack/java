package inheritance;

import java.util.Scanner;

class User extends Main {
    public static void main(String[] args) {
        User u1 = new User();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        u1.name = input.nextLine();
        u1.greet(u1.name);
        input.close();
    }
}
