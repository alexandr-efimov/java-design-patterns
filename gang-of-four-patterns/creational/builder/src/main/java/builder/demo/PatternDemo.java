package builder.demo;

import builder.User;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        User user = new User.Builder()
                .withEmail("email@gmail.com")
                .withFirstName("Alex")
                .withLastName("Trump")
                .build();

        log.info("User: " + user);
    }
}
