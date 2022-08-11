package FreeIt.EXM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        int[] arrayNumber = new int[strings.length];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = Integer.parseInt(strings[i]);
        }
        int minAddSubsInDay = Integer.MAX_VALUE;
        int maxCancelSubsInDay = 1;

        int resultMinAddSubs = 0;
        int resultMaxCancelSubs = 0;

        for (int i = 0, j = 1; j < arrayNumber.length; i = i + 2, j = j + 2) {
            resultMinAddSubs += arrayNumber[i];
            if (arrayNumber[i] < minAddSubsInDay) {
                minAddSubsInDay = arrayNumber[i];
            }
            resultMaxCancelSubs += arrayNumber[j];
            if (arrayNumber[j] > maxCancelSubsInDay) {
                maxCancelSubsInDay = arrayNumber[j];
            }
        }
        if (maxCancelSubsInDay > minAddSubsInDay) {
            resultMinAddSubs = resultMinAddSubs - minAddSubsInDay + maxCancelSubsInDay;
            resultMaxCancelSubs = resultMaxCancelSubs - maxCancelSubsInDay + minAddSubsInDay;
        }
        System.out.println(resultMinAddSubs - resultMaxCancelSubs + countDay(day,arrayNumber));
    }

    private static int countDay(int day, int [] arrayNumber) {
        if (day % 2 == 0)
            return 0;
        else
            return arrayNumber[arrayNumber.length-1];

    }


}
