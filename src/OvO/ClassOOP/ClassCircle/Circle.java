package OvO.ClassOOP.ClassCircle;

public class Circle {

    static double Pi = Math.PI;
    private double radius;
    private double space;
    private double circleLength;

    public Circle(double radius) {
        this.radius = radius;
        this.space = spaceCalculation(radius);
        this.circleLength = circleLengthCalculation(radius);
    }

    private double circleLengthCalculation(double radius) {
        return  2 * Pi * radius;
    }

    private double spaceCalculation(double radius) {
        return Pi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", space=" + space +
                ", circleLength=" + circleLength +
                '}';
    }
}
