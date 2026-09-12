package Loop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // // For loop
        // for (int index = 1; index <= 5; index += 1) {
        // System.out.println(index);
        // }

        // for (int index = 5; index >= 1; index -= 1) {
        // System.out.println(index);
        // }
        // // while loop
        // int a = 1;
        // while (a <= 10) {
        // System.out.println(a);
        // a++;
        // }
        // // do while loop
        // do {
        // System.out.println(a);
        // a++;
        // } while (a <= 10);

        // // calculation with loop
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter random number: ");
        // int RandomNum = input.nextInt();
        // input.close();

        // for (int index = 1; index <= 12; index += 1) {
        // System.out.println(RandomNum * index);
        // }

        // // Nested loop: It means looping in another loop
        // for (int i = 1; i <= 5; i += 1) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Switch statement
        String x = "pasta";

        switch (x) {
            case "pasta":
                System.out.println("You've ordered" + " " + x);
                break;
            case "burger":
                System.out.println("You've ordered wrong item!");
                break;
            default:
                System.out.println("Order closed");
                break;
        }

        // while loop
        int i = 5;

        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Do while loop
        int k = 0;
        do {
            System.out.println(k);
            k++;
            
        } while (k < 10);

        // for and array loop
        String[] items ={"phone","book","spoon","clothe","comb"};
        for(int r = 0; r < items.length; r++ ){
            System.out.println(items[r]);
        }

    }

}