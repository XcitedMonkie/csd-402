/*
    Daniel Fryer
    4/19/2026
    Assignment Mod 6
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
        speed = Stopped;
        on = false;
        radius = 6;
        color = "White";
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
        return speed;
    }

    public boolean isOn()
    {
        return on;
    }

    public double getRadius()
    {
        return  radius;
    }

    public String getColor()
    {
        return color;
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

    // the toString to display fan information
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

// Create the Main class
public class Main
{
        public static void main(String[] args) 
    {
        // create the fan object
        Fan fan1 = new Fan();

        // Print out the default fan information
        System.out.println("Fan 1 before changes");
        System.out.println(fan1);

        // create a second fan object and set the information
        Fan fan2 = new Fan(Fan.Medium, true, 12, "Green");

        // change fan 1's information
        fan1.setSpeed(Fan.Fast);
        fan1.setOn(true);
        fan1.setRadius(24);
        fan1.setColor("Orange");
        
        // Display the fan 1's info after updating the values
        System.out.println("Fan 1 after changes");
        System.out.println(fan1);

        // Display fan 2's info
        System.out.println("Fan 2");
        System.out.println(fan2);
    }
}