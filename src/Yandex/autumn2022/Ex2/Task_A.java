package Yandex.autumn2022.Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task_A {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] computerWord = bufferedReader.readLine().toCharArray();
        char[] myWord = bufferedReader.readLine().toCharArray();
        char[] answer = new char[computerWord.length];
        for (int i = 0; i < computerWord.length; i++) {
            if (myWord[i] == computerWord[i]) {
                answer[i] = 'P';
                computerWord[i] = 0;
                myWord[i] = 0;
            }
        }

        boolean ifCheck = false;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                for (int j = 0; j < computerWord.length; j++) {
                    if (computerWord[j] == myWord[i]) {
                        computerWord[j] = 0;
                        myWord[i] = 0;
                        answer[i] = 'S';
                        ifCheck = true;
                        break;
                    }

                }
                if (!ifCheck) {
                    answer[i] = 'I';
                } else {
                    ifCheck = false;
                }
            }
        }

        String result = new String(answer);
        System.out.println(result);
    }
}