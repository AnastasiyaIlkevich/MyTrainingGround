package OvO.String.HW;

import java.util.Scanner;

public class CharHW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char");
        char ch = scanner.next().charAt(0);
        if (ch >= 48 && ch <= 57) {
            System.out.println("this number is " + ch + " " + checkNumber(ch));
        } else {
            System.out.println("it's not a number");
        }
    }

    private static String checkNumber(char ch) {
        if (ch % 2 != 0) {
            return "not even";
        } else {
            return "even";
        }
    }
}
