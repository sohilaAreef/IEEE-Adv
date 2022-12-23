package sheet2;
import java.util.Scanner;
public class A4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int minutes = input.nextInt();
        int years = minutes / (60*24*365);
        int days = minutes/60/24 - years*365 ;
        
        System.out.print(minutes + "minutes is" + days + "days" + years + "years");

    }
}
