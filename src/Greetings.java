import java.util.Random;
import java.util.Scanner;

public class Greetings {

    public static void main (String args[]) {
        Scanner user_input = new Scanner(System.in);
        int guesses = 3;
        Random random = new Random();

        System.out.println("Hello! What's your name?");
        String first_name = user_input.next();
        System.out.println("Hey " + first_name + "!");
        System.out.println("Let's play a game. Do you want to play?");
        System.out.println("Enter Yes or No");
        String answer = user_input.next();
        answer.toLowerCase();
        if (answer.equals("yes")){
            System.out.println("Great! Let's play!");
            System.out.println("I will pick a number between 1 and 10 and you will have 3 tries to guess!");
            int guess = random.nextInt(11);
            System.out.println("Ready? I have chosen a number!");
            while (guesses > 0){
                System.out.println("Guess the number");
                String num_guess = user_input.next();
                int int_num = Integer.parseInt(num_guess);
                if (int_num == guess) {
                    System.out.println("You win!");
                    guesses = guesses-3;
                }
                else{
                    System.out.println("Nope, sorry");
                    guesses = guesses-1;
                }
            }
            System.out.println("Good game " + first_name);
            System.out.println("Goodbye");
        }
        else if (answer.equals("no")) {
            System.out.println("Oh well, too bad.");
            System.out.println("Goodbye " + first_name + ".");
        }
        else {
            System.out.println("Sorry, didn't understand that.");
            System.out.println("Try again!");
        }

    }

}
