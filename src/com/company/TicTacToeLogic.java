package com.company;

import java.util.Objects;

public class TicTacToeLogic {

    private final int SIZE = 3;         //final oznacza ze nie da sie zmienic wartosci zmiennej (jak const w Cpp)
    private final String x = "x";
    private final String o = "o";
    private final String empty = "-";
    String[][] board;

    public TicTacToeLogic() {
        init();

    }

    private void init() {
        board = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = "-";
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public boolean move(String symbol, int rowIndex, int columnIndex) {

        if ((symbol.equals(o) || symbol.equals(x)) && board[rowIndex][columnIndex].equals(empty)) {      //if(symbol.equals(x) || symbol.equals(o) &&board[rowIndex][columnIndex].equals(empty)
            board[rowIndex][columnIndex] = symbol;
            return true;
        } else
            return false;
    }


    public boolean isFinished() {
        for (int i = 0; i < SIZE; i++) {
            if ((Objects.equals(board[i][0], board[i][1])) && (Objects.equals(board[i][0], board[i][2])) && !Objects.equals(board[i][0], empty)) {
                return true;
            }
            if ((Objects.equals(board[0][i], board[1][i]) && Objects.equals(board[0][i], board[2][i])) && !Objects.equals(board[0][i], empty)) {
                return true;
            }
            if ((((Objects.equals(board[0][0], board[1][1]) && Objects.equals(board[0][0], board[2][2])) || ((Objects.equals(board[2][0], board[1][1])))) && Objects.equals(board[0][2], board[2][0])) && !Objects.equals(board[1][1], empty)) {
                return true;
            }
        }
        return false;
    }

}






