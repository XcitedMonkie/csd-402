import java.util.Random;

public class Main 
{
    // Set the double array to random numbers 10 and 99 as a gimicy way to keep the arrary print to line up TODO: I want to come back to this and figure out a better way so I can make the random numbers between 1 and 100 and keep the print out lined up
    public static double [][] setArray (double [][] arrayParam)
    {
        Random rand = new Random();

        for(int i = 0; i < arrayParam.length; ++i)
        {
            for(int j = 0; j < arrayParam[i].length; ++j)
            {
                arrayParam[i][j] = 10 + (89 - 1) * rand.nextDouble();
            }
        }

        return arrayParam;
    }

    // Set the Int array to random number between 10 and 99 as a gimicy way to keep the arrary print to line up TODO: I want to come back to this and figure out a better way so I can make the random numbers between 1 and 100 and keep the print out lined up
    public static int [][] setArray (int [][] arrayParam)
    {
        Random rand = new Random();

        for(int i = 0; i < arrayParam.length; ++i)
        {
            for(int j = 0; j < arrayParam[i].length; ++j)
            {
                arrayParam[i][j] = rand.nextInt(89) + 10;
            }
        }

        return arrayParam;
    }

    // Print the double array TODO: Want to revisit this so I can line up the printout when the numbers are not the same length.
    public static void printArray (double [][] arrayParam)
    {
        
        System.out.println("---------------------- Starting Double Array ------------------------------------");
         for(int i = 0; i < arrayParam.length; ++i)
        {
            for(int j = 0; j < arrayParam[i].length; ++j)
            {
                System.out.print("[" + i + "]" + "[" + j + "] = " + String.format("%.2f", arrayParam[i][j]) + "  ");
            }
            System.out.println();
        }
    }

    // Print the int array TODO: Want to revisit this so I can line up the printout when the numbers are not the same length.
    public static void printArray ( int [][] arrayParam)
    {
        System.out.println();
        System.out.println("---------------------- Starting Int Array ------------------------------------");
         for(int i = 0; i < arrayParam.length; ++i)
        {
            for(int j = 0; j < arrayParam[i].length; ++j)
            {
                System.out.print("[" + i + "]" + "[" + j + "] = " + arrayParam[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Locate the largest number
    public static int [] locateLargest (double [][] arrayParam) 
    {
        // create the variables to store the row and col of the largest number and a variable to store the current max array
        int row = 0;
        int col = 0;
        double maxDoubleArray = arrayParam[0][0];

        for(int i = 0; i < arrayParam.length; i++)
        {
            for(int j = 0; j < arrayParam[i].length; j++)
            {
                // check if the current loop is larger than the currently stored array
                if(arrayParam[i][j] > maxDoubleArray)
                {
                    // if yes then set the current loop to the maxDoubleArray and store the row/column
                    maxDoubleArray = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        // Returning the single array with the location of the row, col
        return new int[]{row, col};
    }

    // Same as the double but Int
    public static int [] locateLargest (int [][] arrayParam) 
    {
         int row = 0;
        int col = 0;
        double maxIntArray = arrayParam[0][0];

        for(int i = 0; i < arrayParam.length; i++)
        {
            for(int j = 0; j < arrayParam[i].length; j++)
            {
                if(arrayParam[i][j] > maxIntArray)
                {
                    maxIntArray = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // This is the same logic as the Largest but the > changes to <
    public static int [] locateSmallest (double [][] arrayParam)
    {
        int row = 0;
        int col = 0;
        double minDoubleArray = arrayParam[0][0];

        for(int i = 0; i < arrayParam.length; i++)
        {
            for(int j = 0; j < arrayParam[i].length; j++)
            {
                if(arrayParam[i][j] < minDoubleArray)
                {
                    minDoubleArray = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    // Same logic as the double Smallest
    public static int [] locateSmallest (int [][] arrayParam)
    {
        int row = 0;
        int col = 0;
        int minIntArray = arrayParam[0][0];

        for(int i = 0; i < arrayParam.length; i++)
        {
            for(int j = 0; j < arrayParam[i].length; j++)
            {
                if(arrayParam[i][j] < minIntArray)
                {
                    minIntArray = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }


    public static void main(String[] args) 
    {
        // Setup the two arrays one double one int
        double [][] doubleArray = null;
        int [][] intArray = null;

        // Set the double array to a 4x4 array call and randomize the array and then print it out
        doubleArray = new double[4][4];
        doubleArray = setArray(doubleArray);
        printArray(doubleArray);
        
        // Same as the double but make the ints a 5x5 array 
        intArray = new int[5][5];
        intArray = setArray(intArray);
        printArray(intArray);

        // Get the max for each array and set it to the max array to print out
        int[] dMax = locateLargest(doubleArray);
        int[] iMax = locateLargest(intArray);

        // Get the min for each array and set it to the min array to print out
        int[] dMin = locateSmallest(doubleArray);
        int[] iMin = locateSmallest(intArray);

        // Print out the results
        System.out.println("\nResults:");

        //Print out the Largest and Smallest Double
        System.out.println("Largest double: " + String.format("%.2f", doubleArray[dMax[0]][dMax[1]]) +
        " at [" + dMax[0] + ", " + dMax[1] + "]");

        System.out.println("Smallest double: " + String.format("%.2f", doubleArray[dMin[0]][dMin[1]]) +
                " at [" + dMin[0] + ", " + dMin[1] + "]");

        //Print out the Largest and Smallest Int
        System.out.println("Largest int: " + intArray[iMax[0]][iMax[1]] +
        " at [" + iMax[0] + ", " + iMax[1] + "]");

        System.out.println("Smallest int: " + intArray[iMin[0]][iMin[1]] +
        " at [" + iMin[0] + ", " + iMin[1] + "]");
    }
}
