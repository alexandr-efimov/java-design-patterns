package abstractfactory;

import lombok.extern.java.Log;

@Log
public class Red implements Color {

    private static final String COLOR_NAME = "red";

    public void fill() {
        log.info(String.join("-", "Fill color", Red.COLOR_NAME));
    }
}
