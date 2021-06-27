package java.objecten.receptclasses;

import java.ingredient;
import java.util.ArrayList;

public class variantAdapter extends recept {
    private Variant Variant;

    public variantAdapter(String name, Long id, Long idClasic_recept, ArrayList<ingredient> extra_ingredient) {
        super(id, name, receptlist.getingredienten(idClasic_recept));
        Variant = new Variant(idClasic_recept, extra_ingredient);
    }

    @Override
    public ArrayList<ingredient> getingredienten() {
        ArrayList<ingredient> A = new ArrayList<ingredient>();
        for (ingredient B: ingredienten){
            A.add(B);
        }
        for (ingredient B: Variant.getExtra_ingredient()){
            A.add(B);
        }
        return A;
    }

}