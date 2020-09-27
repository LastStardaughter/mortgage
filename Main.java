package mortgage;

public class Main {

    public static void main(String[] args) {
        int principal, years;
        float monthlyRate;
        int result; //We don't really care about the cents, do we?

        principal = Console.queryInt("Enter Principal (1K - 100M): ", 1000, 100000000, "Enter a number between 1,000 and 100,000,000");
        monthlyRate = Console.queryFloat("Annual Interest Rate: ", 0.0f, 30.0f, "Enter a decimal between 0 and 30")/1200.0f;
        years = Console.queryInt("Period (Years): ", 1, 100, "Enter a number between 1 and 100");

/*
        double mortgage = principal
                * (monthlyRate * Math.pow((double) 1 + monthlyRate, (double) 12.0*years))
                / (Math.pow(1 + monthlyRate, 12.0*years) - 1);
*/
        result = (int) (principal * Math.pow(1.0+monthlyRate,12.0*years) - principal);
        System.out.println("Mortgage: $" + result );

        System.out.println("Debug: Base: " + (1.0+monthlyRate) +", Exponent: "+12.0*years);
    }

    //Not sure these functions are worth it. Could just use the ternary...
    //Deprecated by Console class, leaving in for now in case I have use of it. If unused when done, remove!
    boolean checkInt(int x, int lower, int upper){
        return (x>=lower && x<=upper);
    }

    boolean checkFloat(float x, float lower, float upper){
        return (x>=lower && x<=upper);
    }
}