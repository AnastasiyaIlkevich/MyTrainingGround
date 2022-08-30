package OvO.Exception.Quiz;

@SuppressWarnings("unused")
public class Task7 {

    public static void main(String[] args) {
        System.err.println("#1.in");
        try {
            f();
        } catch (Error e) {
            System.err.println("#1.CATCH");
        }
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
            System.err.println(".   .   .   #4.THROW");
            throw new Error();
        }
        System.err.println(".   .   .   #4.out");
    }
}
//#1.in
//.   #2.in
//.   .   #3.in
//.   .   .   #4.in
//.   .   .   #4.THROW
//#1.CATCH
//#1.out