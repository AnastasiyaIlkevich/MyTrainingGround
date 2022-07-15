package OvO.String.HW;

import java.util.Scanner;

public class StringHW {
    // Вводится строчка текста,
    // затем вводится на следующей строке одна буква латинского алфавита.
    // Найдите, сколько раз в тексте встречается введенный символ.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();
        System.out.println("Enter letter");
        char letter = scanner.next().charAt(0);
        char[] arrayText = text.toCharArray();
        int count = 0;
        for (char letterText : arrayText) {
            if (letter == letterText)
                count++;
        }
        System.out.println(letter + " -> " + count);

    }
}
