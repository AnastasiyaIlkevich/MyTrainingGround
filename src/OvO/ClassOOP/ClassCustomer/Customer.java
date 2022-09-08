package OvO.ClassOOP.ClassCustomer;

import java.util.Date;

public class Customer {
    private String surname;
    private String name;
    private Date birthday;
    private String phoneNumber;
    public Address address;

    public Customer(String surname, String name, Date birthday, String phoneNumber, Address address) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public boolean phoneNumberVerification(String phoneNumber){

        if (this.phoneNumber.equals(phoneNumber)){
            return true;
        } else {
            return false;
        }
    }
}
