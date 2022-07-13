package OvO.Arrays.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        // 7
        //1 2 3 0 0 7 9
        //0 1
        //вывод 1 2 3 0 0

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

        System.out.println("Enter num 1");
        int num2 = scanner.nextInt();

        if (num1==num2){
            System.exit(1);
        }

        int index1 = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == num1 || array[i] == num2) {
                index1 = i;
                break;
            }
        }
        System.out.print(index1);
        int index2 = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != array[index1] && array[i] == num2 || array[i] == num1) {
                index2 = i;
            }
        }
        System.out.println(index2);

        if (index1>index2){
            for (int i = index2; i <= index1; i++) {
                System.out.println(array[i]);
            }
        }else {
            for (int i = index1; i <= index2; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
