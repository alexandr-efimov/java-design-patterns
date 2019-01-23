package visitor;

import lombok.extern.java.Log;

@Log
public class ComputerPartVisitorReviewer implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        log.info("Review Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        log.info("Review Monitor");
    }

    @Override
    public void visit(Computer computer) {
        log.info("Review Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        log.info("Review Mouse");
    }
}
