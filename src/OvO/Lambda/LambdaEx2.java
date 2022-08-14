package OvO.Lambda;

public class LambdaEx2 {

    // поиск числа в массиве чисел с помощью Lambda выражений
    public static void main(String[] args) {
        Operation2 operation = (int[] array, int number) -> {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return true;
                }
            }
            return false;
        };

        int[] array = {1, 2, 3, 4, 5};
        int number = 10;
        System.out.println(operation.ifInArray(array,number));

    }
}
