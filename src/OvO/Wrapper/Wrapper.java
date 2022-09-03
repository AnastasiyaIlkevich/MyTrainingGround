package OvO.Wrapper;

import java.util.Scanner;

public class Wrapper {

    //1. Используя консольный ввод, создайте несколько строк,
    // с помощью метода parseInt() приведите их к целочисленному
    // типу данных. Если строка не может быть приведена к целому
    // числу, выведите на экран “Not valid”.

    //2. Создайте по одному экземпляру примитивных типов
    // данных. Затем, используя метод valueOf(), из этих
    // экземпляров получите обёртки.

    public static void main(String[] args) {

        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string  -> ");
        String str = scanner.nextLine();
        System.out.println("Enter the second string  -> ");
        String str2 = scanner.nextLine();
        System.out.println("Enter the third string  -> ");
        String str3 = scanner.nextLine();

        parseString(checkInteger(str), str);
        parseString(checkInteger(str2), str2);
        parseString(checkInteger(str3), str3);

        //2
        PrimitiveDataTypes primitive = new PrimitiveDataTypes();
        Byte byteWrap = Byte.valueOf(primitive.aByte);
        Short shortWrap = Short.valueOf(primitive.aShort);
        Integer intWrap = Integer.valueOf(primitive.anInt);
        Long longWrap = Long.valueOf(primitive.aLong);
        Float floatWrap = Float.valueOf(primitive.aFloat);
        Double doubleWrap = Double.valueOf(primitive.aDouble);
        Boolean booleanWrap = Boolean.valueOf(primitive.aBoolean);
        Character charWrap = Character.valueOf(primitive.aChar);

    }

    public static boolean checkInteger(String str) {
        char[] arrayStr = str.toCharArray();
        boolean ifNumber = true;
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i] >= 58 || arrayStr[i] <= 47) {
                ifNumber = false;
                break;
            }
        }
        return ifNumber;
    }


    public static void parseString(boolean ifNumber, String str) {
        if (ifNumber) {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } else {
            System.out.println("Not valid");
        }
    }
}
