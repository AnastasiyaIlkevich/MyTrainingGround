package OvO.Collection.HW;

import java.util.ArrayDeque;

public class ArrayDequeHW {
    public static void main(String[] args) {
        ArrayDeque<Capital> capitals = new ArrayDeque<>();
        capitals.add(new Capital("Minsk", 1_975_000));
        capitals.addFirst(new Capital("Warsaw", 1_765_000));
        capitals.addLast(new Capital("Vilnius", 544_390));
        capitals.add(new Capital("Beijing", 21_540_000));
        System.out.println(capitals.getFirst());
        System.out.println(capitals.getLast());
        System.out.println(capitals.size());
    }
}
class Capital {
    String name;
    long population;

    public Capital(String name, long population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Capital{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}