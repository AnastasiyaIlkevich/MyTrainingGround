package OvO.BooleanOperations.Practice;

import java.util.Scanner;

public class BooleanOperations_8 {

    //Существует ли треугольник.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первую сторону треугольника");
        int a = scanner.nextInt();
        System.out.println("введите вторую сторону треугольника");
        int b = scanner.nextInt();
        System.out.println("введите третью сторону треугольника");
        int c = scanner.nextInt();
        scanner.close();

        compare(a, b, c);
    }

    private static void compare(int a, int b, int c) {

        boolean ifExist = true;
        if (b+c<a){
            ifExist = false;
        }else if (b+a<c){
            ifExist = false;
        }else if (c+a<b){
            ifExist = false;
        }

        if (ifExist){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
