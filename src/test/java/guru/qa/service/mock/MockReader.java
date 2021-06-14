package guru.qa.service.mock;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockReader implements Reader {
    int firstArg;
    int secondArg;
    Operation mathOperation;

    public MockReader(int firstArg, int secondArg, Operation mathOperation) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.mathOperation = mathOperation;
    }

    @Override
    public int readFirstArg() {
        return firstArg;
    }

    @Override
    public int readSecondArg() {
        return secondArg;
    }

    @Override
    public Operation readMathOperation() {
        return mathOperation;
    }
}
