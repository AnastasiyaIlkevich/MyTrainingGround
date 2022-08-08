package FreeIt.Tinkof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringNumber = bufferedReader.readLine().split(" ");
        int[] num = {Integer.parseInt(stringNumber[0]), Integer.parseInt(stringNumber[1])};

        String[] names = new String[num[0]];
        for (int i = 0; i < num[0]; i++) {
            names[i] = bufferedReader.readLine();
        }
        String[] cloneNames = names.clone();
        Arrays.sort(cloneNames);

        String[][] numAndPref = new String[num[1]][2];
        for (int i = 0; i < numAndPref.length; i++) {
            numAndPref[i] = bufferedReader.readLine().split(" ");
        }

        //  System.out.println(Arrays.toString(names));
        //  System.out.println(Arrays.toString(cloneNames));
        //  System.out.println(Arrays.deepToString(namAndPref));

        String tempName = null;
        for (String[] strings : numAndPref) {
            int count = 0;
            for (String cloneName : cloneNames) {

                if (cloneName.startsWith(strings[1]) && count != Integer.parseInt(strings[0])) {
                    count++;
                    tempName = cloneName;
                }
                if (count == Integer.parseInt(strings[0])) {
                    System.out.println(Arrays.stream(names).toList().indexOf(tempName) + 1);
                    break;
                }
            }
        }
    }
}
