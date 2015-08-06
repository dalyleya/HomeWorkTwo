package ua.sourceit.javabasic.task1;

/**
 * Создать двумерный массив символов и заполнить его
 * буквами 'Ч' и 'Б' в шахматном порядке
 * Created by user on 04.08.2015.
 */
public class Task8 {
    private final int x = 8;
    private char[][] board;
    public Task8() {
        this.board = new char[x][x];
    }

    public static void main(String[] args) {
        Task8 a = new Task8();
        a.createBord();
    }

    public void createBord() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 'B';

                } else {
                    board[i][j] = 'W';

                }
                System.out.print(" " + board[i][j]);
            }
            System.out.println("");
        }
    }
}


