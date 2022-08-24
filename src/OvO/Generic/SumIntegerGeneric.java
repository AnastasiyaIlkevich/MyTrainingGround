package OvO.Generic;

public class SumIntegerGeneric {

    public static void main(String[] args) {

        SumInteger<Integer> myArray = new SumInteger<>(new Integer[]{1, 2, 3, 4, 5, 6});
        SumInteger<Byte> myArray2 = new SumInteger<>(new Byte[]{1, 2, 3, 4, 5, 6});
        SumInteger<Long> myArray3 = new SumInteger<>(new Long[]{1L, 2L, 3L, 4L, 5L, 6L});
        SumInteger<Double> myArray4 = new SumInteger<>(new Double[]{1.4, 3.6, 2.1, 3.9, 4.2, 5.8});

        System.out.println(myArray.sumNumbers());
        System.out.println(myArray2.sumNumbers());
        System.out.println(myArray3.sumNumbers());
        System.out.println(myArray4.sumNumbers());
    }
}

class SumInteger<T extends Number> {

    private T[] numbers;

    public SumInteger(T[] numbers) {
        this.numbers = numbers;
    }


    public double sumNumbers() {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }
}