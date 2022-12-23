package sheet2;
import java.util.Scanner;
public class A3 {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a number between 0 and 1000:");
          int num = input.nextInt();
          int digit1 = num % 10; // 2
          int num1 = num / 10; // 63
          int digit2 = num1 % 10; //3
          int digit3 = num1 / 10; //6
          System.out.print(digit1 + digit2 + digit3);
      }
      
}
