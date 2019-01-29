package proxy.demo;

import lombok.extern.java.Log;
import proxy.ProxyImage;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var image = new ProxyImage("image_name.png");

        image.display();

        log.info("Display 1 time more, without loading.");
        image.display();
    }
}
