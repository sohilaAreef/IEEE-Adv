
package sheet2;
import java.util.Scanner;
public class A2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number for Radius:");
            double Radius = input.nextDouble();
             double Area =  Radius *  Radius *3.14159;
             System.out.println("The Area for the circle of Radius " + Radius + " is " + Area);
             System.out.print("Enter a number for Length: ");
             double Length = input.nextDouble();
             double Volume = Area * Length;
             System.out.print("The Volume for the circle of Radius"+ Radius + "and Length"+ Length+"is"+ Volume);
           
        }
}
