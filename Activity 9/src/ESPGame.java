import java.util.Scanner;
import java.util.Random;
public class ESPGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();
        int num, attempts, correct, number;
        correct = 0;
        attempts = 10;
        String color = "";
        String ans;
        for (number = 1; number <= 10; number++)
        {
            num = randomNumbers.nextInt(5);
            if (num == 0){
                color = "Red";
            } else if (num == 1) {
                color = "Green";
            } else if (num == 2) {
                color = "Blue";
            } else if (num == 3) {
                color = "Orange";
            } else if (num == 4) {
                color = "Yellow";
            }
            System.out.println(number + ". What color has the computer chosen?");
            ans = keyboard.next();
            System.out.println(">The computer chose " + color);
            if (color.equals(ans)) {
                correct += 1;
            }
        }
        System.out.println("You got " + correct + " out of " + attempts + " correct");
    }
}