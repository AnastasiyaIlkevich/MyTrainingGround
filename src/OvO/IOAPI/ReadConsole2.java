package OvO.IOAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк");
        String numString = bufferedReader.readLine();
        if (Integer.parseInt(numString) <= 0) {
            System.out.println("Ну нет так нет:)))");
            System.exit(1);
        }

        String[] arrayString = new String[Integer.parseInt(numString)];
        for (int i = 0; i < Integer.parseInt(numString); i++) {
            arrayString[i] = bufferedReader.readLine();
        }
        bufferedReader.close();

        for (String s : arrayString) {
            System.out.println("System.out.println -> length = " + s.length());
            System.out.printf("System.out.printf -> Длинна строки %s равна %d элементов \n", s, s.length());
        }
    }
}
