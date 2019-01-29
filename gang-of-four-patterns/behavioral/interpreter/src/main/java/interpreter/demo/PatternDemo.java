package interpreter.demo;

import interpreter.AndExpression;
import interpreter.Expression;
import interpreter.OrExpression;
import interpreter.TerminalExpression;
import lombok.extern.java.Log;

import static java.lang.String.format;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        var hermione = "Hermione";
        var alex = "alex";
        log.info(format("Is male: %s - %s", hermione, getMaleRuleExpression().interpret(hermione)));
        log.info(format("Is male: %s - %s", alex, getMaleRuleExpression().interpret(alex)));

        var theresaMay = "Theresa May";
        log.info(format("Is prime minister: %s - %s", theresaMay, getPrimeMinisterRuleExpression().interpret(theresaMay)));
        log.info(format("Is prime minister: %s - %s", alex, getPrimeMinisterRuleExpression().interpret(alex)));
    }

    private static Expression getMaleRuleExpression() {
        return new OrExpression(new TerminalExpression("Alex"), new TerminalExpression("Ronald"));
    }

    private static Expression getPrimeMinisterRuleExpression() {
        return new AndExpression(new TerminalExpression("Theresa"), new TerminalExpression("May"));
    }
}
