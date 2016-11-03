import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args) {

        double NumOne = 0;
        double NumTwo = 1;
        int Count = 1;

        Scanner user_input = new Scanner(System.in);

        System.out.println("I will print the Fibonacci sequence.");
        System.out.println("How many numbers would you like to see?");
        String counter = user_input.next();
        int counting = Integer.parseInt(counter);

        while (Count < counting) {
            System.out.println(NumOne);
            NumOne = NumOne + NumTwo;

            System.out.println(NumTwo);
            NumTwo = NumOne + NumTwo;

            Count = Count + 2;
        }
    }

}
