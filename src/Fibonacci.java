import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args) {

        int NumOne = 0;
        int NumTwo = 1;
        int Numbers = 0;

        Scanner user_input = new Scanner(System.in);

        System.out.println("I will print the Fibonacci sequence.");
        System.out.println("How many numbers would you like to see?");
        String counter = user_input.next();
        int counting = Integer.parseInt(counter);

        int[] FibonacciArray = new int[100];

        while (Numbers < counting) {
            FibonacciArray[Numbers] = NumOne;
            NumOne = NumOne + NumTwo;
            Numbers++;

            FibonacciArray[Numbers] = NumTwo;
            NumTwo = NumOne + NumTwo;
            Numbers++;
        }

        int a = counting;
        for (int i=0; i<a; i++){
            System.out.println(FibonacciArray [i]);
        }
        System.out.println("Here you go!");
    }

}
