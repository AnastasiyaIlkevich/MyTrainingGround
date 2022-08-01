package OvO.Comparator;


import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparatorHW {

    public static void main(String[] args) {
        String[] names = {"Bobik","Bobik", "Kesha", "Vaska", "Koshka", "Sonya", "Frosya"};
        String[] colors = {"Red","Black", "Blue", "Orange", "Red", "Red", "Black"};
        PriorityQueue<Animal> list = new PriorityQueue<>(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparing(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        }));

        for (int i = 0; i < 6; i++) {
            list.add(new Animal(names[i], colors[i]));
        }

        while (!list.isEmpty()){
            Animal peek = list.poll();
            System.out.println(peek);
        }
    }
}

class Animal {
    private String name;
    private String color;


    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
