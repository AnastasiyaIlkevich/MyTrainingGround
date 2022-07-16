package OvO.ClassOOP.HW.ClassCustomer;

import java.util.Date;

public class Customer {
    String surname;
    String name;
    Date birthday;
    String phoneNumber;

    public boolean phoneNumberVerification(String phoneNumber, Customer customer){

        if (customer.phoneNumber.equals(phoneNumber)){
            return true;
        } else {
            return false;
        }
    }
}
