package objecten;

import java.util.ArrayList;

public class recept {
    private String bereiding;
    private ArrayList<ingredient> ingredienten;
    private String name;

    private boolean Public;
    private ArrayList<user> readingWrites;

    public recept(String bereiding, String name, boolean aPublic) {
        this.bereiding = bereiding;
        this.ingredienten = new ArrayList<ingredient>();
        this.name = name;
        Public = aPublic;
    }

    public String getBereiding() {
        return bereiding;
    }

    public ArrayList<ingredient> getIngredienten() {
        return ingredienten;
    }

    public String getName() {
        return name;
    }

    public boolean isPublic() {
        return Public;
    }

    public ArrayList<user> getReadingWrites() {
        return readingWrites;
    }

    public double getPrice(){
        int price = 0;
        for (ingredient aingredient: ingredienten){
            price += aingredient.getPrice();
        }
        return price;
    }
}
