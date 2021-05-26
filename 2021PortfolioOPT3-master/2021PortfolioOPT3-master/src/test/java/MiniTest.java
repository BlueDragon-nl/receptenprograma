import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniTest {

    @Test
    void getPrijs() {
        String tekst0 = "";
        String tekst1 = "1";
        String tekst24 = "Test Test Test Test Test";
        String tekst25 = "Test Test Test Test Test ";
        String tekst26 = "Test Test Test Test Test T";
        String tekst99 = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";
        String tekst100 = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ";
        String tekst101 = "Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test T";

        assertEquals (0.0, new Mini (tekst0).getPrijs (), 0.001);
        assertEquals (5.0, new Mini (tekst1).getPrijs (), 0.001);
        assertEquals (5.0, new Mini (tekst24).getPrijs (), 0.001);
        assertEquals (5.0, new Mini (tekst25).getPrijs (), 0.001);
        assertEquals (5.2, new Mini (tekst26).getPrijs (), 0.001);
        assertEquals (19.8, new Mini (tekst99).getPrijs (), 0.001);
        assertEquals (18.0, new Mini (tekst100).getPrijs (), 0.001);
        assertEquals (18.18, new Mini (tekst101).getPrijs (), 0.001);
    }
}