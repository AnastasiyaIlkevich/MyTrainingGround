package OvO.ClassOOP.ClassCustomer2;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Address address = new Address("Pushkina", 126);

        Customer customer = new Customer("Pupkin", "Kolya", address);

        Scanner scanString = new Scanner(System.in);
        Scanner scanInteger = new Scanner(System.in);

        System.out.println("Enter orders weight");
        double weight = scanInteger.nextDouble();
        System.out.println("Enter street");
        String street = scanString.nextLine();
        System.out.println("Enter number home");
        int numHome = scanInteger.nextInt();
        System.out.println("Enter name");
        String name = scanString.nextLine();

        DeliveryAddress deliveryAddress = new DeliveryAddress(street, numHome);
        Order order = new Order(weight, name, deliveryAddress);
        customer.correlationOrderForCustomer(order);
    }
}
