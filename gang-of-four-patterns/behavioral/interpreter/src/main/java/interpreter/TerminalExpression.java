package interpreter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Getter
public class TerminalExpression implements Expression {

    String data;

    @Override
    public boolean interpret(@NonNull String context) {
        return context.toLowerCase().contains(data.toLowerCase());
    }
}
