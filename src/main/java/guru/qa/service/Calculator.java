package guru.qa.service;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString("Please provide first argument");
        writer.handleString("Введите два числа: ");
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString("Введите оператор (+, *, /, ^): ");
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        writer.handleString("Результат");
        return writer.handleString(first + " " + po.getSymbol() + " " + second + " = " + sum);
    }
}
