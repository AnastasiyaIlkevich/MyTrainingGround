package Yandex.summer2022.TaskA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TaskA_v2 {
    //test1 - true
    //test2 - true
    //test3 - true

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] computerWord = bufferedReader.readLine().toCharArray();
        char[] myWord = bufferedReader.readLine().toCharArray();
        String[] answer = new String[computerWord.length];

        for (int i = 0; i < computerWord.length; i++) {
            if (myWord[i] == computerWord[i]) {
                answer[i] = "correct";
                computerWord[i] = 0;
                myWord[i] = 0;
            }
        }

        boolean ifCheck = false;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == null) {
                for (int j = 0; j < computerWord.length; j++) {
                    if (computerWord[j] == myWord[i]) {
                        computerWord[j] = 0;
                        myWord[i] = 0;
                        answer[i] = "present";
                        ifCheck = true;
                        break;
                    }

                }
                if (!ifCheck) {
                    answer[i] = "absent";
                }else {
                    ifCheck = false;
                }
            }
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }
}