package YandexEx2022.TaskA;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class TaskB {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberVacancies = Integer.parseInt(bufferedReader.readLine());
        String[][] arrayVacancies = new String[numberVacancies][2];
        for (int i = 0; i < arrayVacancies.length; i++) {
            arrayVacancies[i] = bufferedReader.readLine().split(",");
        }
        System.out.println(Arrays.deepToString(arrayVacancies));

        int numberCandidates = Integer.parseInt(bufferedReader.readLine());
        String[][] arrayCandidates = new String[numberCandidates][4];
        for (int i = 0; i < arrayCandidates.length; i++) {
            arrayCandidates[i] = bufferedReader.readLine().split(",");
        }
        System.out.println(Arrays.deepToString(arrayCandidates));

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
        System.out.println(Arrays.deepToString(arrayCandidates));


    }
}
