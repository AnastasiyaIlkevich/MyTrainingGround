package FreeIt.EXM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] coordinatesFirstFigure = bufferedReader.readLine().split(" ");
        String[] coordinatesSecondFigure = bufferedReader.readLine().split(" ");

        int sumArea = calculateAreaFigure(coordinatesFirstFigure) + calculateAreaFigure(coordinatesSecondFigure);
        int areaNewSquare = (int) Math.pow(sumArea, 2);
        System.out.println(areaNewSquare);

    }

    private static int calculateAreaFigure(String[] coordinatesFirstFigure) {
        int a = Integer.parseInt(coordinatesFirstFigure[2]) - Integer.parseInt(coordinatesFirstFigure[0]);
        int b = Integer.parseInt(coordinatesFirstFigure[3]) - Integer.parseInt(coordinatesFirstFigure[1]);
        return a * b;
    }
}
//6 6 8 8
//1 8 4 9