/*
    Daniel Fryer
    5/7/2026
    Assignment Mod 9 Assignment Part 1 Main 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Mod9
{
        public static void main(String[] args) 
    {
         // Create ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();

        // 
        arrayList.add("0: Darth Vader");
        arrayList.add("1: Harry Potter");
        arrayList.add("2: Indiana Jones");
        arrayList.add("3: Spider-Man");
        arrayList.add("4: Shrek");
        arrayList.add("5: Forrest Gump");
        arrayList.add("6: Jack Sparrow");
        arrayList.add("7: Buzz Lightyear");
        arrayList.add("8: Katniss Everdeen");
        arrayList.add("9: Willy Wonka");

        // Print using for-each loop
        System.out.println("ArrayList contents:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // User input to get what number they want to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an index (0-9) to see again: ");

        // Autoboxing 
        Integer index = scanner.nextInt();

        try {
            // Auto unboxing 
            System.out.println("You selected: " + arrayList.get(index));
        } catch (IndexOutOfBoundsException e) {
            // Exception has been thrown
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        scanner.close();
    }
}