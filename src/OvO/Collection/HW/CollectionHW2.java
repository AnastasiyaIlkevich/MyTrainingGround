package OvO.Collection.HW;

import java.util.*;

public class CollectionHW2 {

    public static void main(String[] args) {
        String [] arrayAnimal = {"cat", "dog", "otter", "goose", "horse", "pig", "rat", "camel", "elephant", "fox"};
        List<Animal> listAnimal = new LinkedList();
        for (String name : arrayAnimal){
            Animal animal = new Animal();
            animal.setName(name);
            listAnimal.add(animal);
        }

        System.out.println(listAnimal);
        System.out.println(delete(listAnimal));
    }

    private static List<Animal> delete(List<Animal> listAnimal) {
        char [] arrayVowels = { 'a','e','i','o','u','y'};
        Iterator<Animal> iterator = listAnimal.iterator();
        while (iterator.hasNext()){
           char ch = iterator.next().getName().charAt(0);
            for (int i = 0; i <arrayVowels.length ; i++) {
                if (arrayVowels[i]==ch){
                   iterator.remove();
                }
            }
        }
        return listAnimal;
    }
}



class Animal {
    private String name;

    public void setName(String animal) {
            this.name = animal;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}