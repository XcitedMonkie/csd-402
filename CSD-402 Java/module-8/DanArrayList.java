/*
    Daniel Fryer
    5/3/2026
    Assignment Mod 8 Dan Array List
*/

import java.util.ArrayList;

public class DanArrayList 
{
    // Method to figure out the max number
    public static Integer max(ArrayList list)
    {
        // check if the list is null or has no items
        if(list == null || list.size() == 0)
        {
            return 0;
        }

        // set max to the first item in the array
        int max = (Integer) list.get(0);

        // Loop through the passed in array and compare if the current num is larger than max. If it is update the max to the new number.
        for(Object object : list)
        {
            int num = (Integer) object;
            if(num > max)
            {
                max = num;
            }
        }

        // return the largest number.
        return max;
    }
}

