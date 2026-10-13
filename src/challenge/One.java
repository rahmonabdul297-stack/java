package challenge;

import java.util.Scanner;

public class One {

   public static void main(String[] args) {

      int[] numb = new int[10];
      int count = 0, sum = 0;
      double avg;
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < numb.length; ++i) {
         System.out.print("Enter integer value number " + (i + 1)+":");
         numb[i] = input.nextInt();
         sum = sum + numb[i];
         count++;
      }
      System.out.println("The total of all integer values is: " + sum);
      avg = sum / count;
      System.out.println("The Average of all integer value is: " + avg);
      input.close();
   };
};