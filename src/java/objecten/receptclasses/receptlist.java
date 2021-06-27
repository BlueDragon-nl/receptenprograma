package java.objecten.receptclasses;

import java.ingredient;
import java.util.ArrayList;

public class receptlist {
    static private ArrayList<recept> lijst;

    static public void addrecept(recept recept){
        lijst.add(recept);
    }
    static public ArrayList<ingredient> getingredienten(Long id) {
        return findrecept(id).getingredienten();
    }
    static private recept findrecept(long id){
        for (recept recept: lijst){
            if (recept.getId().equals(id)){
                return recept;
            }
        }
        return null;
    }
}
