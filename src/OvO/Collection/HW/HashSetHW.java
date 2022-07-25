package OvO.Collection.HW;

import java.util.HashSet;

public class HashSetHW {
    public static void main(String[] args) {

        HashSet<Product> products = new HashSet<>();
        products.add(new Product(560, "watch"));
        products.add(new Product(2, "pen"));
        products.add(new Product(360, "table"));
        products.add(new Product(560, "table"));
        products.add(new Product(560, "table"));

        for (Product p : products) {
            System.out.println(p);
        }
        //Порядок ввода не сохраняется.
        //в коллекции есть одинаковые объекты, но с разными hashCode(здесь ключом является ссылка на объект).
        // Поэтому выводит все 5 объектов.
        // для вывода без повторов. можно сделать так.
        HashSet<Product> products2 = new HashSet<>();
        Product product = new Product(560, "watch");
        Product product2 = new Product(2, "pen");
        Product product3 = new Product(560, "watch");
        Product product4 = new Product(560, "table");
        Product product5 = product4;
        products2.add(product);
        products2.add(product2);
        products2.add(product3);
        products2.add(product4);
        products2.add(product5);
        System.out.println();
        for (Product p : products2) {
            System.out.println(p);
        }
        //так как ссылки одинаковые, то объекты и hashCode равны
    }
}


class Product {
    String name;
    int price;

    public Product(int price, String name) {
        this.name = name;
        this.price = price;
    }
}