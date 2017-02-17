import java.math.*;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Aila on 2017-02-17.
 */
public class GeometryTest {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int understood = 0;

        System.out.println("Hello!, What's your name?");
        String name = input.next();
        System.out.println("Hello " + name + "! I am MathCalc.");
        System.out.println("I will do geometry calculations for you.");
        System.out.println("Write Circle, Square, Rectangle, or Triangle.");

        while (understood < 1) {

            String choice = input.next();
            choice = choice.toLowerCase();


            if (choice.equals("circle")) {
                understood += 1;
                System.out.println("What's the radius of your circle?");
                int radius = Integer.parseInt(input.next());
                System.out.println(GeometryTest.circle(radius));
            }
            else if (choice.equals("square")) {
                understood += 1;
            }
            else if (choice.equals("rectangle")) {
                understood += 1;
            }
            else if (choice.equals("triangle")) {
                understood += 1;
            }
            else {
                System.out.println("I didn't understand that, sorry, try again.");
            }
        }

    }

    static public String circle (int radius) {

        double cArea = Math.pow(Math.PI * radius, 2);
        double roundCArea = Math.round(cArea * 100.0)/100.0;

        double a = Math.PI * 2;
        double cCirc = a * radius;
        double roundCCirc = Math.round(cCirc * 100.0)/100.0;

        return ("Your area is " + roundCArea + " units^2, and your circumfrance is " + roundCCirc + " units.");
    }
    static void squareArea (int side){

    }
    static void squarePer (int side){

    }
    static void rectangleArea (int base, int height){

    }
    static void rectanglePer (int base, int height){

    }
}
