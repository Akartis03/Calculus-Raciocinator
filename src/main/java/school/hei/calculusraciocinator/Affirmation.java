package school.hei.calculusraciocinator;

import java.util.Map;

public class Affirmation implements ExpressionLogique{
    private String description;
    public Affirmation(String description) {
        this.description = description;
    }

    @Override
    public boolean evaluer(Map<String, Boolean> valeursDeVerite) {
        if (!valeursDeVerite.containsKey(description)) {
            throw new IllegalArgumentException("Affirmation non définie: " + description);
        }
        return valeursDeVerite.get(description);
    }
}
