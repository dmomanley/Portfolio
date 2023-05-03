import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        int num, guesses;
        String guess ;
        Random randomNumbers = new Random();
        num = randomNumbers.nextInt(100) + 1;
        guesses = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100,or enter \"q\" to give up:");
        while (true) {
            guess = keyboard.next();
            if (guess.equals("q")){
                System.out.println("Quitter! The number was " + num);
                break;
            } else if (Integer.parseInt(guess) == num) {
                System.out.println("Correct! \nNumber of guesses: " + guesses);
                break;
            } else if (Integer.parseInt(guess) < num) {
                System.out.println("Too low. Guess again");
                guesses += 1;
            } else if (Integer.parseInt(guess) > num) {
                System.out.println("Too high. Guess again");
                guesses += 1;
            }
        }


    }
}