public class Main {
    public static void main(String[] args) {
        // Number of rows the pyramid will be
        int rows = 7;

        // the toal width of the pyramid with all the characters at the last line 
        int pyramidWidth = 33;

        // inital loop to cycle through the rows count
        for (int i = 0; i < rows; i++)
        {
            // Make a new row string for each rows
            String row = "";

            // Get the leading spaces in the row so the numbers become centered
            for (int s = 0; s < (rows - i) * 2; s++)
            {
                row += " ";
            }

            // I need to get the row to have all the powers up to the row count (1,2,3,4 ect)
            for (int j = 0; j <= i; j++)
            {
                row += (int)Math.pow(2, j) + " ";
            }

            // After the row count been found now I need to decreese the power back to 1
            for (int j = i - 1; j >= 0; j--)
            {
                row += (int)Math.pow(2, j) + " ";
            }

            // How many spaces do I need to make the @ symbols line up
            int spacesToAdd = pyramidWidth - row.length();

            // Adding spaces at the end of each row so the @ symbols will be in a column
            for (int k = 0; k < spacesToAdd; k++)
            {
                row += " ";
            }
            
            // Add the @ symbol
            row += "@";

            // Print the row
            System.out.println(row);
        }
    }
}