package YandexEx2022.TaskA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA_v1 {
    //test1 - true
    //test2 - false
    //test3 - false

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] firstWord = bufferedReader.readLine().toCharArray();
        char[] secondWord = bufferedReader.readLine().toCharArray();

        boolean ifCor;

       for (int i = 0; i < firstWord.length; i++) {
           ifCor = true;
            if (secondWord[i] ==firstWord[i]) {
                System.out.println("correct");
                firstWord [i] = 0;
                secondWord[i] = 0;
            }else {
                for (int j = 0; j < firstWord.length; j++) {
                    if (secondWord[i] == firstWord[j]) {
                        System.out.println("present");
                        break;
                    }else if (j==firstWord.length-1){
                        ifCor = false;
                    }
                    if(!ifCor){
                        System.out.println("absent");

                    }
                }

            }

        }

    }
}
