package FreeIt.Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {

        //регулярные выражения
        // метод стринга
        String str1 = "I like coffee";
        boolean res = str1.matches("\\w+\\s+\\w+\\s+\\w+");
        boolean res2 = str1.matches(".+\\D");
        System.out.println(res);
        System.out.println(res2);

        // телефонный номер
        // +375 29 200 00 00
        // +375290000000
        String str2 = "+375290000000";
        boolean res3 = str2.matches("\\+?\\d{12}");
        System.out.println(res3);


//        String input = "Hello";
//        Pattern pattern = Pattern.compile("Hello");
//        Matcher matcher = pattern.matcher(input);
//        boolean found = matcher.matches();
//        if (found)
//            System.out.println("Найдено");
//        else
//            System.out.println("Не найдено");
//    }

        String str3 = "I like coffee";
        Pattern pattern = Pattern.compile("I like coffee"); //создаём Pattern с помощью статического метода compile()
        Matcher matcher = pattern.matcher(str3); //вызываем метод и возвращаеем объект Matcher.
        boolean res4 = matcher.matches(); // matches() для поиска соответствий шаблону в тексте.
        System.out.println(res4);


        String str4 = "I like coffee! I like coffeecoffee! I like coffeecoffeecoffee!";
        Pattern pattern2 = Pattern.compile("coffee(\\w*)"); //создаём Pattern с помощью статического метода compile()
        Matcher matcher2 = pattern2.matcher(str4); //вызываем метод и возвращаеем объект Matcher.
        while (matcher2.find()){ //позволяет переходить к следующему совпадению
            System.out.println(matcher2.group()); //Каждое совпадение мы можем получить с помощью метода matcher.group().
        }

        //замена в строке на подстроки
        String myStr = str4.replaceAll("coffee(\\w*)", "Java");
        System.out.println(myStr);

        Pattern pattern3 = Pattern.compile("[!]"); //создаём Pattern с помощью статического метода compile()
        String[] array = pattern3.split(myStr);
        for (String words : array){
            System.out.println(words);
        }







        //Состоять из двух частей, разделённых символом “@”.

        //Левая часть должна состоять из английских букв или цифр,
        // может содержать точки и тире, притом после точки или
        // тире обязательно должна следовать как минимум одна буква.

        //Правая часть должна содержать хотя бы одну точку в конце,
        // после которой должны следовать от двух до четырёх букв.

        //Начинаться обе части должны с буквенных символов.

        //  Pattern pattern = Pattern.compile("[A-Za-z0-9_]{1,10}+@([A-Za-z0-9]{1,4})[\\.]{1}[a-z]{2,4}");

//        String input = "Hello Java! Hello JavaScript! JavaSE 8.";
//        Pattern pattern = Pattern.compile("Java(\\w*)");
//        Matcher matcher = pattern.matcher(input);
//        while(matcher.find()) // find() - ищет совпадения
//            System.out.println(matcher.group());// получить совподение
//    }
    }
}

