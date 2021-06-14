package guru.qa.service;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(StringMessages.FIRST_ARG_MESSAGE.getMessage());
        int first = reader.readFirstArg();
        writer.handleString(StringMessages.SECOND_ARG_MESSAGE.getMessage());
        int second = reader.readSecondArg();
        writer.handleString(StringMessages.OPERATOR_ARG_MESSAGE.getMessage());
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        return writer.handleString(StringMessages.SUCCESSES_MESSAGE.getMessage() + first + " " + po.getSymbol() + " " + second + " = " + sum);
    }
}
