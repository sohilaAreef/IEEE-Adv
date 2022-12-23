
package sheet2;
import java.util.Scanner;
public class A5 { 
      public static void main (String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter investment amount:"); 
         int InvestmentAmount = input.nextInt(); //مبلغ الاستثمار
          System.out.print("Enter annual interest rate:");
          double AnnualInterestRate =input.nextDouble(); //سعر الفائدة السنوي
           System.out.print("Enter the number of years:");
           int NumberOfYears = input.nextInt();
           double futureInvestmentValue =InvestmentAmount*Math.pow((1+(AnnualInterestRate/100)/12),NumberOfYears*12);

           System.out.println("futureInvestmentValue is:" + futureInvestmentValue);
           
      } 
    
}//double futureInv=invAmount*Math.pow((1+(rate/100)/12),year*12);
