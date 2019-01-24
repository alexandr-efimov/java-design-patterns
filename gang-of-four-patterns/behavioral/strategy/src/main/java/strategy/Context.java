package strategy;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Context {

    OperationStrategy operationStrategy;

    public int executeStrategy(int firstOperand, int secondOperand) {
        return operationStrategy.doOperation(firstOperand, secondOperand);
    }
}
