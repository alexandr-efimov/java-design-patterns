package iterator.demo;

import iterator.NameRepository;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {
        var nameRepository = new NameRepository();
        var iterator = nameRepository.getIterator();

        while (iterator.hasNext()) {
            log.info("Name: " + iterator.next());
        }
    }
}
