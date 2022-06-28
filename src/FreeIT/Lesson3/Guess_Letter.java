package FreeIT.Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Guess_Letter {
    public static void main(String[] args) {

        System.out.println("Welcome to game GUESS LETTER !!!");

        // Create random letter
        Random rand = new Random();
        int rand_num = rand.nextInt(26);
        int code_hidden_letter = (int)(rand_num + 'a');
//        System.out.println("Code hidden letter - " + code_hidden_letter);

        Scanner scan = new Scanner(System.in);
        boolean stop_game = false;
        while (!stop_game){
            System.out.println("Please, enter letter: ");
            String user_answer = scan.nextLine().toLowerCase();
            char user_letter = user_answer.charAt(0);
            int code_letter = user_letter;
//            System.out.println(user_letter + " - " + code_letter);
            if (code_letter == code_hidden_letter){
                System.out.println("Congratulation! The hidden letter was <" + user_letter + "> You win!");
                stop_game = true;
            } else{
                int difference = Math.abs(code_letter - code_hidden_letter);
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