package school.hei.calculusraciocinator.conjonctionDeCoordination;

import school.hei.calculusraciocinator.ExpressionLogique;
import java.util.Map;

public class Et implements ExpressionLogique{
    private ExpressionLogique exprGauche;
    private ExpressionLogique exprDroite;

    public Et(ExpressionLogique exprGauche, ExpressionLogique exprDroite) {
        this.exprGauche = exprGauche;
        this.exprDroite = exprDroite;
    }

    @Override
    public boolean evaluer(Map<String, Boolean> context) {
        return exprGauche.evaluer(context) && exprDroite.evaluer(context);
    }
}
