package FreeIT.Lesson4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static String[][] field = new String[3][3];
    public static String userSymbol = "X";
    public static String pcSymbol = "O";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean game = true;

        while (game) {
            System.out.println("Play Tic-Tac-Toe? Enter < Y > or < N > :");
            String play_game = scanner.next().toUpperCase(Locale.ROOT);
            if (!play_game.equals("N")){
                Game();
            }else {
                game = false;
            }
        }
    }


    static void Symbols(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the symbol: 1 - < X >, 2 - < O >");
        String userVarSymbol = scanner.next();
        if (userVarSymbol.equals("1")) {
            userSymbol = "X";
            pcSymbol = "O";
        } else if (userVarSymbol.equals("2")) {
            userSymbol = "O";
            pcSymbol = "X";
        } else {
            System.out.println("Default symbol is < X >");
        }
    }

    static void ClearField() {
        int a = 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = String.valueOf(a);
                a++;
            }
        }
    }

    static void PrintField() {
//        System.out.println("\n");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                if (j != 2) {
                    System.out.print(" | ");
                }
            }
            if (i != 2) {
                System.out.println("\n----------");
            }
        }
        System.out.println("\n");
    }

    static void UserStep() {
        Scanner scan = new Scanner(System.in);
        boolean emptyCell = true;
        boolean anyCell = true;
        while (emptyCell){
            System.out.println("Please, enter number of cell: ");
            String cell = scan.next();
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (cell.equals(field[i][j])) {
                        field[i][j] = userSymbol;
                        emptyCell = false;
                        anyCell = false;
                    }
                }
            }
            if (anyCell){
                System.out.println("This cell is busy. Select any cell.");
            }
        }
        PrintField();
    }

    static void PcStep() {
        boolean emptyCell = true;
        Random random = new Random();
        String cell = String.valueOf(random.nextInt(10));
        while (emptyCell) {
            for (int i = 0; i < field.length && emptyCell == true; i++) {
                for (int j = 0; j < field[i].length && emptyCell == true; j++) {
                    if (cell.equals(field[i][j])) {
                        field[i][j] = pcSymbol;
                        emptyCell = false;
                    } else {
                        cell = String.valueOf(random.nextInt(10));
                    }
                }
            }
        }
        PrintField();
    }

    static boolean IsWin(String symbol){

        boolean isWin = false;
        // 1 horizontal [0][0]
        if (field[0][0].equals(symbol)) {
            if (field[0][1].equals(symbol)) {
                if (field[0][2].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        // 1 vertical [0][0]
        if (field[0][0].equals(symbol)) {
            if (field[1][0].equals(symbol)) {
                if (field[2][0].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        // 9 horizontal [2][2]
        if (field[2][2].equals(symbol)) {
            if (field[2][0].equals(symbol)) {
                if (field[2][1].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        // 9 vertical [2][2]
        if (field[2][2].equals(symbol)){
            if (field[0][2].equals(symbol)){
                if (field[1][2].equals((symbol))){
                    isWin = true;
                }
            }
        }
        // 5 horizontal [1][1]
        if (field[1][1].equals(symbol)) {
            if (field[1][0].equals(symbol)) {
                if (field[1][2].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        // 5 vertical [1][1]
        if (field[1][1].equals(symbol)) {
            if (field[0][1].equals(symbol)) {
                if (field[2][1].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        // 5 diagonal-1 [1][1]
        if (field[1][1].equals(symbol)) {
            if (field[0][0].equals(symbol)) {
                if (field[2][2].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        // 5 diagonal-2 [1][1]
        if (field[1][1].equals(symbol)) {
            if (field[0][2].equals(symbol)) {
                if (field[2][0].equals((symbol))) {
                    isWin = true;
                }
            }
        }
        return isWin;
    }

    static void Game(){
        int cellsLeft = 9;
        boolean nextStep = true;
        Symbols();
        ClearField();
        PrintField();
        while (nextStep == true){
            if (cellsLeft > 0 && nextStep == true) {
                UserStep();
                cellsLeft--;
                if (IsWin(userSymbol)) {
                    System.out.println("Congratulation! You win!");
                    break;
                }
            }else {
                System.out.println("Draw! All cells is busy.");
                nextStep = false;
            }
            if (cellsLeft > 0 && nextStep == true) {
                System.out.println("PC turn: ");
                PcStep();
                cellsLeft--;
                if (IsWin(pcSymbol)){
                    System.out.println("You lost. Try again!");
                    break;
                }
            }else {
                System.out.println("Draw! All cells is busy.");
                nextStep = false;
            }
        }
    }
}
