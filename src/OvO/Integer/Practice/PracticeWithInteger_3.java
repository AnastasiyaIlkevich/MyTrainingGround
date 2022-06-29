package OvO.Integer.Practice;

import java.util.Scanner;

public class PracticeWithInteger_3 {

    //В магазине рулон обоев стоит n  рублей и k копеек.
    // На вход подается три числа n,k,z(количество рулонов)
    // Нуно вывести сумму покупки.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number n");
        int n = scanner.nextInt();
        System.out.println("Please enter the number k");
        int k = scanner.nextInt();
        System.out.println("Please enter the number z");
        int z = scanner.nextInt();
        scanner.close();

        pay(n,k,z);

    }

    private static void pay(int n, int k, int z) {

        int allKopeek = n*100+k;
        int sum = allKopeek*z;
        n = sum/100;
        k = sum%100;
        System.out.printf("Итого покупка составила %d рублей и %d копеек",n,k);

    }


}
