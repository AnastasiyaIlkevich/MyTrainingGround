package OvO.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArraysHW {
    public static void main(String[] args) {
        // На вход подаётся размерность матрицы и сами элементы матрицы.
        // Найдите максимальный элемент матрицы.
        // Если таковых несколько, то вынести индексы первого.
        //Пример ввода: 3 3
        //1 1 4
        //3 2 1
        //0 4 4
        //Вывод: 0 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Enter %d numbers -> ", n * m);
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println(Arrays.deepToString(matrix));

        int max = Integer.MIN_VALUE;
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println(indexI + " " + indexJ);
    }
}
