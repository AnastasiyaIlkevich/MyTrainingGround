package FreeIt.Exception;

import java.util.Scanner;

public class ExceptionEx {

    public static void main(String[] args) {

        System.out.println("Start");

        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }



/*        int a = 10/0;
        System.out.println(a);*/
/*        try {
            int[] arrays = new int[10];
            System.out.println(arrays[10]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Вы ввели неправильный индекс");
        }*/
/*        try {
            cheke();
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("что-то пошло не так");
        }*/
/* FileReader reader = null;
        try (){
             reader = new FileReader("shhagdfshgd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }*/

        //registration();
        System.out.println("finish");
    }

    private static void registration() {
        String name = null;
        int password = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите имя");
            name = scanner.nextLine();
            System.out.println("Введите числовой пароль");

            password = Integer.parseInt(scanner.nextLine());
            System.out.println(name + " " + password);
        } catch (NumberFormatException ex){
            System.out.println("Вы ввели неправильный пароль");
        } catch (ArrayIndexOutOfBoundsException ex2){
            System.out.println("Вы ввели неправильный индекс");
        } catch (Exception exception){
            System.out.println("я не знаю что пошло не так");
        }
        finally {
            if (name==null||
                    name.length()<3||
                    String.valueOf(password).length()<3){
                System.out.println("Вы ввели неправильные данные");
                registration();
            }
        }

        scanner.close();


    }


}
