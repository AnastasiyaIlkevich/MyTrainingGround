package OvO.Thread.Ship;

public enum Size {
    SMALL(10),
    AVERAGE(50),
    BIG(100);

    Size(int value){
        this.value = value;
    }
    private int value;

    public int getValue() {
        return value;
    }
}
