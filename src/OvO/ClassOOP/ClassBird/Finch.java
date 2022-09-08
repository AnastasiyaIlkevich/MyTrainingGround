package OvO.ClassOOP.ClassBird;

public class Finch implements Bird{
    @Override
    public void takeOff() {
        System.out.println("Вот он есть, а вот его нет...");
    }

    @Override
    public void sitDown() {
        System.out.println("ой, а когда он успел сесть?");
    }
}
