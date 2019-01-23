package visitor;

public interface ComputerPartVisitor {

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Computer computer);

    void visit(Mouse mouse);
}
