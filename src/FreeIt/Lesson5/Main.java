package FreeIt.Lesson5;

//Создать класс записной книжки, в котором хранятся записи дел.
// Создать в этом классе метод, который выводит частотный словарь
// для определенной записи (запись можно определить по номеру/индексу)

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.save("Sunday", "Run");
        notebook.save("Sunday", "Run");
        notebook.save("Sunday", "Run");
        notebook.save("Sunday", "Run");
        System.out.println(notebook);
        notebook.search("Run");

    }
}
