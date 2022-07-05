package OvO.Cycle.HW;

public class CycleHomeWork3 {
    public static void main(String[] args) {
        //Выведите все четырёхзначные числа, сумма цифр которых равна их произведению.
        //Вывод:
        //1124        //1142        //1214        //1241        //1412
        //1421        //2114        //2141        //2411        //4112
        //4121        //4211

        int first, second, third, fourth;
        int sum, product;
        for (int i = 1000; i < 10000; i++) {
            first = i / 1000;
            second = i / 100 % 10;
            third = i / 10 % 10;
            fourth = i % 10;
            sum = first + second + third + fourth;
            product = first * second * third * fourth;
            if (sum == product) {
                System.out.println(i);
            }
        }
    }
}
