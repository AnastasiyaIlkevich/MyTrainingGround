package OvO.String.Practice;

import java.util.Scanner;

public class StringPr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char");
        char ch = scanner.next().charAt(0);
        if (97 <= ch && ch < 123) {
            ch = (char) (ch - 32);
            System.out.println(ch);
        }
    }
}
