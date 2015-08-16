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
        int[][] dc = {{1, 2, 3}, {4, 5, 6}, {9, 1, 3}};
        MyMatrix d = new MyMatrix(dc);
        d.show();
        System.out.println();

        MyMatrix a = MyMatrix.random(5, 5);
        a.show();
        System.out.println();


        MyMatrix b = a.transpose();
        a.show();
        System.out.println();


        a.plus(b).show();
        System.out.println();

        b.multymlyMatrix(a).show();
        System.out.println();


        b = MyMatrix.random(5, 1);
        b.show();
        System.out.println();


        a.multymlyNumber(4).show();
    }
}
