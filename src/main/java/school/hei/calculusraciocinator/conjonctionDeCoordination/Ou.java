package school.hei.calculusraciocinator.conjonctionDeCoordination;

import school.hei.calculusraciocinator.ExpressionLogique;

import java.util.Map;

public class Ou implements ExpressionLogique{
    private ExpressionLogique gauche;
    private ExpressionLogique droite;

    public Ou(ExpressionLogique gauche, ExpressionLogique droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    @Override
    public boolean evaluer(Map<String, Boolean> context) {
        return gauche.evaluer(context) || droite.evaluer(context);
    }
}
