/*
    Daniel Fryer
    5/22/2026
    Mod 11 Redo of Mod 7
*/

import java.util.ArrayList;
import java.util.List;

// Fan class
class Fan_Makeup
{
    // Create the 4 constance
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // create the variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // default contructor
    public Fan_Makeup()
    {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "White";
    }

    // cconstructor with items passed in
    public Fan_Makeup(int speed, boolean on, double radius, String color)
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed()
    {
        return this.speed;
    }

    public boolean isOn()
    {
        return this.on;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    // Setters
    public void setOn(boolean on)
    {
        this.on = on;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    // left over from mod 6 assignment not being used leaving in for future testing
     public String toString()
    {
        //  Need to check if the fan is "on" because if it is won't need the speed to be shown
        if (on)
        {
            return "The current State of the fan is on. Speed is set to " + speed + ". The fan is color " + color + ". With a radius of " + radius + ".";
        }
        else
        {
            return "The current State of the fan is off. The fan is color " + color + ". With a radius of " + radius + ".";
        }
    }
}


// UseFans class
class UseFans
{
    // display the single fan
    public static void displayFan(Fan_Makeup fan)
    {
        if (fan.isOn())
        {
            System.out.println("Fan is ON");
            System.out.println("Speed: " + fan.getSpeed());
        }
        else
        {
            System.out.println("Fan is OFF");
        }

        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("----------------------");
    }

    // pass in the array of fans and send them one at a time to the single fan display
    public static void displayFans(List<Fan_Makeup> fans)
    {
        for (int i = 0; i < fans.size(); i++)
        {
            System.out.println("Information for Fan: " + (i + 1));
            displayFan(fans.get(i));
        }
    }
}


// Main class
public class Fryer_Mod11_Redo
{
    public static void main(String[] args)
    {
        // Update to create an array list
        ArrayList<Fan_Makeup> fans = new ArrayList<>();

        // add fans to ths arraylist
        fans.add(new Fan_Makeup());
        fans.add(new Fan_Makeup(Fan_Makeup.MEDIUM, true, 8, "Green"));
        fans.add(new Fan_Makeup(Fan_Makeup.FAST, true, 10, "Pink"));

        // pass in a fan to use the contructor with paramaters
        Fan_Makeup fan4 = new Fan_Makeup(Fan_Makeup.SLOW, true, 22, "Orange");

        // Display outputs
        System.out.println("----- Collection -----");
        UseFans.displayFans(fans);

        System.out.println("----- Single Fan -----");
        UseFans.displayFan(fan4);
    }
}