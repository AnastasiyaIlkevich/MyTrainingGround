package OvO.Arrays;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArraysHW3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter matrix size");
        int m = scanner.nextInt();
        int string = scanner.nextInt();
        int[][] array = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        arrayOutput(array, m);

        for (int i = 0; i < m; i++) {
            array[i][i] = array[string][i];
        }
        arrayOutput(array, m);
    }

    private static void arrayOutput(int[][] array, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
