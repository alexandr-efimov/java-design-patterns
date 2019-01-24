package strategy;

public class OperationMultiply implements OperationStrategy {
    @Override
    public int doOperation(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }
}
