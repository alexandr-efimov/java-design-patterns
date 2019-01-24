package strategy.demo;

import lombok.extern.java.Log;
import strategy.Context;
import strategy.OperationAdd;
import strategy.OperationMultiply;
import strategy.OperationSubstract;

@Log
public class PatternDemo {

    public static void main(String[] args) {
        var context = new Context(new OperationAdd());
        log.info("3 + 12 = " + context.executeStrategy(3, 12));

        context = new Context(new OperationSubstract());
        log.info("3 - 12 = " + context.executeStrategy(3, 12));

        context = new Context(new OperationMultiply());
        log.info("3 * 12 = " + context.executeStrategy(3, 12));

        context = new Context((u, v) -> u / v);
        log.info("12 / 3 = " + context.executeStrategy(12, 3));
    }
}
