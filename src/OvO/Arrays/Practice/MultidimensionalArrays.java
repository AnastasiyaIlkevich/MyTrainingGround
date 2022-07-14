package OvO.Arrays.Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrays {
    //определить семетричность матрицы

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter matrix size");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(array));

//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = count;
//                count++;
//
//            }
//        }

        boolean ifSymetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j]!=array[j][i]){
                    ifSymetric=false;
                }
            }
        }
        if (ifSymetric){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }


}
