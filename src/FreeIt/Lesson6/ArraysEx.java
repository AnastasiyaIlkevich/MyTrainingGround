package FreeIt.Lesson6;

import java.util.Arrays;

public class ArraysEx {
    //проработать все методы данного класса
    public static void main(String[] args) {
        int [] arr = {2,4,1,3,6,7,8,9,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.binarySearch(arr,1));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.binarySearch(arr,1));

    }
}
