package OvO.Arrays;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArraysHW3 {

    public static void main(String[] args) {
        //1 5 3 4
        //6 4 2 3
        //6 3 7 5
        //7 4 1 6
        //Вывод:
        //7 5 3 4
        //6 4 2 3
        //6 3 1 5
        //7 4 1 6
        //в задаче ошибка. Отсутсвует строчка которую мы копируем в диагональ.

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
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    array[i][j] = array[string][j];
                }
            }
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
