package OvO.ClassOOP.HW.ClassCustomer2;

public class Order {

    private double weight;
    private String name;
    private DeliveryAddress address;

    public Order(double weight, String name, DeliveryAddress address) {
        this.weight = weight;
        this.name = name;
        this.address = address;
    }

    public DeliveryAddress getAddress() {
        return address;
    }
}
