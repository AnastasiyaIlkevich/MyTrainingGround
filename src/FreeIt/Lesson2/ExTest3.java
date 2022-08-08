package FreeIt.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExTest3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(bufferedReader.readLine());
        String[] arrayStringNumber = bufferedReader.readLine().split(" ");
        int[] arrayIntegerNumber = new int[arrayStringNumber.length];
        for (int i = 0; i < arrayIntegerNumber.length; i++) {
            arrayIntegerNumber[i] = Integer.parseInt(arrayStringNumber[i]);
        }
        int temp1 = Integer.MAX_VALUE;
        int temp2 = 1;
        int temp3 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int size;
        if (day % 2 == 0) {
            size = arrayIntegerNumber.length;
        } else {
            size = arrayIntegerNumber.length - 1;
            temp3 = arrayIntegerNumber[size];
        }

        for (int i = 0, j = 1; j < size; i = i + 2, j = j + 2) {
            sum1 += arrayIntegerNumber[i];
            if (arrayIntegerNumber[i] < temp1) {
                temp1 = arrayIntegerNumber[i];
            }
            sum2 += arrayIntegerNumber[j];
            if (arrayIntegerNumber[j] > temp2) {
                temp2 = arrayIntegerNumber[j];
            }
        }
        if (temp2 > temp1) {
            sum1 = sum1 - temp1 + temp2;
            sum2 = sum2 - temp2 + temp1;
        }
        System.out.println(sum1 - sum2 + temp3);
    }
}
