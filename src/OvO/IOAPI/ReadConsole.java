package OvO.IOAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadConsole {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        while (true) {
            String num = null;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
                num = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if ("stop".equals(num)) {
                break;
            }

            try {
                list.add(Integer.valueOf(num));
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Вы ввели не число!");
            }
        }

        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }
}
