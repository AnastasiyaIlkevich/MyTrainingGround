package OvO.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArraysHW2 {
    public static void main(String[] args) {
        // Заполните матрицу случайными числами от 0 до 20 и
        // выведите матрицу в которой все элементы будут
        // умножены на 3. На вход подаются размерности матрицы.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter matrix size");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(21);

            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]*3 + " ");
            }
            System.out.println();
        }

    }
}
