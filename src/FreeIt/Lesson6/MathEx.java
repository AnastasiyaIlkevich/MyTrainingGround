package FreeIt.Lesson6;

public class MathEx {
    //проработать все методы данного класса
    public static void main(String[] args) {
        //abs(double value): возвращает абсолютное значение для аргумента value
        System.out.println("модуль числа " + Math.abs(-36)); //модуль

        //acos(double value): возвращает арккосинус value. Параметр value должен иметь значение от -1 до 1
        //asin(double value): возвращает арксинус value. Параметр value должен иметь значение от -1 до 1
        //atan(double value): возвращает арктангенс value
        //cos(double d): возвращает косинус угла d
        //cosh(double d): возвращает гиперболический косинус угла d
        System.out.println("арккосинус " + Math.acos(Math.random()));

        //cbrt(double value): возвращает кубический корень числа value
        System.out.println("кубический корень " + Math.cbrt(27));

        //ceil(double value): возвращает наименьшее целое число с плавающей точкой, которое не меньше value
        System.out.println("округление в большую сторону " + Math.ceil(27.36));

        //exp(double d): возвращает основание натурального логарифма, возведенное в степень d

        //floor(double d): возвращает наибольшее целое число, которое не больше d
        System.out.println("округление в меньшую сторону " + Math.floor(27.36));

        //floorDiv(int a, int b): возвращает целочисленный результат деления a на b
        System.out.println("возвращает целочисленный результат деления " + Math.floorDiv(1, 2)); // 0
        System.out.println("возвращает целочисленный результат деления " + Math.floorDiv(7, 2)); // 3
        System.out.println("возвращает целочисленный результат деления " + Math.floorDiv(9, 2)); // 4

        //log(double a): возвращает натуральный логарифм числа a
        //log1p(double d): возвращает натуральный логарифм числа (d + 1)
        //log10(double d): возвращает десятичный логарифм числа d
        //max(double a, double b): возвращает максимальное число из a и b
        System.out.println("возвращает макс число из сравнения " + Math.max(7, 2));

        //min(double a, double b): возвращает минимальное число из a и b
        System.out.println("возвращает мин число из сравнения " + Math.min(7, 2));

        //pow(double a, double b): возвращает число a, возведенное в степень b
        System.out.println("возвращает мин число из сравнения " + Math.pow(7, 2));

        //random(): возвращает случайное число от 0.0 до 1.0
        //random()*(max-min)+max): или можно лююое число в диапазоне
        System.out.println("возвращает ранд от 0.0 до 0.99999999 " + Math.random());
        System.out.println("рандом числа в диапазоне " + (Math.random()*(100+100) - 100));

        //rint(double value): возвращает число double, которое представляет ближайшее к числу value целое число
        System.out.println("возвращает число double (округление) " + Math.rint(2.5)); // 2.0
        System.out.println("возвращает число double (округление) " + Math.rint(2.5001)); // 3.0

        //round(double d): возвращает число d, округленное до ближайшего целого числа
        System.out.println("математическое округление " + Math.round(2.5)); // 3.0

//        boolean a = true;
//
//        boolean b = false;
//
//        System.out.println(a&&b||b);
        int a = 15;

        int b = 10;

        System.out.println((a>b)||(a>b));
        System.out.println("математическое округление " + Math.sqrt(2.5)); // 3.0
    }


}
