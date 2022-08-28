package OvO.String.HW;

public class Format {
    public static void main(String[] args) {
        User user = new User("Александр", 26, "+375(29)222 55 88");
        user.info();
    }
}

class User {
    private String name;
    private int age;
    private String numberPhone;

    public User(String name, int age, String numberPhone) {
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
    }

    public void info() {
        System.out.printf("Пользователя зовут: %s.%nЕго возраст - %d.%nТелефон %s", this.name, this.age, this.numberPhone);
    }
}
