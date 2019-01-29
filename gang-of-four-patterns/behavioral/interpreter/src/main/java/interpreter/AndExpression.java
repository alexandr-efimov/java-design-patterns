package interpreter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class AndExpression implements Expression {

    Expression expression1;
    Expression expression2;

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context)
                && expression2.interpret(context);
    }
}
