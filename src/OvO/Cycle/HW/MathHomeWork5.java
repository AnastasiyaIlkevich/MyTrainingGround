package OvO.Cycle.HW;

import java.util.Scanner;

public class MathHomeWork5 {
    //Мы имеем уравнение вида:
    //ax + b = 0
    //На вход подаются коэффициенты a и b. Найти x.
    //Пример ввода: 11
    //Вывод: -1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A = enter any number other than 0.");
        double a = scanner.nextDouble();
        System.out.println("B = enter any number other than 0.");
        double b = scanner.nextDouble();
        scanner.close();

        System.out.println(root(a, b));
    }

    private static double root(double a, double b) {
        if (a == 0 || b == 0) {
            System.exit(1);
        } else {
            return -b / a;
        }
        return 0;
    }
}