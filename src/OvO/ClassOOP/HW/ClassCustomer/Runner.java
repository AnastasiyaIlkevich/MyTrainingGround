package OvO.ClassOOP.HW.ClassCustomer;

import java.util.Date;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.name = "Anastasiya";
        customer.surname = "Ilkevich";
        customer.birthday = new Date(1991,3,26);
        customer.phoneNumber = "375-29-278-31-08";

        Scanner scanner = new Scanner(System.in);

        System.out.println(customer.phoneNumberVerification(scanner.nextLine(), customer));

    }
}
