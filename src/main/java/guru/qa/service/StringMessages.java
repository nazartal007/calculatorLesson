package guru.qa.service;

public enum StringMessages {
    FIRST_ARG_MESSAGE("Введите первое целое число: "),
    SECOND_ARG_MESSAGE("Введите второе целое число: "),
    OPERATOR_ARG_MESSAGE("Введите оператор (+,-, *, /, ^): "),
    SUCCESSES_MESSAGE("Результат: ");


    public String getMessage() {
        return message;
    }

    private final String message;

    StringMessages(String message) {
        this.message = message;
    }
}
