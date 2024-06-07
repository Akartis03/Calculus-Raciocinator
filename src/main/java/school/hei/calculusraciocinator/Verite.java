package school.hei.calculusraciocinator;

import java.util.Map;

public class Verite implements ExpressionLogique{
    private String description;
    public Verite(String description) {
        this.description = description;
    }

    @Override
    public boolean evaluer(Map<String, Boolean> valeurDeVerite) {
        return true;
    }
}
