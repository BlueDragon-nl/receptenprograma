import java.util.ArrayList;

public class Pretpark {

    private static double BASISPRIJS = 50.0;
    private static int VOLWASSEN_LEEFTIJD = 18;
    private static int KIND_LEEFTIJD = 3;
    private static int GROEPSOMVANG_MET_KORTING = 6;

    private ArrayList<Attractie> attracties;

    public static double getPrijs (int leeftijd, boolean jaarkaart, boolean begeleiding, int groepsomvang) {

        double prijs = BASISPRIJS;

        if (leeftijd >= VOLWASSEN_LEEFTIJD) {
            prijs = prijs * 0.8;
        }
        else if (leeftijd <= KIND_LEEFTIJD) {
            prijs = 0.0;
        }

        if (jaarkaart) {
            prijs = 0.0;
        }

        if (groepsomvang >= GROEPSOMVANG_MET_KORTING) {
            prijs = prijs * 0.8;
        }

        if (!begeleiding) {

            if (prijs == 0.0) {
                prijs = -1.0;
            }
            else {
                prijs = prijs * -1;
            }
        }

        return prijs;
    }
}
