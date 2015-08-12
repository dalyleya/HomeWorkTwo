package ua.sourceit.javabasic.task2.matrix;

/**
 * * Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;+
 * 2) умножение на число;
 * 3) умножение на другую матрицу;+
 * 4) транспонирование;+
 * 5) вывод на печать.
 * Created by user on 11.08.2015.
 */
public class MyMatrix {
    private final int M;             // номер столбца
    private final int N;             // номер ячейки
    private final int[][] data;   // матрица M*N

    // Создание нулевой матрицы
    public MyMatrix(int M, int N) {
        this.M = M;
        this.N = N;
        data = new int[M][N];
    }

    // конструктор из многомерного массива
    public MyMatrix(int[][] data) {
        M = data.length;
        N = data[0].length;
        this.data = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                this.data[i][j] = data[i][j];
    }

    //матрица заполненая случайными числами
    public static MyMatrix random(int M, int N) {
        MyMatrix A = new MyMatrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++) {
                A.data[i][j] = (int) (Math.random() * 100);
            }
        return A;
    }

    // сложение двух матриц
    public MyMatrix plus(MyMatrix B) {
        MyMatrix A = this;
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Неправильные размеры матрицы");
        MyMatrix C = new MyMatrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                C.data[i][j] = A.data[i][j] + B.data[i][j];
        return C;
    }

    // return C = A * B
    public MyMatrix multymlyMatrix(MyMatrix B) {
        MyMatrix A = this;
        if (A.N != B.M) throw new RuntimeException("Неправильные размеры матрицы");
        MyMatrix C = new MyMatrix(A.M, B.N);
        for (int i = 0; i < C.M; i++)
            for (int j = 0; j < C.N; j++)
                for (int k = 0; k < A.N; k++)
                    C.data[i][j] += (A.data[i][k] * B.data[k][j]);
        return C;
    }

    public MyMatrix multymlyNumber(int a) {
        MyMatrix matr = this;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matr.data[i][j] *= a;
            }
        }
        return matr;
    }

    public MyMatrix transpose() {
        MyMatrix A = new MyMatrix(N, M);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                A.data[j][i] = this.data[i][j];
        return A;
    }

    public void show() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%9d ", data[i][j]);
            System.out.println();
        }
    }

}
