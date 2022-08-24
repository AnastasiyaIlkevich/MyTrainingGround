package OvO.Generic;

public class Task2 {

    //Задача 2. Создайте класс Animal и несколько классов-наследников.
    // Далее создайте обобщённый класс, который ограничен extends Animal.
    // В обобщённом методе вам необходимо в качестве параметра T принимать
    // различные подклассы животных и выводить название животного и его цвет.
    public static void main(String[] args) {
        Animal animal = new Animal("some animal", "some color");
        Cat cat = new Cat("Cat","black");
        Dog dog = new Dog("Dog","orange");
        Pig pig = new Pig("Pig", "red");

        AnimalGeneric<Animal> animalAnimalGeneric = new AnimalGeneric<>();
        animalAnimalGeneric.infoGeneric(cat);


    }
}

class AnimalGeneric <T extends Animal>{

   public void infoGeneric(T obj){
       System.out.println(obj.getType());
       System.out.println(obj.getColor());
    }
}

class Animal {
    private String type;
    private String color;

    public Animal(String name, String color) {
        this.type = name;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

}

class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }
}

class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }
}

class Pig extends Animal {

    public Pig(String name, String color) {
        super(name, color);
    }
}