import java.util.Scanner;

public class HelloPapa {

    public static void main (String []args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = user_input.next();
        System.out.println("Hello, " + name);

    }

}
