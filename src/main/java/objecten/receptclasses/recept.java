package java.objecten.receptclasses;

import java.ingredient;
import java.util.ArrayList;

public abstract class recept {
    private Long id;
    private String name;
    protected ArrayList<ingredient> ingredienten;

    public recept(Long id, String name, ArrayList<ingredient> ingredienten) {
        this.id = id;
        this.name = name;
        this.ingredienten = ingredienten;
    }
    public abstract ArrayList<ingredient> getingredienten();

    public Long getId() {
        return id;
    }

}
