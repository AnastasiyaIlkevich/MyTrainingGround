package OvO.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHW5 {
    //ввод 1 1 2 3 2 5 6 3
    //вывод 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d numbers -> ", size);
            array[i] = scanner.nextInt();
        }
        scanner.close();
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

        int count = 0;
        int countNum =0;
        for (int i = 0; i < size-1 ; i++) {
            if(array[i] == array[i + 1]&& countNum==0){
                countNum++;
                count++;
            }else if (array[i] != array[i + 1]){
                countNum=0;
            }
        }
        System.out.println(count);
    }
}

