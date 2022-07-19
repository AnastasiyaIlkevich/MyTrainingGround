package OvO.ClassOOP.HW.ClassCustomer2;

public class Customer {
    private String surname;
    private String name;
    private Address address;

    public Customer(String surname, String name, Address address) {
        this.surname = surname;
        this.name = name;
        this.address = address;
    }

    public void correlationOrderForCustomer(Order order) {

        boolean ifCorrelationStreet = this.address.getStreet().equals(order.getAddress().getStreet());
        boolean ifCorrelationHome = this.address.getNumberHome()==order.getAddress().getNumberHome();
        if (ifCorrelationStreet&&ifCorrelationHome) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
