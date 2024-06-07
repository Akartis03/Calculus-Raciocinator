package school.hei.calculusraciocinator.conjonctionDeCoordination;

import school.hei.calculusraciocinator.ExpressionLogique;

import java.util.Map;

public class Donc implements ExpressionLogique{
    private ExpressionLogique antecedent;
    private ExpressionLogique consequent;

    public Donc(ExpressionLogique antecedent, ExpressionLogique consequent) {
        this.antecedent = antecedent;
        this.consequent = consequent;
    }

    @Override
    public boolean evaluer(Map<String, Boolean> context) {
        return !antecedent.evaluer(context) || consequent.evaluer(context);
    }
}
