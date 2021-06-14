package guru.qa.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessagesTest {

    @Test
    public void messageFirstArgTest() {
        Assertions.assertEquals("Введите первое целое число: ", StringMessages.FIRST_ARG_MESSAGE.getMessage());
    }

    @Test
    public void messageSecondArgTest() {
        Assertions.assertEquals("Введите второе целое число: ", StringMessages.SECOND_ARG_MESSAGE.getMessage());
    }

    @Test
    public void messageOperatorArgTest() {
        Assertions.assertEquals("Введите оператор (+,-, *, /, ^): ", StringMessages.OPERATOR_ARG_MESSAGE.getMessage());
    }

    @Test
    public void messageSuccessTest() {
        Assertions.assertEquals("Результат: ", StringMessages.SUCCESSES_MESSAGE.getMessage());
    }
}
