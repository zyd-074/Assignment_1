package Vanier;
import java.util.Scanner;
/**
 * @author Yu Duo Zhang
 */
public class Main {
    public static void main(String[] args) {
        //Create the Scanner
        Scanner user = new Scanner(System.in);

        //Let user input the octal number
        System.out.print("Please enter a 4-digits Octal number: ");
        int num = user.nextInt();
        String octNum = Integer.toString(num); //Make the int into a string to make the separation easier

        //Calculation to decimal number
        //Separate the digits
        String int1 =octNum.substring(0,1);
        String int2 =octNum.substring(1,2);
        String int3 =octNum.substring(2,3);
        String int4 =octNum.substring(3);
        //Calculate the digits into decimal
        int num1 = (int) (Integer.parseInt(int1) * Math.pow(8, 3));
        int num2 = (int) (Integer.parseInt(int2) * Math.pow(8, 2));
        int num3 = (int) (Integer.parseInt(int3) * Math.pow(8, 1));
        int num4 = (int) (Integer.parseInt(int4) * Math.pow(8, 0));
        //Give the final number in decimal
        int decNum = num1 + num2 + num3 + num4;

        //Display the output
        System.out.printf("\n%-15s: %d\n%-15s: %d", "Octal Number", num, "Decimal Number", decNum);
    }
}