package OvO.ClassOOP.ClassCustomer2;

public class Address {

    private String street;
    private int NumberHome;

    public Address(String street, int numberHome) {
        this.street = street;
        NumberHome = numberHome;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberHome() {
        return NumberHome;
    }
}