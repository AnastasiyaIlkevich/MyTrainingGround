package FreeIt.Lesson5;

//Создать класс записной книжки, в котором хранятся записи дел.
// Создать в этом классе метод, который выводит частотный словарь
// для определенной записи (запись можно определить по номеру/индексу)

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Note note = new Note();
        note.save("Sunday", "Run");
        note.save("Sunday", "Run");
        note.save("Sunday", "Run");
        note.save("Sunday", "Run");
        System.out.println(note);
        note.search("Run");

    }
}
