package FreeIt.EXM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Task2 {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> mapNamesCountWin = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numString = Integer.parseInt(bufferedReader.readLine());
        String[][] names = new String[numString][3];

        int numberWins = 1;
        for (int i = 0; i < numString; i++) {
            names[i] = bufferedReader.readLine().split(" ");
            Arrays.sort(names[i]);
            if (mapNamesCountWin.containsKey(Arrays.toString(names[i]))) {
                mapNamesCountWin.computeIfPresent(Arrays.toString(names[i]), (k, v) -> v + 1);
            } else {
                mapNamesCountWin.put(Arrays.toString(names[i]), numberWins);
            }
        }
        System.out.println(Collections.max(mapNamesCountWin.values()));
    }
}


//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        List<String> name = new ArrayList<>();
//        Map<String, Integer> map = new HashMap<>();
//
//        String s = bufferedReader.readLine();
//        int num = Integer.parseInt(s);
//        for (int i = 0; i < num; i++) {
//            name.add(bufferedReader.readLine());
//        }
//
//
//        Iterator<String> iterator = name.iterator();
//        while (iterator.hasNext()) {
//            int count = 1;
//            String str = iterator.next();
//            String[] split = str.split(" ");
//            Arrays.sort(split);
//            if (map.containsKey(Arrays.toString(split))) {
//                map.computeIfPresent(Arrays.toString(split), (k, v) -> v + 1);
//            } else {
//                map.put(Arrays.toString(split), count);
//            }
//
//        }
//        Integer max = Collections.max(map.values());
//        System.out.println(max);
//    }
//
//}
