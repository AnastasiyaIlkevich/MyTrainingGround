package OvO.ClassOOP.HW.ClassCustomer;

public class Address {

    private String street;
    private int NumberHome;

    public Address(String street, int numberHome) {
        this.street = street;
        NumberHome = numberHome;
    }


    public void addressExist(String street, int numHome) {
        if (this.street.equals(street)&&this.NumberHome==numHome){
            System.out.println("Exist");
        } else {
            System.out.println("No exist");
        }
    }
}