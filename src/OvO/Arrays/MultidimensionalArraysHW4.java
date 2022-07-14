package OvO.Arrays;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArraysHW4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter matrix size");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        arrayOutput(array, m, n);

        int string = scanner.nextInt();
        int temp;
        for (int i = 0, j = m-1; i <m; i++, j--) {
            if (i<j){
                temp = array[string][i];
                array[string][i] = array[string][j];
                array[string][j] = temp;
            }

        }

        arrayOutput(array, m, n);

    }

    private static void arrayOutput(int[][] array, int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
