/// Daniel Fryer
/// 5/17/20226
/// Java Mod 10


public class InternationalDivision extends Division 
{
    private String country;
    private String language;

    // Set the variables in this class and the two from the abstract class
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) 
    {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // override from the abstract calss display to show the international info
    @Override
    public void display() 
    {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}