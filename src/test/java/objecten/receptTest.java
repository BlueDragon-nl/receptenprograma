package objecten;

import objecten.recepts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class receptTest {

    @Test
    void MULTIPLE_CONDITION_createrecept(){
       int gStappen = 4;
       int gingrediënten = 6;

       int fStappen = 3;
       int Fingrediënten = 5;

        observer.inlogen(new user());
        Assertions.assertTrue(recepts.createRecept(newArraylist(fStappen), newArraylist(Fingrediënten)));
        Assertions.assertTrue(recepts.createRecept(newArraylist(fStappen), newArraylist(gingrediënten)));
        Assertions.assertTrue(recepts.createRecept(newArraylist(gStappen), newArraylist(Fingrediënten)));
        Assertions.assertTrue(recepts.createRecept(newArraylist(gStappen), newArraylist(gingrediënten)));

        observer.uitloggen();
        Assertions.assertFalse(recepts.createRecept(newArraylist(fStappen), newArraylist(Fingrediënten)));
        Assertions.assertFalse(recepts.createRecept(newArraylist(fStappen), newArraylist(gingrediënten)));
        Assertions.assertFalse(recepts.createRecept(newArraylist(gStappen), newArraylist(Fingrediënten)));
        Assertions.assertFalse(recepts.createRecept(newArraylist(gStappen), newArraylist(gingrediënten)));

    }

    private ArrayList<String> newArraylist(int size){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = -1; i < size; i++){
            arrayList.add(" ");
        }
        return arrayList;
    }



    @Test
    void testLabel(){
        int[] aint = new int[]{0, 1, 9, 10, 20, 24, 25, 30};

        int i = 0;
        Assertions.assertEquals(recepts.whichlabel(aint[i]), "geenlabel"); i++;
        Assertions.assertEquals(recepts.whichlabel(aint[i]), "goedkooplabel"); i++;
        Assertions.assertEquals(recepts.whichlabel(aint[i]), "goedkooplabel"); i++;

        Assertions.assertEquals(recepts.whichlabel(aint[i]), "normaalprijslabel"); i++;
        Assertions.assertEquals(recepts.whichlabel(aint[i]), "normaalprijslabel"); i++;
        Assertions.assertEquals(recepts.whichlabel(aint[i]), "normaalprijslabel"); i++;

        Assertions.assertEquals(recepts.whichlabel(aint[i]), "duurlabel"); i++;
        Assertions.assertEquals(recepts.whichlabel(aint[i]), "duurlabel");
    }
}