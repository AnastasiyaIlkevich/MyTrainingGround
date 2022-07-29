package OvO.Collection.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionHW3 {


    public static void main(String[] args) {
        //Создать динамический массив, содержащий объекты класса HeavyBox.
        List<HeavyBox> boxList = new ArrayList<>();
        boxList.add(new HeavyBox(2));
        boxList.add(new HeavyBox(5));
        boxList.add(new HeavyBox(2));
        //Распечатать его содержимое, используя for each.
        for (HeavyBox box : boxList) {
            System.out.println(box);
        }
        //Изменить вес первого ящика на 1.
        boxList.get(0).setWeight(1);
        //Удалить последний ящик.
        boxList.remove(boxList.size() - 1);
        //Получить массив, содержащий ящики коллекции, тремя способами и вывести на консоль.
        HeavyBox[] array1 = new HeavyBox[boxList.size()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = boxList.get(i);
        }
        System.out.println(Arrays.toString(array1));
        HeavyBox[] array2 = boxList.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(array2));
        HeavyBox[] array3 = boxList.stream().toArray(HeavyBox[]::new);
        System.out.println(Arrays.toString(array3));

        //Удалить все ящики.
        boxList.clear();
    }
}

class HeavyBox {
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}