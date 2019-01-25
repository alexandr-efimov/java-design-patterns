package state;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@ToString
public class Context {

    State state;

    public Context withState(State state) {
        this.state = state;
        return this;
    }
}
