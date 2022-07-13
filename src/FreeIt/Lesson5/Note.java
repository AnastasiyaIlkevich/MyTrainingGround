package FreeIt.Lesson5;

//Создать класс записной книжки, в котором хранятся записи дел.
// Создать в этом классе метод, который выводит частотный словарь
// для определенной записи (запись можно определить по номеру/индексу)
public class Note {

    String day;
    String activity;


//    public String getActivity() {

    public Note(String day, String activity) {
        this.day = day;
        this.activity = activity;
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "day='" + day + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }
}
