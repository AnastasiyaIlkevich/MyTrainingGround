import java.util.Arrays;

public class Arra {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        int[][] arrays2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }

        int[] arr = {1, 8, 5, 6, 9, 4, 5, 9};
        System.out.println(Arrays.toString(arr));
        boolean good = true;
        while (good) {
            good = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    good = true;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
