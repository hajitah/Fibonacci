/*
  Taher Haji
  1/20/22
  AP Computer Science A
  
  Summary of File: This file prints fibonacci

  EXTRA CREDIT IS IMPLEMENTED
*/
import java.util.Scanner;
public class Fibonacci {
   public static void main (String [] args) {
      Scanner kb = new Scanner(System.in);
      int firstNumber = 0;
      int secondNumber = 1;
      int total = 0;
      String printed = "";
      int currentValue = 0;
      int totalNumbers = 0;
      //input
      System.out.print("Enter the starting value: ");
      int starting = kb.nextInt();
      System.out.print("Enter the ending value: ");
      int ending = kb.nextInt();
      //if the values are switched
      while (ending < starting) {
         System.out.println("Ending value must be greater than starting value");
         System.out.print("Enter the starting value: ");
         starting = kb.nextInt();
         System.out.print("Enter the ending value: ");
         ending = kb.nextInt();
      }
      kb.close();
      //process
      if (starting == 0)
         System.out.print("0, 1, ");
      while (total < ending) {
         total = firstNumber + secondNumber;
         currentValue = total;
         firstNumber = secondNumber;
         secondNumber = total;
         if (total > ending) {
            break;
         }
         if (currentValue >= starting){ 
            printed = String.valueOf(total);
            if (totalNumbers == 0)
               System.out.print(printed);
            else
               System.out.print(", " + printed);
            totalNumbers++;
         }
      }
      if (printed == "")
         System.out.print("None found.");
   }
}