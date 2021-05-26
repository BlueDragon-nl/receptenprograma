public class Attractie {

    private int minimaleLeeftijd;
    private int minimaleLengte;

    public Attractie (int minimaleLeeftijd, int minimaleLengte) {
        this.minimaleLeeftijd = minimaleLeeftijd;
        this.minimaleLengte = minimaleLengte;
    }

    public boolean weigeringBijToegangscontrole (int leeftijd, int lengte) {
        return (leeftijd < minimaleLeeftijd) || (lengte < minimaleLengte);
    }
}
