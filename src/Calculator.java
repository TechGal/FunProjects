import java.util.Scanner;

/**
 * Created by Aila on 2016-12-12.
 */
public class Calculator {

    public static void main (String[] args){

        Scanner user_input = new Scanner(System.in);
        double num1, num2;
        boolean understood = false;

        System.out.println("What is your first number?");
        num1 = user_input.nextDouble();
        System.out.println("What operation would you like?");
        String operation = user_input.next();
        System.out.println("What is your second number?");
        num2 = user_input.nextDouble();

        while (!understood) {

            if (operation.equals("+")) {
                System.out.println("The product is " + (num1 + num2));
                understood = true;
            } else if (operation.equals("-")) {
                System.out.println("The sum is " + (num1 - num2));
                understood = true;
            } else if (operation.equals("x")) {
                System.out.println("The product is " + (num1 * num2));
                understood = true;
            } else if (operation.equals("/")) {
                System.out.println("The sum is " + (num1 / num2));
                understood = true;
            } else {
                System.out.println("Sorry, didn't understand that. Try again!");
            }

        }

    }

}
