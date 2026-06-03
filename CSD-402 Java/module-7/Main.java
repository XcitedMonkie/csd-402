/*
    Daniel Fryer
    4/26/2026
    Assignment Mod 7
*/

// Creat the Fan class
class Fan
{
    // creating the 4 constance 
    public static final int Stopped = 0;
    public static final int Slow = 1;
    public static final int Medium = 2;
    public static final int Fast = 3;


    // create the variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default constructor 
    public Fan()
    {
        this.speed = Stopped;
        this.on = false;
        this.radius = 6;
        this.color = "White";
    }

    // Constructor with items passed in
    public Fan(int speed, boolean on, double radius, String color)
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
        return  this.radius;
    }

    public String getColor()
    {
        return this.color;
    }

    // Setters
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

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

    // the toString to display fan information not being used in Mod 7 assignment
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

    // display the single fan
    public static void displayFan(Fan fan)
    {
        if(fan.isOn())
        {
            System.out.println("Fan is on");
            System.out.println("Speed: " + fan.getSpeed());
        }
        else
        {
            System.out.println("Fan is off");
        }

        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("----------------------");
    }

    // pass in the array of fans and send them one at a time to the single fan display
    public static void displayFans(Fan[] fans)
    {
        for(int i = 0; i < fans.length; i++)
        {
            System.out.println("Information for Fan: " + (i + 1));
            displayFan(fans[i]);
        }
    }
}


// Create the Main class
public class Main
{
        public static void main(String[] args) 
    {
        // create array to store fans
        Fan[] fans = new Fan[3];


        // create the fan objects and add them to the fan array
        Fan fan1 = new Fan();
        fans[0] = fan1;
        Fan fan2 = new Fan(Fan.Medium, true, 8, "Green");
        fans[1] = fan2;
        Fan fan3 = new Fan(Fan.Fast, true, 10, "Pink");
        fans[2] = fan3;

        Fan fan4 = new Fan(Fan.Slow, true, 22, "Orange");

        // Print out the array of Fans
        System.out.println("-------------------------------Printing out the array of fans");
        Fan.displayFans(fans);

        // Print out the single fan
        System.out.println("-------------------------------Printing out the single fan"); 
        Fan.displayFan(fan4);

        
    }
}