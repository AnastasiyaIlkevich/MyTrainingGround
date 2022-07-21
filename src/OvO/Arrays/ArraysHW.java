package OvO.Arrays;

import java.util.Arrays;

public class ArraysHW {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        int count=0;
        for (int i = 0; i <= arrayInt.length ; i++) {
            arrayInt[i]=count;
            count++;
        }
        System.out.println(Arrays.toString(arrayInt));
        //Получим
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //at OvO.Arrays.ArraysHW.main(ArraysHW.java:10)
    }
}
