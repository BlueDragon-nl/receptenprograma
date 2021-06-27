package objecten;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class userTest {

    @Test
    void testbuy(){
        new user().setLastorder(LocalDateTime.now().minusMonths(1));
        Assertions.assertEquals();
    }

}