package FreeIT.Lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessLetter {
    public static void main(String[] args) {

        System.out.println("Welcome to game << GUESS LETTER >> !!!");

        // Create random letter
        Random rand = new Random();
        int randNum = rand.nextInt(26);
        int codeHiddenLetter = (int)(randNum + 'a');
//        System.out.println("Code hidden letter - " + codeHiddenLetter);

        Scanner scan = new Scanner(System.in);
        boolean stopGame = false;
        while (!stopGame){
            System.out.println("Please, enter letter: ");
            String userAnswer = scan.nextLine().toLowerCase();
            char userLetter = userAnswer.charAt(0);
            int codeLetter = userLetter;
//            System.out.println(userLetter + " - " + codeLetter);
            if (codeLetter == codeHiddenLetter){
                System.out.println("Congratulation! The hidden letter was <" + userLetter + "> You win!");
                stopGame = true;
            } else{
                int difference = Math.abs(codeLetter - codeHiddenLetter);
                if (difference > 10){
                    System.out.println("It's cold!");
                } else if (difference > 5){
                    System.out.println("It's chilly!");
                } else if (difference > 2) {
                    System.out.println("It's warmly!");
                } else {
                    System.out.println("It's hot!");
                }
            }
        }
    }
}