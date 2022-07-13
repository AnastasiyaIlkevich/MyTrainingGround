package OvO.Arrays.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2_2 {
    public static void main(String[] args) {
        // 7
        //1 2 3 0 0 7 9
        //0 1
        //вывод 1 0 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d numbers -> ", size);
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Enter num 1");
        int num1 = scanner.nextInt();

        System.out.println("Enter num 2");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp;
            temp = num2;
            num2 = num1;
            num1 = temp;
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] <= num2 && array[i] >= num1)
                count++;
        }
        System.out.println(count);
        int[] array2 = new int[count];

        for (int i = 0, j = 0; i < size; i++) {
            if (array[i] <= num2 && array[i] >= num1) {
                array2[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));

    }
}

