public class Main {
    // Method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static void main(String[] args) {
        // ----------------------------------------------------------------------  Short aray section --------------------------------------------------------------------
        // Set the short array and a string to hold them for the display
        short[] shortNumbers = {1, 2, 3, 4, 5};
        String shortArrayNumbers = "";

        // Title 
        System.err.println("Short Array Info:");

        // Look through the short array and add the numbers to the string if its the last one don't add a comma
        for (short num : shortNumbers) {
            if(shortArrayNumbers.isEmpty()) {
                shortArrayNumbers += num;
            } else {
                shortArrayNumbers += ", " + num;
            }
        }
        // Display the information for the short array
        System.err.println("Short Numbers: " + shortArrayNumbers);
        System.err.println("Short Average: " + average(shortNumbers));


        // ----------------------------------------------------------------------  Int aray section --------------------------------------------------------------------
        // Set the int array and a string to hold them for the display
        int[] intNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String intArrayNumbers = "";

        // Title 
        System.out.println("\nInt Array Info:");

        // Look through the int array and add the numbers to the string if its the last one don't add a comma
        for (int num : intNumbers) {
            if(intArrayNumbers.isEmpty()) {
                intArrayNumbers += num;
            } else {
                intArrayNumbers += ", " + num;
            }
        }

        // Display the information for the int array
        System.out.println("Int Numbers: " + intArrayNumbers);
        System.out.println("Int Average: " + average(intNumbers));



        // ----------------------------------------------------------------------  Long aray section --------------------------------------------------------------------

        // Set the long array and a string to hold them for the display
        long[] longNumbers = {1L, 2L, 3L, 4L, 5L, 6L, 7L};
        String longArrayNumbers = "";

        // Title 
        System.out.println("\nLong Array Info:");

        // Look through the long array and add the numbers to the string if its the last one don't add a comma
        for (long num : longNumbers) {
            if(longArrayNumbers.isEmpty()) {
                longArrayNumbers += num;
            } else {
                longArrayNumbers += ", " + num;
            }
        }

        // Display the information for the long array
        System.out.println("Long Numbers: " + longArrayNumbers);
        System.out.println("Long Average: " + average(longNumbers));



        // ----------------------------------------------------------------------  Double aray section --------------------------------------------------------------------

        // Set the double array and a string to hold them for the display
        double[] doubleNumbers = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        String doubleArrayNumbers = "";

        // Title 
        System.out.println("\nDouble Array Info:");

        // Look through the double array and add the numbers to the string if its the last one don't add a comma
        for (double num : doubleNumbers) {
            if(doubleArrayNumbers.isEmpty()) {
                doubleArrayNumbers += num;
            } else {
                doubleArrayNumbers += ", " + num;
            }
        }

        // Display the information for the double array
        System.out.println("Double Numbers: " + doubleArrayNumbers);
        System.out.println("Double Average: " + average(doubleNumbers));
    }
}