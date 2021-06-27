package objecten;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class userTest {

    @Test
    void testbuy(){
        new user().setLastorder(LocalDateTime.now().minusMonths(1));
        int[] persoonen = new int[]{1,11,21};
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.now().minusMonths(1);

        user[] user = new user[]{
                new user(makeArralist(6), localDateTime2),
                new user(makeArralist(0), localDateTime),

                new user(makeArralist(6), localDateTime),
                new user(makeArralist(0), localDateTime2),

                new user(makeArralist(6), localDateTime),
                new user(makeArralist(0), localDateTime2),
        };


        recept pitza = new recept(10.00);
        int i = 0;
        observer.inlogen(new user());

        Assertions.assertEquals(buyfunctie.Priceberkening(persoonen[0], user[i], pitza), 9.7); i++; observer.uitloggen();
        Assertions.assertEquals(buyfunctie.Priceberkening(persoonen[0], user[i], pitza), 10.0); i++;



        Assertions.assertEquals(buyfunctie.Priceberkening(persoonen[0], user[i], pitza), 9.9); i++; observer.inlogen(new user());
        Assertions.assertEquals(buyfunctie.Priceberkening(persoonen[0], user[i], pitza), 9.8); i++;



        Assertions.assertEquals(buyfunctie.Priceberkening(persoonen[0], user[i], pitza), 9.7); i++; observer.uitloggen();
        Assertions.assertEquals(buyfunctie.Priceberkening(persoonen[0], user[i], pitza), 10.0);
    }
     private ArrayList<recept> makeArralist(int aantal){
        ArrayList<recept> A = new ArrayList<recept>();
        for (int i = 0; i < aantal; i++){
            A.add( new recept());
        }
        return A;
    }
}