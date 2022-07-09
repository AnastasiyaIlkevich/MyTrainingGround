package OvO.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Выведите все элементы массива, стоящие на чётных позициях.
// На вход подаётся размерность массива и сами элементы.
//Пример ввода: 7.
//2 4 7 1 6 3 1
//Вывод: 2 7 6 1.
public class ArraysHW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length arrays");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter %d numbers -> ", length);
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
