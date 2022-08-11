package FreeIt.EXM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) throws IOException {
        //немного не поняла условие задачи. Почему начав движение ловим букву е, а потом возвращаемся к h.
        //сформулоровала вопрос и похоже поняла. Мы идём по алфавиту...
        //неуспею уже реализовать решение :((((
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        int num = Integer.parseInt(bufferedReader.readLine());
        String[][] number = new String[num][2];
        for (int i = 0; i < num; i++) {
            number[i] = bufferedReader.readLine().split(" ");
        }
        char[] charWord = word.toCharArray();
        for (String[] strings : number) {

            System.out.println(step(strings, charWord));
        }
    }

    private static int step(String[] number, char[] charWord) {

        char[] lineSegment = new char[Integer.parseInt(number[1])];
        char[] checkLineSegment = new char[Integer.parseInt(number[1])];
        for (int i = Integer.parseInt(number[0]), j = 0; i <= lineSegment.length; i++, j++) {
            lineSegment[j] = charWord[i - 1];
            checkLineSegment[j] = '-';
        }
        int sum = 0;
        int start = 0;
        boolean b = false;
        for (int i = 1; i < charWord.length; i++) {
            for (int j = 0; j < lineSegment.length; j++) {
                if (charWord[i] == lineSegment[j]) {
                    lineSegment[j] = '-';
                    b = true;
                    break;
                }
            }
            if (b) {
                sum = sum + Math.abs(start - i);
                b = false;
            }
            if (Arrays.equals(lineSegment, checkLineSegment)) {
                break;
            }
            if (charWord[i] == charWord[charWord.length - 1]) {
                i = -1;
            }
        }
        return sum;
    }
}
