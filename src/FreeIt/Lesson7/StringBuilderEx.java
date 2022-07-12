package FreeIt.Lesson7;

public class StringBuilderEx {

    public static void main(String[] args) {

        //Изменяющиеся и не изменяющиеся строки.

        String string = "I like java!!!";

        StringBuilder sb = new StringBuilder(string);
        System.out.println(string);
        System.out.println(sb);

        string = string.replace("a", "O");
        System.out.println(string);
        string = string.replace("O", "A");
        System.out.println(string);

        sb.append(" Nastya!!!");
        System.out.println(sb);

    }
}
