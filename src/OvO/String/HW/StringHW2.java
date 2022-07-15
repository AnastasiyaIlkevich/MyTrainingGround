package OvO.String.HW;

import java.util.Arrays;
import java.util.Scanner;

public class StringHW2 {
    public static void main(String[] args) {
        //Вводится строка.
        // Необходимо вывести те слова,
        // в которых первая и последняя буквы совпадают.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();
        scanner.close();
        String[] strings = text.split(" ");

        char chStart = 0;
        char chEnd = 0;
        boolean ifCorrect = false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 2) {
                chStart = strings[i].charAt(0);
                chEnd = strings[i].charAt(strings[i].length() - 1);
                ifCorrect = true;
            }

            if (chStart == chEnd && ifCorrect) {
                System.out.println(strings[i]);
                ifCorrect = false;
            }
        }
    }
}
