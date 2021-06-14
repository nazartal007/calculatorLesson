package guru.qa;

import guru.qa.service.Calculator;
import guru.qa.service.impl.ConsoleReader;
import guru.qa.service.impl.ConsoleWriter;

public class Application {

    public static void main(String[] args) {
        new Calculator(new ConsoleReader(), new ConsoleWriter()).start();

    }
}
