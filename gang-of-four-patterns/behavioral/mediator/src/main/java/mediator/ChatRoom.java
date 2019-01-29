package mediator;

import lombok.extern.java.Log;

import java.time.Instant;

@Log
public class ChatRoom {

    public static void showMessage(User user, String message) {
        log.info(Instant.now() + " - from: " + user.getName() + " - [" + message + "]");
    }
}
