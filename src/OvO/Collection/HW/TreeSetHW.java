package OvO.Collection.HW;

import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;

public class TreeSetHW {
    public static void main(String[] args) {

        String str = "The book follows Harry Potter " +
                "a young wizard in his third year at Hogwarts " +
                "School of Witchcraft and Wizardry along with his " +
                "friends Ronald Weasley and Hermione Granger Harry " +
                "investigates Sirius Black an escaped prisoner from Azkaban " +
                "the wizard prison, believed to be one of Lord Voldemort's old allies";

        String[] arraySrt = str.toLowerCase(Locale.ROOT).split(" ");
        System.out.println(arraySrt.length);

        TreeSet<String> setString2 = new TreeSet<>();
        setString2.addAll(Arrays.asList(arraySrt));
        System.out.println(setString2);
        System.out.println(setString2.size());
    }
}
