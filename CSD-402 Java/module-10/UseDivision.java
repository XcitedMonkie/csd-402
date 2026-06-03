/// Daniel Fryer
/// 5/17/20226
/// Java Mod 10


public class UseDivision 
{
    public static void main(String[] args) 
    {
        // International divisions
        InternationalDivision international1 =
                new InternationalDivision(
                        "Frankfurt Support",
                        99101,
                        "Germany",
                        "German");

        InternationalDivision international2 =
                new InternationalDivision(
                        "Tokyo Support",
                        99202,
                        "Japan",
                        "Japanese");

        // Domestic divisions
        DomesticDivision domestic1 =
                new DomesticDivision(
                        "East Coast Support",
                        88101,
                        "New York");

        DomesticDivision domestic2 =
                new DomesticDivision(
                        "West Coast Support",
                        88202,
                        "California");

        // Display the international info
        international1.display();
        international2.display();

        // Display the domestic info
        domestic1.display();
        domestic2.display();
    }
}