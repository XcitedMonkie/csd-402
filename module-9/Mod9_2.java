/*
    Daniel Fryer
    5/7/2026
    Assignment Mod 9 Assignment Part 2 Main 
*/
// Import all the Files
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Mod9_2
{
        public static void main(String[] args) 
    {
        // trying to open the a file and write 10 random numbers to it then read it back
         try {

            // Create file object
            File file = new File("data.file");

            // Create file if it does not exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending data.");
            }

            // Open FileWriter and allow it to be written to
            FileWriter writer = new FileWriter(file, true);

            // get the random number generator ready
            Random random = new Random();

            // create and write the random numbers to the file
            for (int i = 0; i < 10; i++) {

                int number = random.nextInt(100);

                writer.write(number + " ");
            }

            // close the file 
            writer.close();


            System.out.println("Random numbers written to file.\n");

            // read the file into a variable 
            Scanner reader = new Scanner(file);

            System.out.println("File contents:");

            // loop through the file and print out the numbers
            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }

            // Close reader
            reader.close();

        } 
        // catch if there was an error in dealing with the file
        catch (IOException e) 
        {

            System.out.println("An error occurred.");

            // print out the stack trace if there was an error
            e.printStackTrace();
        }       
    }
}