package OvO.Arrays.Practice;

import java.util.Scanner;

public class ArraysEx {

    //пример ввода 
    //-4 1 3 -9 12
    //-5 0 2 -10 11

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter %d numbers -> ", size);
            array[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        boolean ifHavePositive = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < min) {
                ifHavePositive = true;
                min = array[i];
            }
        }
        if (!ifHavePositive) {
            System.out.println("No positive");
            System.exit(1);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] -= min;
            System.out.print(array[i] + " ");
        }
    }
}
