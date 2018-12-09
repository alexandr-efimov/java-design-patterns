package singleton.demo;

import lombok.extern.java.Log;
import singleton.Singleton;

@Log
public class PatternDemo {

    public static void main(String[] args) {
        Singleton singletonFirst = Singleton.getInstance();
        Singleton singletonSecond = Singleton.getInstance();

        log.info("Singletons instances are equals: " + singletonFirst.equals(singletonSecond));
    }
}
