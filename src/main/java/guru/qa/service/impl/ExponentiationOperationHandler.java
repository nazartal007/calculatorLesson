package guru.qa.service.impl;

import guru.qa.service.OperationHandler;

public class ExponentiationOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        return (int) Math.pow(first, second);
    }
}
