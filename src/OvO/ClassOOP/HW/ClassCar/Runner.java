package OvO.ClassOOP.HW.ClassCar;

public class Runner {


    public static void main(String[] args) {
        Car bmv = new Car("BMV", "Z4", 3.2, 2018);
        Car ford = new Car("Ford", "GT500", 5.2, 2016);
        Car ford2 = new Car("Ford", "Z4", 2.0, 2018);
        System.out.println(bmv.equals(ford)); //false
        System.out.println(bmv.equals(ford2)); //true
    }

}
