package OvO.Collection.Practice;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet <Integer> nums = new TreeSet<>();
        nums.add(8);
        nums.add(1);
        nums.add(4);
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        System.out.println(nums);
        System.out.println(nums.ceiling(5));
        System.out.println(nums.higher(5));
    }


}
