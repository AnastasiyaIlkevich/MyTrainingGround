package OvO.JUnit;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    private Calculator calculator;
    @BeforeAll
    public static void beforeClass(){
        System.out.println("Start class test");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("Finish class test");
    }

    @BeforeEach
    public void initTest(){
        calculator = new Calculator();
    }
    @AfterEach
    public void offTest(){
        calculator = null;
    }

    @Test
    void getSum() {
        Assertions.assertEquals(47, calculator.getSum(2,45));
    }

    @Test
    void getDel() {
        Assertions.assertEquals(12, calculator.getDel(24,2));
    }

    @Test
    void getMnog() {
        Assertions.assertEquals(36, calculator.getMnog(2,18));
    }

    @Ignore("Ignored")
    @Test
    public void ignoreTest(){
        System.out.println("This Test ignored");
    }
}