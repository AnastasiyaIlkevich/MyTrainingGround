package OvO.Generic;

public class MyGeneralClass <T> {

    private T myType;

    public MyGeneralClass(T myType) {
        this.myType = myType;
    }

    public Class<?> checkTheClass(){
        return this.myType.getClass();
    }
}

