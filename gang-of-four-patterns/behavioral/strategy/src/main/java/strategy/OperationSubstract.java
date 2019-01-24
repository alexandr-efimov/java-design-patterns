package strategy;

public class OperationSubstract implements OperationStrategy {
    @Override
    public int doOperation(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }
}
