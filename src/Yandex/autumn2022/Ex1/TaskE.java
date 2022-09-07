package Yandex.autumn2022.Ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TaskE {

    public static void main(String[] args) {
        File file = new File("input.txt");
        ArrayList<String[]> strings = new ArrayList<>();

        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                strings.add(line.split(" "));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] string : strings) {
            System.out.println(Arrays.toString(string));
        }

        int qustchen = 0;
        Iterator<String[]> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String[] next = iterator.next();
            if (next.length == 1) {
                qustchen = Integer.parseInt(next[0]);
            }
        }
        System.out.println("qustchen " + qustchen);

        ArrayList<String[]> вопрос = new ArrayList<>();
        ArrayList<String[]> зелья = new ArrayList<>();

        for (int i = 1; i < strings.size(); i++) {
            if (i<strings.size()-qustchen-1)
            зелья.add(strings.get(i));
            if (i>strings.size()-qustchen-1)
                вопрос.add(strings.get(i));
        }
        System.out.println("----------------------");
        for (String[] string : зелья) {
            System.out.println(Arrays.toString(string));
        }
        String[] temp = strings.get(0);
        int tempзелья = Integer.parseInt(temp[0])-зелья.size();
        System.out.println("tempзелья "+ tempзелья);
        System.out.println("----------------------");
        for (String[] string : вопрос) {
            System.out.println(Arrays.toString(string));
        }

        for (int i = 0; i < вопрос.size(); i++) {

            String[] str = вопрос.get(i);


        }

    }


}

