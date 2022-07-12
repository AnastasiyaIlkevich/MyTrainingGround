package OvO.Arrays;

import java.util.Scanner;

public class ArraysHW4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d numbers -> ", size);
            array[i] = scanner.nextInt();
        }

        int minEvenNumber = Integer.MAX_VALUE;
        for (int num : array){
            if (num%2==0 && num <minEvenNumber){
                minEvenNumber =num;
            }
        }

        for (int num : array){
            System.out.print((double) num/minEvenNumber + " ");
        }
    }
}
