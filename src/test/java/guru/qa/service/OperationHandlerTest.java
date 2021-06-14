package guru.qa.service;

import guru.qa.service.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationHandlerTest {

    private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        int sum = handler.invoke(3, 5);
        Assertions.assertEquals(8, sum);
    }

    @Test
    void multipleTest() {
        handler = new MultiplicationOperationHandler();
        Assertions.assertEquals(15, handler.invoke(3, 5));
    }

    @Test
    void subtractionTest() {
        handler = new SubstractionOperationHandler();
        Assertions.assertEquals(4, handler.invoke(10, 6));
    }

    @Test
    void divideTest() {
        handler = new DivideOperationHandler();
        Assertions.assertEquals(1, handler.invoke(10, 6));
    }

    @Test
    void exponentialTest() {
        handler = new ExponentiationOperationHandler();
        Assertions.assertEquals(1000000, handler.invoke(10, 6));
    }
}