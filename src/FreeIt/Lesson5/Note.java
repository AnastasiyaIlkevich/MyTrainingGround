package FreeIt.Lesson5;

import java.util.Arrays;

public class Note {
    Notebook[] notebook = new Notebook[370];

    public void search(String activity) {
        int count = 0;
        boolean search = false;

        for (int i = 0; i < notebook.length; i++) {
            if (notebook[i] == null) {
                continue;
            } else if (notebook[i].activity.equals(activity)) {
                ++count;
                search = true;
            }
        }
        if (search) {
            System.out.println(activity + " встречается " + count + " р.");
        } else {
            System.out.println("Такой активности нет " + activity);
        }



    }

    public void save(String day, String activity) {

        for (int i = 0; i < notebook.length; i++) {
            if (notebook[i] == null) {
                notebook[i] = new Notebook(day, activity);
                System.out.println("   " + notebook[i]);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Diary{" +
                "notebook=" + Arrays.toString(notebook) +
                '}';
    }
}
