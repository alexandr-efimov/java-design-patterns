package visitor;

import java.util.List;

public class Computer implements ComputerPart {

    private List<ComputerPart> computerParts;

    public Computer() {
        this.computerParts = List.of(new Mouse(), new Keyboard(), new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerParts.forEach(part -> part.accept(computerPartVisitor));

        computerPartVisitor.visit(this);
    }
}
