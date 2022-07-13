package FreeIt.Lesson5;

import java.util.Arrays;

public class Notebook {
    Note[] note = new Note[370];

    public void search(String activity) {
        int count = 0;
        boolean search = false;

        for (int i = 0; i < note.length; i++) {
            if (note[i] == null) {
                continue;
            } else if (note[i].activity.equals(activity)) {
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

        for (int i = 0; i < note.length; i++) {
            if (note[i] == null) {
                note[i] = new Note(day, activity);
                System.out.println("   " + note[i]);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Diary{" +
                "notebook=" + Arrays.toString(note) +
                '}';
    }
}
