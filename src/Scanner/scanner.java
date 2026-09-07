package Scanner;

import java.util.Scanner;

public class scanner {
    public static void scannerMethod() {
        // Student Details
        Scanner enterName = new Scanner(System.in);
        Scanner enterMatricNo = new Scanner(System.in);
        Scanner enterAge = new Scanner(System.in);
        Scanner enterHeight = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = enterName.nextLine();
        System.out.print("Enter your matric number: ");
        String matric = enterMatricNo.nextLine();
        System.out.print("Enter your age: ");
        int age = enterAge.nextInt();
        System.out.print("Enter your height: ");
        double height = enterHeight.nextDouble();
        System.out.println("Dear," + " " + name + "!\n" + "Your matric number is " +
                matric + "\n" + "You're " + age
                + " years old,\n" + "You're " + height + "m tall\n" + "Welcome onboard!");

        // Sum and Average of integers and doubles
        Scanner enterNum1 = new Scanner(System.in);
        Scanner enterNum2 = new Scanner(System.in);
        Scanner enterNum3 = new Scanner(System.in);
        Scanner enterNum4 = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = enterNum1.nextInt();
        System.out.print("Enter Second integer: ");
        int num2 = enterNum2.nextInt();
        int intSum = num1 + num2;
        System.out.print("Enter first Double: ");
        double num3 = enterNum3.nextDouble();
        System.out.print("Enter second Double: ");
        double num4 = enterNum4.nextDouble();
        double doubleSum = num3 + num4;
        double avgInt = intSum / 2;
        double avgDouble = doubleSum / 2;

        System.out.println("The sum two integers is: " + intSum);
        System.out.println("The sum two double is: " + doubleSum);
        System.out.println("The Average of two integer is: " + avgInt);
        System.out.println("The Average of two double is: " + avgDouble);

        // Square of sum
        int squareOfsum = intSum * intSum;
        System.out.println("Square of sum: " + squareOfsum);
        // sum of suqares
        double sumOfsquares = Math.sqrt(num1) + Math.sqrt(num2);
        System.out.println("Sum of squares: " + sumOfsquares);
        enterName.close();
        enterMatricNo.close();
        enterAge.close();
        enterHeight.close();
        enterNum1.close();
        enterNum2.close();
        enterNum3.close();
        enterNum4.close();
    }
}
