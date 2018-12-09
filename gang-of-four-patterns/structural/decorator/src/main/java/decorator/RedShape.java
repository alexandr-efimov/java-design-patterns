package decorator;

import lombok.extern.java.Log;

@Log
public class RedShape extends ShapeDecorator {

    public RedShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();

        drawBorder();
    }

    private void drawBorder() {
        log.info("Draw RED border");
    }
}
