import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random read = new Random();
        int tagetNum = 0;
        int guessNum = 0;

        tagetNum = read.nextInt(10) + 1; // Random number between 1 and 10

        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guessNum = in.nextInt();
                in.nextLine();
                if (guessNum < 1 || guessNum > 10) {
                    System.out.println("Number must be between 1 and 10.");
                } else {
                    if (guessNum < tagetNum) {
                        System.out.println("Too low!");
                        done = true;

                    } else if (guessNum > tagetNum) {
                        System.out.println("Too high!");
                        done = true;

                    } else {
                        System.out.println("You guessed it! The number was " + tagetNum);
                        done = true;
                    }
                }
            } else {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        } while (!done);


    }
}
