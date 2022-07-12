package FreeIt.Lesson7;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {

//        //создание строк
//        String str1 = "String";
//        String str2 = null;
//        String str3 = new String();
//        String str4 = new String(new char[]{'c','a','t'});
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);

        //сравнение строк
//        String str1 = "Nastya";
//        String str2 = "Nastya";
//        String str3 = new String("Nastya");
//        String str4 = new String("Nastya");
//
//        System.out.println(str1==str2);
//        System.out.println(str2==str3);
//        System.out.println(str3==str4);
//
//        //сложение (соединение) строк
//        String str1 = "dog";
//        String str2 = "And";
//        String str3 = "Cat";
//
//        System.out.println(str1 + str2 + str3);
//        System.out.println(str1 + " " + 2000);
//
//        int birthday = 26;
//        String str4 = "Cat "+ String.valueOf(birthday);
//        System.out.println(str4);


//        //объект String является неизменяемым (immutable)
//        String str1 = "I like coffee";
//        System.out.println(str1);
//        str1 = "I like tea";
//        System.out.println(str1);

//        методы
//        соединение строк

//        //valueOf()
//        String.valueOf(birthday)
//
//        //concat()
//        str2 = str2.concat(str1); // HelloJava

//        //join()
//        String str1 = "Java";
//        String str2 = "Hello";
//        String str4 = "Java";
//        String str5 = "Hello";
//        String str3 = String.join("And", str2, str1, str4, str5); // Hello Java
//        System.out.println(str3);

        //длинна строки
        //str1.length()

        //получить символ
        //char c = str.charAt(2);

//        //преобразование в массив char
//        String str1 = "Java";
//        char[] chars = str1.toCharArray();
//        System.out.println(Arrays.toString(chars));
//        for (char ch : chars){
//            System.out.println(ch);
//        }

        // разитие строки по какому-то критерию
        // split()
//        String str1 = "I like coffee";
//        String[] s = str1.split(" ");
//        for (String str : s) {
//            System.out.println(str);
//        }


//        //сравнение
//        //equals()
//        //equalsIgnoreCase()
//        String str1 = "Java";
//        String str2 = "jaVA";
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));

        //поиск
        //indexOf()
        //lastIndexOf()

        //замена в строке
        //replace()
//String str = "Hello world";
        //String replStr1 = str.replace('l', 'd'); // Heddo wordd
        //String replStr2 = str.replace("Hello", "Bye"); // Bye world


        String string = "I like java!!!";

        //---------------------------------------------------------
        //б) Распечатать последний символ строки. Используем метод String.charAt().

        System.out.println("б)Последний символ строки - " + string.charAt(string.length() - 1));
        //---------------------------------------------------------
        //в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println("в)Заканчивается ли строка подстрокой" + " !!! - " + string.endsWith("!!!"));
        //---------------------------------------------------------
        //г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println("г)Начинается ли строка подстрокой" + " I like - " + string.startsWith("I like"));
        //---------------------------------------------------------
        //д) Проверить, содержит ли ваша строка подстроку “java”. Используем метод String.contains().
        System.out.println("д)Cодержит ли строка подстроку" + " Java - " + string.contains("Java"));//проверка по содержанию...
        //---------------------------------------------------------
        //e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println("e)Позиция подстроки" + " java - " + string.indexOf("java"));//НЕ УВЕРЕНА ПРАВИЛЬНО ЛИ
        //---------------------------------------------------------
        //ж) Заменить все символы “а” на “о”.
        System.out.println("ж)Заменить все символы - " + string.replace("a", "o"));
        //---------------------------------------------------------
        //з) Преобразуйте строку к верхнему регистру.
        System.out.println("з)Cтрока к верхнем регистр - " + string.toUpperCase());
        //---------------------------------------------------------
        //и) Преобразуйте строку к нижнему регистру.
        System.out.println("и)Cтрока в нижнем регистр - " + string.toLowerCase());
        //---------------------------------------------------------
        //к) Вырезать строку Java c помощью метода String.substring().
        //System.out.println("к)Cтрока Java - " + string.substring(7, 11));
        System.out.println("к)Вырезаем слово 'Java' из строки => " + string.substring(string.indexOf("java"), string.lastIndexOf("!!!")));



    }
}
