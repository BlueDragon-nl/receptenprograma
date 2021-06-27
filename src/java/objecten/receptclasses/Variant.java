package java.objecten.receptclasses;

import java.ingredient;
import java.util.ArrayList;

public class Variant {
    private ArrayList<ingredient> extra_ingredient;
    private long idClasic_recept;

    public Variant(long idClasic_recept, ArrayList<ingredient> extra_ingredient) {
        this.extra_ingredient = extra_ingredient;
        this.idClasic_recept = idClasic_recept;
    }

    public ArrayList<ingredient> getExtra_ingredient() {
        return extra_ingredient;
    }
}
