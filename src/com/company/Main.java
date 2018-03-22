package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToeLogic logic = new TicTacToeLogic();
        logic.printBoard();
        while (!logic.isFinished()) {
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();
            int rowIndex = scanner.nextInt();
            int colIndex = scanner.nextInt();
            boolean isAdded = logic.move(value, rowIndex, colIndex);


            logic.printBoard();

        }


    }
}
