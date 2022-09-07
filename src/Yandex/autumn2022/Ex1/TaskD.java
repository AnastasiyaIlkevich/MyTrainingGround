package Yandex.autumn2022.Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskD {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //количество заказов
        String[][] orders = new String[0][];
        try {
            orders = new String[Integer.parseInt(br.readLine())][];
        } catch (IOException e) {
            e.printStackTrace();
        }

        //запись заказов в массив
        for (int i = 0; i < orders.length; i++) {
            try {
                orders[i] = br.readLine().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //количество запросов
        String[][] requests = new String[0][];
        try {
            requests = new String[Integer.parseInt(br.readLine())][];
        } catch (IOException e) {
            e.printStackTrace();
        }

        //запись запросов в массив
        for (int i = 0; i < requests.length; i++) {
            try {
                requests[i] = br.readLine().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for (int req = 0; req < requests.length; req++) {
            int temp = 0;
            int temp2 = 0;
            for (int or = 0; or < orders.length; or++) {

//                //тест 2
//                if (requests[req][2].equals("2")
//                        && Integer.parseInt(orders[or][1]) >= Integer.parseInt(requests[req][0])
//                        && Integer.parseInt(orders[or][1]) <= Integer.parseInt(requests[req][1])
//                ) {
//                    temp = temp + (Integer.parseInt(orders[or][1]) - Integer.parseInt(orders[or][0]));
//
//                }

                //тест 1
                if (requests[req][2].equals("1")
                        && Integer.parseInt(orders[or][0]) >= Integer.parseInt(requests[req][0])
                        && Integer.parseInt(orders[or][0]) <= Integer.parseInt(requests[req][1])
                ) {
                    temp2 = temp2 + Integer.parseInt(orders[or][2]);

                }

            }
//            //тест 2
//            result.append(temp);
//            if ( (req+1) < requests.length){
//                result.append(" ");
//            }


            //тест 1
            result2.append(temp2);
            if ( (req+1) < requests.length){
                result2.append(" ");
            }


        }
//        //тест 2
//        System.out.println(result);

        //тест 2
        System.out.println(result2);
    }
}
/*
//тест на 2 вопрос

7
3 6 1
4 6 2
3 4 3
4 10 100500
4 11 777
3 8 365
4 8 31
6
6 6 2
6 8 2
5 9 2
3 12 2
9 12 2
8 12 2

тест на 1 вопрос
5
5 20 5
6 21 4
6 22 3
7 23 2
10 24 1
3
6 11 1
4 6 1
7 11 1
*/





