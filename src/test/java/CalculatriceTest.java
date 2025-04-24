import org.example.Calculatrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    void addTest(){
        assertEquals(5, calc.add(3, 2));
    }

    @Test
    void substractionTest(){
        assertEquals(5, calc.substraction(10, 5));
    }

    @Test
    void multiplicationTest(){
        assertEquals(45, calc.multiplication(15, 3));
    }

    @Test
    void divisionTest(){
        assertEquals(10, calc.division(100, 10));
    }

    @Test
    void testAdditionWithNaN() {
        assertTrue(Double.isNaN(calc.add(Double.NaN, 5)));
    }

    @Test
    void testDivisionWithInfinit() {
        assertThrows(ArithmeticException.class, () -> calc.division(10.0, 0.0));
    }


}
