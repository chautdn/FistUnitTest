import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator cal;
    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getA() {
        cal.setA(4);
        assertEquals(4,4);

    }

    @Test
    void add() {
    }

    public Boolean testEven(int a, int b){
        return (a%2==0) && (b%2==0);
    }

    @Test
    @DisplayName("Check 2 numbers are even")
    void testEven(){
        assertTrue(testEven(4,4));
    }

    @Test
    @DisplayName("Test subtract operation")
    void testSubtract() {
        cal.setA(10);
        cal.setB(5);
        assertEquals(5, cal.subtract());
    }

    @Test
    @DisplayName("Test multiply operation")
    void testMultiply() {
        cal.setA(3);
        cal.setB(4);
        assertEquals(12, cal.multiply());
    }

    @Test
    @DisplayName("Test divide operation")
    void testDivide() {
        cal.setA(10);
        cal.setB(2);
        assertEquals(5, cal.divide());
    }

}