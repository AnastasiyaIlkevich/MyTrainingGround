package OvO.Exception.Quiz;

public class Task1 {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f();
        System.err.println("#1.out");
    }
    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }
    public static void g() {
        System.err.println(".   .   #3.in");
        h();
        System.err.println(".   .   #3.out");
    }
    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.RETURN");
            return;
        }
        System.err.println(".   .   .   #4.out");
    }
}
//#1.in
//.   #2.in
//.   .   #3.in
//.   .   .   #4.in
//.   .   .   #4.RETURN  // завершает метод
//.   .   #3.out
//.   #2.out
//#1.out
//