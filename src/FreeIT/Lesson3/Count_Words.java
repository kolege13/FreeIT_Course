package FreeIT.Lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter sentence: ");
        String sentence = scanner.nextLine();
        int amount_symbols = sentence.length();
//        char[] sentence_array = sentence.toCharArray();

        // Create array from sentence
        ArrayList<String> words = new ArrayList<String>();
        String word = "";
        for (int i = 0; i < amount_symbols; i++) {

            char letter = sentence.charAt(i);
            boolean space_not_true = (letter != ' ');
            if (space_not_true) {
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
        int amount_words = words.size();
        for (int i = 0; i < amount_words; i++){
            if (words.get(i).equals("_")){
                continue;
            }
            else{
                String new_word = words.get(i);
                int number_word = 1;
                for (int y = i + 1; y < amount_words; y++){
                    if (new_word.equals(words.get(y))){
                        number_word++;
                        words.set(y, "_");
                    }
                }
                System.out.println("Amount of word <" + new_word + "> is " + number_word + ".");
            }

        }

    }

}