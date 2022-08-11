package OvO.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class ArraysMethods {

    public static void main(String[] args) {
        Random random = new Random();
        int [] number = new int[random.nextInt(100-5)+5];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(60);
        }
        System.out.println("Arrays.toString(number) -> "+Arrays.toString(number));
        int[] copyOf = Arrays.copyOf(number, number.length);
        System.out.println("Arrays.copyOf(number, number.length) -> "+Arrays.toString(copyOf));
        Arrays.sort(copyOf);
        System.out.println("Arrays.sort(copyOf) -> "+Arrays.toString(copyOf));
        int[] copyOfRange = Arrays.copyOfRange(number, 1, 5);
        System.out.println("Arrays.copyOfRange(number, 1, 5) -> "+Arrays.toString(copyOfRange));
        System.out.println(Arrays.equals(number, copyOf));
        System.out.println(Arrays.equals(number, copyOfRange));
        System.out.println(Arrays.equals(copyOfRange, copyOf));
        System.out.println(Arrays.equals(number,Arrays.copyOf(number, number.length)));



    }
}
