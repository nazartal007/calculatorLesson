package guru.qa.service;

import guru.qa.service.impl.ConsoleWriter;
import guru.qa.service.impl.ReturnStringWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WriterTest {

    private Writer writer;

    @Test
    public void returnStringTest() {
        writer = new ReturnStringWriter();
        Assertions.assertEquals("Привет", writer.handleString("Привет"));
    }

    @Test
    public void consoleWriterTest() {
        writer = new ConsoleWriter();
        Assertions.assertEquals("", writer.handleString("Привет"));
    }
}
