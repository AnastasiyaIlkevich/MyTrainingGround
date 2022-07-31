package OvO.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableHW {

    public static void main(String[] args) {
        String[] names = {"Bobik", "Kesha", "Vaska", "Koshka", "Sonya", "Frosya",};
        List<Animal> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(new Animal(names[i]));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}

class Animal implements Comparable<Animal> {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Animal o) {

        return name.charAt(0) - o.getName().charAt(0);//name.charAt(0) - o.getName().charAt(0);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}