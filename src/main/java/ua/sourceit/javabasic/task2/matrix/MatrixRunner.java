package ua.sourceit.javabasic.task2.matrix;

/**
 * Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) умножение на другую матрицу;
 * 4) транспонирование;
 * 5) вывод на печать.
 * Created by user on 11.08.2015.
 */

import java.io.IOException;

public class MatrixRunner {
    public static void main(String args[]) throws IOException {
        int[][] d = {{1, 2, 3}, {4, 5, 6}, {9, 1, 3}};
        MyMatrix D = new MyMatrix(d);
        D.show();
        System.out.println();

        MyMatrix A = MyMatrix.random(5, 5);
        A.show();
        System.out.println();


        MyMatrix B = A.transpose();
        B.show();
        System.out.println();


        A.plus(B).show();
        System.out.println();

        B.multymlyMatrix(A).show();
        System.out.println();


        MyMatrix b = MyMatrix.random(5, 1);
        b.show();
        System.out.println();


        A.multymlyNumber(4).show();
    }
}
