package Y2016_2;

import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        Random r = new Random();
        int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = r.nextInt(2);
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        //check row
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                System.out.println("All " + board[i][0] + "s on row " + i);
            }
        }

        //check column
        for (int j = 0; j < board.length; j++) {
            if (board[0][j] == board[1][j] && board[2][j] == board[0][j]) {
                System.out.println("All " + board[0][j] + "s on column " + j);
            }
        }

        //check diagonal
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
                || board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            System.out.println("All " + board[1][1] + "s on diagonal");
        }

    }
}

