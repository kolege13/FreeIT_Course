package FreeIT.Lesson2;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of month: ");
        String num_month = scan.nextLine();

        switch (num_month) {
            case "1" -> System.out.println("January - Winter");
            case "2" -> System.out.println("February - Winter");
            case "3" -> System.out.println("March - Spring");
            case "4" -> System.out.println("April - Spring");
            case "5" -> System.out.println("May - Spring");
            case "6" -> System.out.println("June - Summer");
            case "7" -> System.out.println("July - Summer");
            case "8" -> System.out.println("August - Summer");
            case "9" -> System.out.println("September - Autumn");
            case "10" -> System.out.println("October - Autumn");
            case "11" -> System.out.println("November - Autumn");
            case "12" -> System.out.println("December - Winter");
        }
    }

}