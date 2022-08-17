package OvO.StremAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamHW {
    public static void main(String[] args) {

        String[] arrayNames = {"Jon", "Jack", "Sarra", "Katy", "Jack", "Anastasiya", "July", "Vik"};
        getName(arrayNames);
        arraySort(arrayNames);
    }

    private static void arraySort(String[] arrayNames) {
        String names = Arrays.stream(arrayNames)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }

    private static void getName(String[] arrayNames) {
        Set<String> names = new HashSet<>(Arrays.asList(arrayNames));
        names.stream()
                .filter(x -> x.charAt(0) == 'J')
                .forEach(System.out::println);

    }
}
