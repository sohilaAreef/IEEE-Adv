package sheet2;

import java.util.Scanner;
public class A6 {
  
  public static void main(String args[]) {
 
     Scanner input=new Scanner(System.in);
	System.out.println("Enter the driving distance");
   double distance=input.nextDouble();


	System.out.println("Enter fuel efficiency in miles per gallon");
   double fuelEfficiency=input.nextDouble();


	System.out.println("Enter price per gallon");
   double price=input.nextDouble();


   double cost= distance/fuelEfficiency*price;  
System.out.println("the cost of the trip is $"+cost);
    }
}



