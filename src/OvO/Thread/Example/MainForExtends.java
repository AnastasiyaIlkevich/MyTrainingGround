package OvO.Thread.Example;

public class MainForExtends {
    public static void main(String[] args) {
        System.out.println("Started Main____________");
        ThreadExtendsThread thread = new ThreadExtendsThread("Thread");
        thread.start();
        System.out.println("Finished Main___________");
    }
}
