package OvO.ClassOOP.HW.ClassCustomer;

import java.util.Date;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Address address = new Address("Pushkina", 126);

        Customer customer = new Customer("Pupkin", "Kolya", new Date(1991, 3, 26), "375-29-254-56-56", address);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter street");
        String street = scanner.nextLine();
        System.out.println("Enter number home");
        int numHome = scanner.nextInt();
        address.addressExist(street, numHome);

    }
}
