package challenge;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      int[] numb = new int[10];
      int count = 0;
      double sum = 0, avg;
      Scanner input = new Scanner(System.in);

      for (int i = 0; i < numb.length; i++) {
         System.out.print("Enter integer values :");
         numb[i] = input.nextInt();
         sum = sum + numb[i];
         count++;
      }
      avg = sum / count;
      System.out.println("sum is: " + sum);
      System.out.println("average is: " + avg);
      input.close();
   };
};