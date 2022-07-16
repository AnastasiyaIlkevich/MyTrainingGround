package OvO.String.HW;

import java.util.Scanner;

public class StringHW3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //1. Вводится строка, в которой слова разделяются пробелами. Найти самое длинное слово.
        longestWord();

        //2. На вход подаётся две строки. Определить, есть ли в первой введённой строке вторая.
        findMatch();
        scanner.close();
    }

    private static void findMatch() {
        System.out.println("Enter the first text -> ");
        String firstText = scanner.nextLine();
        System.out.println("Enter the second text -> ");
        String secondText = scanner.nextLine();

        char[] chFirstText = firstText.toCharArray();
        char[] chSecondText = secondText.toCharArray();
        int j = 0;
        boolean ifExists = false;
        for (int i = 0; i < chFirstText.length && j != chSecondText.length; i++) {
            if (chFirstText[i] == chSecondText[j]) {
                j++;
                ifExists = true;
            } else {
                j = 0;
                ifExists = false;
            }
        }
        if (ifExists)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static void longestWord() {
        System.out.println("Enter the text -> ");
        String text = scanner.nextLine();
        String[] arrayWords = text.split(" ");

        String maxWord = null;
        int maxLettersInWord = Integer.MIN_VALUE;
        for (String word : arrayWords) {
            if (word.length() > maxLettersInWord) {
                maxLettersInWord = word.length();
            }
        }
        for (String word : arrayWords) {
            if (word.length() == maxLettersInWord) {
                maxWord = word;
            }
        }
        System.out.printf("The longest word is %s -> %d letters", maxWord, maxLettersInWord);
    }
}
