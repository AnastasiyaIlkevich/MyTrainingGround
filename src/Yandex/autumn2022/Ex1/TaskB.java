package Yandex.autumn2022.Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskB {
    public static void main(String[] args) {
        //  0     1     2       3       4
        // day  hour    min     id      status
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<String[]> listDate = new PriorityQueue<>(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
            }
        }.thenComparing(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }

        }.thenComparing(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
            }
        }.thenComparing(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            }
        }))));

        for (int i = 0; i < 8; i++) {
            String[] s = new String[0];
            try {
                s = br.readLine().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }

            listDate.add(s);
//            for (String[] strings : listDate) {
//                System.out.println(i + "   " + Arrays.toString(strings));
//
//            }
        }

        for (String[] strings : listDate) {
            System.out.println(Arrays.toString(strings));

        }

        String[] strTemp = new String[1];
        while (!listDate.isEmpty()) {
            String[] s = listDate.poll();
            if ("A".equals(s[4])) {
                strTemp = s;

            } else if ("S".equals(s[4]) || "C".equals(s[4])) {
                int day = Integer.parseInt(s[0]) - Integer.parseInt(strTemp[0]);
                int hour = Integer.parseInt(s[1]) - Integer.parseInt(strTemp[1]);
                int min = Integer.parseInt(s[2]) - Integer.parseInt(strTemp[2]);
                int result = day * 24 * 60 + hour * 60 + min;
                System.out.println("result   " + result);
            }
        }
        //  0     1     2       3       4
        // day  hour    min     id      status


/*        8
50 7 25 3632 A
14 23 52 212372 S
15 0 5 3632 C
14 21 30 212372 A
50 7 26 3632 C
14 21 30 3632 A
14 21 40 212372 B
14 23 52 3632 B
        */
    }


}
/*

10 36 12 4 A
9 5 12 5 B
12 48 13 4 C
6 48 13 4 D

*/
