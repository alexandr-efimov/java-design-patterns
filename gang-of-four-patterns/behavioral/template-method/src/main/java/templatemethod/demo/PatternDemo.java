package templatemethod.demo;

import lombok.extern.java.Log;
import templatemethod.Cricket;
import templatemethod.Football;
import templatemethod.Game;

import java.util.List;

@Log
public class PatternDemo {

    public static void main(String[] args) {
        var games = List.of(new Cricket(), new Football());

        log.info("Games: " + games);
        games.forEach(Game::play);
    }
}
