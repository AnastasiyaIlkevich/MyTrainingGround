package OvO.ClassOOP.ClassQuadraticEquation;

public class QuadraticEquation extends Object{

    private int a;
    private int b;
    private int c;
    private double x1;
    private double x2;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int discriminantCalculation() {
        return (int) Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public int countRoots(int disc) {
        if (disc == 0) {
            return 1;
        } else if (disc > 0) {
            return 2;
        }
        return 0;
    }

    public void setRoot(int disc) {
        int countRoots = countRoots(disc);
        if (countRoots == 1) {
            this.x1 = -(this.b / (2 * this.a));
            this.x2 = this.x1;
        } else if (countRoots == 2) {
            this.x1 = (-this.b + Math.sqrt(disc)) / 2 * this.a;
            this.x2 = (-this.b - Math.sqrt(disc)) / 2 * this.a;
        } else {
            System.out.println("This quadratic equation has no roots.");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}




