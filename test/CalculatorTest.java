import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(30, calc.add());
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calc = new Calculator();
        calc.setNumbers(20, 10);
        assertEquals(10, calc.subtract());
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(6, 3);
        assertEquals(18, calc.multiply());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calc = new Calculator();
        calc.setNumbers(8, 2);
        assertEquals(4, calc.divide());
    }
}