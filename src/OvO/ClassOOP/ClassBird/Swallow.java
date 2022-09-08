package OvO.ClassOOP.ClassBird;

public class Swallow implements Bird{
    @Override
    public void takeOff() {
        System.out.println("Взлетает молниеносно");
    }

    @Override
    public void sitDown() {
        System.out.println("Садится плавно");
    }
}
