/// Daniel Fryer
/// 5/17/20226
/// Java Mod 10


public class DomesticDivision extends Division 
{
    private String state;

    // Set the variables in this class and the two from the abstract class
    public DomesticDivision(String divisionName, int accountNumber, String state) 
    {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // override from the abstract calss display to show the international info
    @Override
    public void display() 
    {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}