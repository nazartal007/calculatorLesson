package guru.qa.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationTest {
    @Test
    public void ExceptionTest() {
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> {
            Operation.lookup('&');
        });
        assertEquals(thrown.getMessage(), "Cant find operation by given argument: &");
    }

    @Test
    public void ExponentialReturnTest() {
        assertEquals(Operation.lookup('^'), Operation.EXPONENTIAL);
    }

}
