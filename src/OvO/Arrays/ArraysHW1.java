package OvO.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHW1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length arrays");
        int arrayLength = scan.nextInt();

        int[] arr = new int[arrayLength];
        System.out.printf("enter %d numbers -> ", arrayLength);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("input array" + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            if (arr[j] > arr[i]) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
