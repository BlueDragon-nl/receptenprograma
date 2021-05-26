public class Mini {

    private String tekst;

    public Mini (String tekst) {
        this.tekst = tekst;
    }

    public double getPrijs () {

        int aantalKarakters = tekst.length ();

        if (aantalKarakters >= 100) {
            return aantalKarakters * 0.18;
        }
        else if (aantalKarakters >= 25) {
            return aantalKarakters * 0.20;
        }
        else if (aantalKarakters > 0) {
            return 5.0;
        }
        else {
            return 0.0;
        }
    }
}
