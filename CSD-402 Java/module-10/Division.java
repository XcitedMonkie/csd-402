/// Daniel Fryer
/// 5/17/20226
/// Java Mod 10

public abstract class Division 
{
    String divisionName;
    int accountNumber;

    // Constructor to set the variables
    public Division(String divisionName, int accountNumber) 
    {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to display information
    public abstract void display();
}