package templatemethod;

public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    @Override
    public String toString() {
        return "Game: " + this.getClass().getSimpleName();
    }
}
