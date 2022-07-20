package OvO.ClassOOP.HW.ClassCar;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private int year;

    public Car(String brand, String model, double engineVolume, int year) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
