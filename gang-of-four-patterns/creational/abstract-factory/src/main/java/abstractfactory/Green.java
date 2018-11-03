package abstractfactory;

import lombok.extern.java.Log;

@Log
public class Green implements Color {

    private static final String COLOR_NAME = "green";

    public void fill() {
        log.info(String.join("-", "Fill color", Green.COLOR_NAME));
    }
}
