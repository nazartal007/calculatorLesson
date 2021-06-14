package guru.qa.service;

import guru.qa.service.impl.ReturnStringWriter;
import guru.qa.service.mock.MockReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorSumTest() {
        calculator = new Calculator(new MockReader(3, 5, Operation.SUM), new ReturnStringWriter());
        String result = calculator.start();
        Assertions.assertEquals("Результат: 3 + 5 = 8", result);
    }

    @Test
    void calculatorSubtractionsTest() {
        calculator = new Calculator(new MockReader(3, 5, Operation.SUBTRACTION), new ReturnStringWriter());
        String result = calculator.start();
        Assertions.assertEquals("Результат: 3 - 5 = -2", result);
    }

    @Test
    void calculatorMultiplicationTest() {
        calculator = new Calculator(new MockReader(3, 5, Operation.MULTIPLICATION), new ReturnStringWriter());
        String result = calculator.start();
        Assertions.assertEquals("Результат: 3 * 5 = 15", result);
    }

    @Test
    void calculatorDivideTest() {
        calculator = new Calculator(new MockReader(3, 5, Operation.DIVIDE), new ReturnStringWriter());
        String result = calculator.start();
        Assertions.assertEquals("Результат: 3 / 5 = 0", result);
    }

    @Test
    void calculatorExponentialTest() {
        calculator = new Calculator(new MockReader(3, 5, Operation.EXPONENTIAL), new ReturnStringWriter());
        String result = calculator.start();
        Assertions.assertEquals("Результат: 3 ^ 5 = 243", result);
    }
}