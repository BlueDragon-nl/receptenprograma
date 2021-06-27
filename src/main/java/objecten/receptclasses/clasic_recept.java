package java.objecten.receptclasses;

import java.ingredient;
import java.util.ArrayList;

public class clasic_recept extends recept {

    public clasic_recept(Long id, String name, ArrayList<ingredient> ingredienten) {
        super(id, name, ingredienten);
    }

    @Override
    public ArrayList<ingredient> getingredienten() {
        return ingredienten;
    }

}
