package OvO.Arrays.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {

    public static void main(String[] args) {
        //выведете все уникальные элементы массова.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter %d numbers -> ", size);
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        int count = 1;

        for (int i = 1; i < size - 1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
