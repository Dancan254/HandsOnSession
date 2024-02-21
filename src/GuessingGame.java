import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        //must have numbers are in a range = 1-100
        //RandomClass - declare
        Scanner input = new Scanner(System.in);

        Random randomGenerator = new Random();
        //initialize
        int randomNumber = randomGenerator.nextInt(1, 101);
        //pick randomly from the range
        //make a guess

        //compare the random number with what we guessed
//        int maxGuesses = 5;
//        for (int guesses = 1; guesses <= 5; guesses++) {
//            System.out.println("Enter a number between 1 - 100");//67 //90
//            int guessedNumber = input.nextInt();
//            System.out.println("You have guessed: " + guessedNumber);//67
//            if (guessedNumber == randomNumber){
//                System.out.println("YOU got it");
//            } else if (guessedNumber < randomNumber) { //89
//                System.out.println("Too low");
//            }
//            else {
//                System.out.println("Too high");
//            }
//        }
//        System.out.println("Correct answer is " + randomNumber);


        //50 40
        //tell the user its too high, too low, got it

        //while loop
//
//        int attempts = 0;
//        while(true){
//            System.out.println("Enter a number between 1 -100");//67
//            int guessedNumber = input.nextInt();
//            System.out.println("You have guessed: " + guessedNumber);//67
//            attempts++;
//            if (guessedNumber == randomNumber){
//                System.out.println("YOU got it");
//                break;
//            } else if (guessedNumber < randomNumber) { //89
//                System.out.println("Too low");
//            }
//            else {
//                System.out.println("Too high");
//            }
//        }
        int guessMax= 5;
         int attempt = 0;
         //5 < 5 false
         while(attempt<guessMax){
             System.out.println("Enter a number between 1 -100");//67
             int guessedNumber = input.nextInt();
             System.out.println("You have guessed: " + guessedNumber);//67
             attempt++; //1, 2, 3, 4, 5
             if (guessedNumber == randomNumber){
                 System.out.println("YOU got it");
                 break;
             } else if (guessedNumber < randomNumber) { //89
                 System.out.println("Too low");
             }
             else {
                 System.out.println("Too high");
             }
         }

    }
}
