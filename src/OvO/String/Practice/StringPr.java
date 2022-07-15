package OvO.String.Practice;

import java.util.Scanner;

public class StringPr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char");
        char ch = scanner.next().charAt(0);
        if (ch >= 48 && ch <= 57) {
            System.out.println("Это цифра " + ch);
        } else
            System.out.println("не цифра");
    }
}
