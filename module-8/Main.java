/*
    Daniel Fryer
    5/3/2026
    Assignment Mod 8 Main 
*/

import java.util.ArrayList;
import java.util.Scanner;

// Create the Main class
public class Main
{
        public static void main(String[] args) 
    {
        // create the new scanner
        Scanner input = new Scanner(System.in);
        
        // create an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter an whole number (1, 2, ect) and enter 0 to stop");

        int value;
        
        // do while statment to keep getting the user entered number
        do { 
            value = input.nextInt();
            numbers.add(value);
            System.out.println("Enter the next whole number. Enter 0 to stop");
        } while (value != 0);

        // set the largest number by sending th arraylist to the custom class's max method
        Integer largest = DanArrayList.max(numbers);

        System.out.println("The largest number is: " + largest);

        input.close();

    }
}