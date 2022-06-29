package OvO.Integer.Practice;

import java.util.Scanner;

public class PracticeWithInteger_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of squirrels");
        int nSquirrel = scanner.nextInt();
        System.out.println("please enter quantity of nuts");
        int kNuts = scanner.nextInt();
        scanner.close();


        /*
        N белочек нашли k орешков. Помогите белочкам разделить орешки.
         */
        shareNutsForSquirrels(kNuts,nSquirrel);

        /*
        оставшиеся орешки
         */
        residueNuts(kNuts,nSquirrel);

    }

    public static void residueNuts(int kNuts, int nSquirrel) {
        int residueNuts = kNuts%nSquirrel;
        System.out.println("оставшиеся орехи = " + residueNuts);
    }

    public static void shareNutsForSquirrels(int kNuts, int nSquirrel) {
        int nutsForSquirrels = kNuts/nSquirrel;
        System.out.println("каждая белка получит орехи = " + nutsForSquirrels);
    }
}
