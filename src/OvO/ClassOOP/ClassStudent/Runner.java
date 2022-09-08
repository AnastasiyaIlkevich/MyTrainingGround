package OvO.ClassOOP.ClassStudent;

import java.util.Scanner;

public class Runner {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Student student = new Student("Pupkin", "Roma");

        System.out.println("Please enter student's grades.");
        System.out.println("Grades must be entered with a space at the end press \"enter\"");
        String strGrades = scanner.nextLine();

        student.setGrade(strGrades);

        System.out.println(student.averageScore());

    }
}
