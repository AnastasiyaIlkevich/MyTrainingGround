package FreeIt.EXM;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int floor = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer[]> listFloor = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        }.thenComparing(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        }));

        for (int i = 0; i < floor; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            Integer[] num = {Integer.parseInt(s[0]), Integer.parseInt(s[1])};
            listFloor.add(num);
        }

        Integer[][] listFloorMatrix = new Integer[floor][2];
        for (int i = 0; i < listFloorMatrix.length; i++) {
            listFloorMatrix[i] = listFloor.poll();
        }

        int temp = -1;
        int count = 1;
        boolean down = false;
        for (int i = 0; i < listFloorMatrix.length - 1; i++) {

            if (listFloorMatrix[i][1].equals(listFloorMatrix[i + 1][0]) && temp <= listFloorMatrix[i][1] && !down) {
                temp = listFloorMatrix[i + 1][1];
                count++;
            } else if (!listFloorMatrix[i][1].equals(listFloorMatrix[i + 1][0]) && !down) {
                i = i - 1;
                down = true;

            } else if (listFloorMatrix.length - 2 > i && down && listFloorMatrix[i][1].equals(listFloorMatrix[i + 2][0]) && temp <= listFloorMatrix[i][1]) {
                temp = listFloorMatrix[i + 1][1];
                count++;
                i++;
                down = false;
            }
        }
        System.out.println(count);
    }
}

