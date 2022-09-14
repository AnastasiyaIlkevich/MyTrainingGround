package OvO.Thread.Lock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HWMainLock {

    /**
     * Пользователь вводит строку из консоли. Вам необходимо создать несколько потоков,
     * которые меняют буквы в строке. Например, есть 2 потока, один меняет «а» на «о»,
     * второй - «а» на «н». Для синхронизации используйте блокировки, выводите строку
     * каждый раз, как отработает поток, чтобы видеть изменения.
     */


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text");
        String str = br.readLine();
        TextCorrection textCorrection = new TextCorrection();
        TextCorrectionFirst textCorrectionFirst = new TextCorrectionFirst(str, textCorrection);
        TextCorrectionSecond textCorrectionSecond = new TextCorrectionSecond(str, textCorrection);
        textCorrectionFirst.start();
        textCorrectionSecond.start();
    }
}






class TextCorrectionFirst extends Thread {

    String str;
    TextCorrection textCorrection;

    public TextCorrectionFirst(String str, TextCorrection textCorrection) {
        this.str = str;
        this.textCorrection = textCorrection;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        textCorrection.correct('a', 'o', str);
    }
}

class TextCorrectionSecond extends Thread {

    String str;
    TextCorrection textCorrection;

    public TextCorrectionSecond(String str, TextCorrection textCorrection) {
        this.str = str;
        this.textCorrection = textCorrection;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        textCorrection.correct('a', 'n', str);
    }
}


class TextCorrection {
    Lock lock = new ReentrantLock();

    public void correct(char a, char b, String str) {

        lock.lock();
        char[] arrayChar = str.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == a) {
                arrayChar[i] = b;
            }
        }
        System.out.println(new String(arrayChar));
        lock.unlock();
    }
}
