package FreeIT.Lesson3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter sentence: ");
        String sentence = scanner.nextLine();
        int amountSymbols = sentence.length();
//        char[] sentence_array = sentence.toCharArray();

        // Create array from sentence
        ArrayList<String> words = new ArrayList<String>();
        String word = "";
        for (int i = 0; i < amountSymbols; i++) {

            char letter = sentence.charAt(i);
            boolean spaceNotTrue = (letter != ' ');
            if (spaceNotTrue) {
                word += letter;
            }
            else {
                words.add(word.toLowerCase(Locale.ROOT));
                word = "";
            }
        }
        words.add(word);
//        System.out.println(words);

        // Determination of the number of identical words
        int amountWords = words.size();
        for (int i = 0; i < amountWords; i++){
            if (words.get(i).equals("_") || words.get(i).equals(",") || words.get(i).equals(".")
                    || words.get(i).equals("?") || words.get(i).equals("!") || words.get(i).equals(":")){
                continue;
            }
            else{
                String newWord = words.get(i);
                int numberWord = 1;
                for (int y = i + 1; y < amountWords; y++){
                    if (newWord.equals(words.get(y))){
                        numberWord++;
                        words.set(y, "_");
                    }
                }
                System.out.println("Amount of word <" + newWord + "> is " + numberWord + ".");
            }

        }

    }

}