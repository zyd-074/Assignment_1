package Vanier;
import java.util.Scanner;
/**
 * @author Yu Duo Zhang
 */
public class Main {
    public static void main(String[] args) {
        //Create input
        Scanner user = new Scanner(System.in);

        //Make the user input the price of the object
        System.out.print("Please enter the item price: ");
        double orgPrice = user.nextDouble();
        //Make the user input the discount ratio
        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double disRatio = user.nextInt();

        System.out.println(" ");                                    //Add a line break to separate display and input

        //Calculation
        double disAmount = (disRatio / 100) * orgPrice;             //The discount in decimal to make the calculation easier
        double befTax = orgPrice - disAmount;                       //The final price before adding taxes
        double fedTax = befTax * 0.05;                              //The amount of the federal tax
        double proTax = befTax * 0.09975;                           //The amount of the provincial tax

        double finPrice = befTax + fedTax + proTax;                 //The final price
        //Display the final result (price)
        System.out.printf("%-20s: %.2f\n%-20s: %.2f%%\n%-20s: %.2f\n%s\n%-20s: %.2f\n%-20s: %.2f\n%-20s: %.2f", "Original Price", orgPrice, "Discount ratio", disRatio, "Price Before Tax", befTax, "------------------------------", "Federal Tax",fedTax, "Provincial Tax", proTax, "Final Price", finPrice);
    }
}