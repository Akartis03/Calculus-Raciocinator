package school.hei.calculusraciocinator;

import java.util.Map;

public class Mensonge implements ExpressionLogique{
    private String description;
    public Mensonge(String description) {
        this.description = description;
    }

    @Override
    public boolean evaluer(Map<String, Boolean> valeurDeVerite) {
        return false;
    }
}
