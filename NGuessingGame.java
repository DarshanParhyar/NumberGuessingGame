import java.util.Random;
import java.util.Scanner;

public class NGuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt((high - low) + 1) + low;

        System.out.println("Welcome to random guessing game number ");
        int uGuess;
        int numTries = 0;
        boolean guessCorrect = false;
        while (!guessCorrect) {
            System.out.print("Enter a guess number ");
            uGuess = input.nextInt();
            numTries++;
            if (uGuess < low || uGuess > high) {
                System.out.println("Enter a number between 0 to 100");

            }

            else if (uGuess > result) {
                System.out.println("Enter a lower num");
            }

            else if (uGuess < result) {
                System.out.println("Enter a higher number");
            } else {
                guessCorrect = true;
                System.out.println(
                        "Congratulations! you guess the correct the number " + result + " in " + numTries + " tries ");
            }

        }
        input.close();
    }

}
