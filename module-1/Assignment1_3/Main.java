// Bring in the Scanner library that reads user input
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt and get the amount of water
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt and get the starting temp
        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemp = input.nextDouble();

        // Prompt and get the ending temp
        System.out.print("Enter the final temperature (Celsius)");
        double finalTemp = input.nextDouble();

        // Calculate the energy
        double Q = waterMass * (finalTemp - initialTemp) *4184;

        // Print out the calculation to the user
        System.out.println("The energy needed is " + Q + " Joules.");
    }
}