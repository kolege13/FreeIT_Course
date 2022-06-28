package FreeIT.Lesson2;

import java.util.Scanner;

public class Greeting {

/*    public static String greeting(string _name, int _age, String _sex){
        String appeal = "Hello ";
        if (_age > 50){
            if (_sex.equals("M")){
                appeal += "Mr. ";
            } else {
                appeal += "Mrs.";
            }
        } else if (_age > 15) {
            if (_sex.equals("M")) {
                appeal += "Mr. ";
            } else {
                appeal += "Ms.";
            }
        } else {
            if (_sex.equals("M")){
                appeal += "cute  ";
            } else {
                appeal += "darling ";
            }
        }
        appeal += _name;
        return appeal;
    }

 */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("PLease enter your name: ");
        String name = in.nextLine();

        System.out.println("PLease enter your age: ");
        int age = Integer.parseInt(in.nextLine());

        System.out.println("PLease enter your sex ('M' or 'W'): ");
        String gender = in.nextLine().toUpperCase();

        String greeting = "Hello ";
        if (age > 50){
            if (gender.equals("M")){
                greeting += "Mr. ";
            } else {
                greeting += "Mrs.";
            }
        } else if (age > 15) {
            if (gender.equals("M")) {
                greeting += "Mr. ";
            } else {
                greeting += "Ms.";
            }
        } else {
            if (gender.equals("M")){
                greeting += "cute  ";
            } else {
                greeting += "darling ";
            }
        }
        greeting += name;

//        String text = greeting(name, age, sex);
        System.out.println(greeting);
    }
}