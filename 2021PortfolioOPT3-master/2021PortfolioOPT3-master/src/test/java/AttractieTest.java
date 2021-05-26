import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttractieTest {

    @Test
    void weigeringBijToegangscontrole() {
        Attractie attractie = new Attractie(12, 130);
        assertFalse(attractie.weigeringBijToegangscontrole(18, 180));
        assertTrue(attractie.weigeringBijToegangscontrole(8, 130));
        assertTrue(attractie.weigeringBijToegangscontrole(18, 120));
    }
}