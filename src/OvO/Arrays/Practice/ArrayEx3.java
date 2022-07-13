package OvO.Arrays.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 5
        //1 2 3 3 4
        //вывести уникальные числа
        //вывод 1 2 3 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d numbers -> ", size);
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int count = 1;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
            }
        }
        int[] array2 = new int[count];
        for (int i = 0, j = 0; i < size - 1; i++) {
            if (array[i] != array[i + 1]) {
                array2[j] = array[i];
                j++;
            }
        }
        boolean ifHaveNumber = false;
        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] == array[size - 1]) {
                ifHaveNumber = true;
            }
        }

        if (!ifHaveNumber) {
            array2[array2.length - 1] = array[size - 1];
        }

        System.out.println(Arrays.toString(array2));

    }
}
