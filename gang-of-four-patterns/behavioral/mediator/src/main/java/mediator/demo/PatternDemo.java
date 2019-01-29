package mediator.demo;

import lombok.extern.java.Log;
import mediator.User;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var alex = new User("Alex");
        var ron = new User("Ronald");


        alex.sendMessage("I am going to learn Scala language");
        ron.sendMessage("Lol, why do you need that? Go with Kotlin better!");
    }
}
