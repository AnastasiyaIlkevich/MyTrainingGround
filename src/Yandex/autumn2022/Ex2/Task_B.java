package Yandex.autumn2022.Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task_B {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberDisciplines = Integer.parseInt(bufferedReader.readLine());
        String[][] arrayDisciplines = new String[numberDisciplines][2];
        for (int i = 0; i < arrayDisciplines.length; i++) {
            arrayDisciplines[i] = bufferedReader.readLine().split(",");
        }
        int numberCandidates = Integer.parseInt(bufferedReader.readLine());
        String[][] arrayCandidates = new String[numberCandidates][4];
        for (int i = 0; i < arrayCandidates.length; i++) {
            arrayCandidates[i] = bufferedReader.readLine().split(",");
        }
        Arrays.sort(arrayCandidates, new Comparator<String[]>() {
            @Override
            public int compare(final String[] first, final String[] second) {
                return Integer.valueOf(second[2]).compareTo(Integer.valueOf(first[2]));
            }
        }.thenComparing(new Comparator<String[]>() {
            @Override
            public int compare(final String[] first, final String[] second) {
                return Integer.valueOf(first[3]).compareTo(Integer.valueOf(second[3]));
            }
        }));

        Set<String> answer = new TreeSet<>();
        for (int i = 0; i < arrayDisciplines.length; i++) {
            int temp = 0;
            for (int j = 0; j < arrayCandidates.length; j++) {
                if (arrayDisciplines[i][0].equals(arrayCandidates[j][1])) {
                    answer.add(arrayCandidates[j][0]);
                    ++temp;
                }
                if (temp == Integer.parseInt(arrayDisciplines[i][1])) {
                    break;
                }
            }
        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
