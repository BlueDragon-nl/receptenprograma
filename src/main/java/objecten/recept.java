package objecten;


import java.util.ArrayList;

public class recept {

    public ArrayList<String> stappen;

    public ArrayList<String> ingrediënten;

    public recept(ArrayList<String> stappen, ArrayList<String> ingredienten) {
        this.stappen = stappen;
        this.ingrediënten = ingredienten;

    }

}
 class recepts{
    static ArrayList<recept> kookboek = new ArrayList<>();

    static public boolean createRecept(ArrayList<String> stappen, ArrayList<String> ingrediënten){
        //hier word gekken of er iemand is ingelogt
        boolean A = observer.isIemandIngelogt();

        System.out.println(A);

        // hier word gekken of er meer dan 5 ingrediënten zijn
        boolean B = ingrediënten.size() > 5;

        System.out.println(B);

        //hier word gekken of er genoeg stappen er zijn
        boolean C = stappen.size() > 3;

        System.out.println(C);

        if (A && (B || C)){
            kookboek.add(new recept(stappen, ingrediënten));
            return true;
        }
        else {
            return false;
        }
    }

    public static String whichlabel(int price){
        String label = "geenlabel";
        if (0 < price){
            label = "goedkooplabel";
        }
        if (10 <= price){
            label = "normaalprijslabel";
        }
        if (price >= 25){
            label = "duurlabel";
        }
        return label;
    }

}