import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PretparkTest {

    @Test
    void getPrijs() {
        assertEquals (0.0, Pretpark.getPrijs (1, true, true, 2), 0.001);
        assertEquals (-1.0, Pretpark.getPrijs (1, false, false, 2), 0.001);
        assertEquals (-1.0, Pretpark.getPrijs (1, true, false, 6), 0.001);
        assertEquals (-1.0, Pretpark.getPrijs (7, true, false, 2), 0.001);
        assertEquals (40.0, Pretpark.getPrijs (7, false, true, 6), 0.001);
        assertEquals (-1.0, Pretpark.getPrijs (7, true, false, 2), 0.001);
        assertEquals (-1.0, Pretpark.getPrijs (21, true, false, 2), 0.001);
        assertEquals (32.0, Pretpark.getPrijs (21, false, true, 6), 0.001);
        assertEquals (-1.0, Pretpark.getPrijs (21, true, false, 2), 0.001);
    }
}