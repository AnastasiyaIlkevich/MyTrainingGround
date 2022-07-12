package FreeIt.Lesson7;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String s = "Тестовая строка, используемая для разложения на слова";
        StringTokenizer st = new StringTokenizer(s, ", .");

        Iterator iterator = st.asIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
