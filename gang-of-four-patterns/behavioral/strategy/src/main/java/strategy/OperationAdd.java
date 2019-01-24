package strategy;

public class OperationAdd implements OperationStrategy {
    @Override
    public int doOperation(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }
}
