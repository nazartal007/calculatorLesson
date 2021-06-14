package guru.qa.service;

import guru.qa.service.impl.ConsoleWriter;
import guru.qa.service.impl.ReturnStringWriter;
import guru.qa.service.mock.MockMultiplicationReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorTest() {
        calculator = new Calculator(new MockMultiplicationReader(), new ReturnStringWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void calculatorWitOutputConsoleTest() {
        calculator = new Calculator(new MockMultiplicationReader(), new ConsoleWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("", result);
    }
}