package nyc.c4q.yuliyakaleda;

/**
 * Yuliya Kaleda
 * C4Q Access Code
 * Twenty Questions Game
 * Created on 03-18-2015
 */

import java.util.Scanner;

public class TwentyQuestionsGame {

    //check whether userInput is an integer
    public static boolean validInput(Scanner in){
        if (!in.hasNextInt()) {
            in.next();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //generate a random number
        int randNum = (int)(Math.random() * 100000 + 1);
        int i;
        System.out.println("Try to guess the number in range from 1 to 100,000. You have 20 guesses. Enter you first guess: ");
        //limit of guesses is 20
        for (i=20; i >0; i--) {
            //check if input is valid
            if (!validInput(in)) {
                System.out.println("This is not a number. Number of guesses left: " + (i-1) + ".");
            }
            else {
                int userInput = in.nextInt();
                //user input is out of range;
                if (userInput > 100000 || userInput <= 0) {
                    System.out.println("Invalid number. A number should be in range from 1 to 100,000. Number of guesses left: " + (i -1)+ ".");
                }
                //user input is too high
                else if (userInput > randNum) {
                    System.out.println("Your input number is too high. Number of guesses left: " + (i-1) + ".");
                }
                //user input is too low
                else if (userInput < randNum) {
                    System.out.println("Your input number is too low. Number of guesses left: " + (i-1) + ".");
                }
                //user guessed the number
                else if (userInput == randNum) {
                    System.out.println("Congratulations! You guessed the number!");
                    break;
                }
            }

        }
        //no more guesses left
        if (i == 0) {
            System.out.println("Sorry, you do not have any more guesses. You lost!");
        }
    }
}
