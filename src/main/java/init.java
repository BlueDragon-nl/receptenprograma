import java.time.LocalDate;

import controller.observer;
import database.*;
import objecten.*;

public class init {
public static void  aanmaken(){
    createusers();

    setrecepten();

}
    private static void createusers(){
        System.out.println(userbase.create("joey", "joey", "Wingerden", "Welkom01", "joeywingerden@gmail.com", LocalDate.now()));
        userbase.create("Ildi", "Ildi", "Wingerden", "Welkom01", "Ildiwingerden@gmail.com", LocalDate.now());
        userbase.create("kees", "kees", "van der scholte", "Welkom01", "keesvanderscholte@gmail.com", LocalDate.now());
    }
    private static void setrecepten(){
        observer.setIngelogtuser(userbase.searchonUsername("joey"));
        receptbase.createRecept("kook de bloemkool en dan eensmakkelijk", "bloemkool", true);
        receptbase.getrecept("bloemkool").getIngredienten().add(new ingredient("bloemkool", 2., 2.10));

        receptbase.createRecept("laat het biefstuk bakken en gooi er wat kruiden er op", "biefstuk", false);
        receptbase.getrecept("biefstuk").getIngredienten().add(new ingredient("biefstuk", 1., 5.60));
        receptbase.getrecept("biefstuk").getIngredienten().add(new ingredient("kruiden", 5., 1.20));

        observer.setIngelogtuser(userbase.searchonUsername("kees"));
        receptbase.createRecept("piza bestel pitza van dominos", "pitza", false);
        receptbase.getrecept("pitza").getIngredienten().add(new ingredient("geld", 1., 10.5));

        observer.setIngelogtuser(userbase.searchonUsername("Ildi"));
        receptbase.createRecept("stap bak vega stukjes in een pan, gooi er groente tussen en wacht 5minuten dan nog eve wachten en dan kan je de saus er bij gooien en eetsmakkelijk", "vega met groenten", false);
        receptbase.getrecept("vega met groenten").getIngredienten().add(new ingredient("vega", 1., 3.50));
        receptbase.getrecept("vega met groenten").getIngredienten().add(new ingredient("groente", 2., 2.50));
        receptbase.getrecept("vega met groenten").getIngredienten().add(new ingredient("saus", 1., 0.50));

    }

}
