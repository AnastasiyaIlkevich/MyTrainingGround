package Yandex.autumn2022.Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TaskB2 {
    public static void main(String[] args) {
        //  0     1     2       3       4
        // day  hour    min     id      status
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            num = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[][] date = new String[num][];

        for (int i = 0; i < num; i++) {

            try {
                date[i] = br.readLine().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Arrays.deepToString(date));

        Arrays.sort(date, new Comparator<String[]>() {
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
        System.out.println("__________________________");
        System.out.println(Arrays.deepToString(date));

        Map<Integer,Integer> map = new HashMap<>();
        String[] s = new String[0];
        for (String[] strings : date) {
            int result =0;
            if ("A".equals(strings[4])) {
                s = strings;
            } else if ("S".equals(strings[4]) || "C".equals(strings[4])) {
                int day = Integer.parseInt(strings[0]) - Integer.parseInt(s[0]);
                int hour = Integer.parseInt(strings[1]) - Integer.parseInt(s[1]);
                int min = Integer.parseInt(strings[2]) - Integer.parseInt(s[2]);
                result = day * 24 * 60 + hour * 60 + min;
                System.out.println("result   " + result);
            }
            if (map.get(Integer.parseInt(strings[3]))==null){
                map.put(Integer.parseInt(strings[3]),result);
            }else {
                int finalResult = result;
                map.computeIfPresent(Integer.parseInt(strings[3]), (k, v) -> v + finalResult);
            }
            System.out.println(map);

        }
//        String[] strTemp = new String[1];
//        while (!listDate.isEmpty()) {
//            String[] s = listDate.poll();
//            if ("A".equals(s[4])) {
//                strTemp = s;
//
//            } else if ("S".equals(s[4]) || "C".equals(s[4])) {
//                int day = Integer.parseInt(s[0]) - Integer.parseInt(strTemp[0]);
//                int hour = Integer.parseInt(s[1]) - Integer.parseInt(strTemp[1]);
//                int min = Integer.parseInt(s[2]) - Integer.parseInt(strTemp[2]);
//                int result = day * 24 * 60 + hour * 60 + min;
//                System.out.println("result   " + result);
//            }
//        }
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
