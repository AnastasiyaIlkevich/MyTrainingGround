package OvO.File;

import java.io.File;
import java.util.Arrays;

public class WorkWithClassFile {

    public static void main(String[] args) {

        File file = new File("D:/Java/Обучение EPAM");
        System.out.println("это файл? -> " + file.isFile());// это файл?          false
        System.out.println("это директория? -> " + file.isDirectory()); //это папка?    true

        System.out.println(file.length() + " -> file.length( D:/Java/Обучение EPAM ) ");
        System.out.println(Arrays.toString(file.list()) + "file.list( D:/Java/Обучение EPAM ) ");

        for (String s : file.list()) {
            System.out.println("___________________________________________________");
            File file2 = new File("D:/Java/Обучение EPAM/" + s);
            System.out.println("это файл? -> " + file2.isFile());
            System.out.println("это директория? -> " + file2.isDirectory());
            System.out.println(file2.length() + " -> file.length( D:/Java/Обучение EPAM/" + s + " ) ");
            System.out.println(Arrays.toString(file2.list()) + " file.list( D:/Java/Обучение EPAM/" + s + " ) ");
            System.out.println("___________________________________________________");
        }
    }
}
