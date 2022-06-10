package chapter8;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] tictactoe = new char[3][3];


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement here (1-9): ");
        int position = scan.nextInt();

        piecesOnBoard(tictactoe, position, "player 1");

        piecesOnBoard(tictactoe, position, "player 2");

        printGameBoard(tictactoe);


    }

    private static void printGameBoard(char[][] tictactoe) {
        for(char[] row : tictactoe){
            for (char c : row){
                System.out.println(c);
            }
            System.out.println();
        }
    }

    private static void piecesOnBoard(char[][] tictactoe, int position, String user) {

    }
}
