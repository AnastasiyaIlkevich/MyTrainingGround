package OvO.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//На вход подаётся размерность массива и сами элементы массива.
// Выведите индекс минимального элемента массива. Если таковых элементов несколько,
// то выведите индекс крайнего.
//Пример ввода: 5.
//1 3 2 -2 4
//Вывод: 3.
public class ArraysHW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter %d numbers -> ", size);
            array[i] = scanner.nextInt();
        }
        int[] arrayClone = array.clone();
        Arrays.sort(arrayClone);

        int num = arrayClone[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num){
                System.out.println(i);
            }
        }
    }
}
