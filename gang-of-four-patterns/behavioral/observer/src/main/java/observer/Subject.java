package observer;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Collection;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subject {

    Collection<Observer> observers = new ArrayList<>();

    @Getter
    int state;

    public void withState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        observers.forEach(Observer::update);
    }
}
