import java.math.*;

/**
 * Created by Aila on 2017-02-15.
 */

public class PennyProblem {
    public static void main (String [] arg){

        double days = 9*365;
        double pennies = 2;

        pennies = Math.pow(pennies, days-1);

        System.out.println("You have " + pennies + " pennies");
        System.out.println("That's a lot of pennies");
    }
}
