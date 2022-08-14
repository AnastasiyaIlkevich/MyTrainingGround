package OvO.Lambda;

import java.util.Random;

public class LambdaEx4 {

    //С помощью лямбда-выражения примите и найдите в массиве второй по величине элемент.
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayNumbers = new int[random.nextInt(100 - 1) + 1];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = random.nextInt(1000);
        }

        Operation4 operation;
        operation = (int[] array) -> {
            int maxNumber = 0;
            int secondMaxNumber = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxNumber) {
                    secondMaxNumber = maxNumber;
                    maxNumber = array[i];
                }
            }
            return secondMaxNumber;
        };
        System.out.println(operation.secondMaxNumber(arrayNumbers));
    }
}
