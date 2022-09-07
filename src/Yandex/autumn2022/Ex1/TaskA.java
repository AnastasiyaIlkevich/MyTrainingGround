package Yandex.autumn2022.Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TaskA {

    public static void main(String[] args) {

        String[][] str = toGetData();

        System.out.println(Arrays.deepToString(str));
        String name = "";
        int sumDate = 0;
        for (int i = 0; i < str[0].length; i++) {
            switch (i) {
                case 0, 1, 2 -> {
                    name = name + str[0][i];
                    continue;
                }
                case 3, 4 -> {
                    sumDate = sumDate + Integer.parseInt(str[0][i]) / 10 + Integer.parseInt(str[0][i]) % 10;
                    continue;
                }
            }
            System.out.println("name     " + name);
            System.out.println("sumDate     " + sumDate);
        }
        char[] ch = name.toCharArray();
        Set<Character> setChar = new HashSet<>();
        for (char c : ch) {
            setChar.add(c);
        }
        System.out.println("setChar.size()     " + setChar.size());

        String s = String.valueOf(ch[0]).toLowerCase(Locale.ROOT);
        char cccr = s.charAt(0);
        int place = cccr - 97 + 1;
        System.out.println("place     " + place);
        int result = setChar.size() + sumDate * 64 + place * 256;
        System.out.println(" 16 :" + Integer.toHexString(result));
        System.out.println("  2 :" + Integer.toBinaryString(result));
        System.out.println("  8 :" + Integer.toOctalString(result));
        String stringResult = Integer.toHexString(result).substring(Integer.toHexString(result).length() - 3);
        System.out.println("stringResult       " + stringResult);
    }

    private static String[][] toGetData() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int numStr = Integer.parseInt(br.readLine());
            String[][] str = new String[numStr][];
            for (int i = 0; i < str.length; i++) {
                str[i] = br.readLine().split(",");
            }
            return str;
        } catch (IOException e) {
            System.err.println("Something went wrong"+e.getMessage()) ;
        }

        return new String[0][];
    }
}
/*

1
Volozh,Arcady,Yurievich,11,2,1964

*/
