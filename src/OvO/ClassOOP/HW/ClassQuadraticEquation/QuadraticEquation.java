package OvO.ClassOOP.HW.ClassQuadraticEquation;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public int discriminantCalculation() {
        return (int) Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
}
