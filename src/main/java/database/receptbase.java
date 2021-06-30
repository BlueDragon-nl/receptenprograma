package database;

import java.util.ArrayList;

import controller.observer;
import javafx.scene.control.Label;
import objecten.*;

public class receptbase {
    static private ArrayList<recept> kookboek = new ArrayList<recept>();

    public static void createRecept(String bereiding, String name, boolean aPublic){
        recept arecept = new recept(bereiding, name, aPublic);
        observer.getIngelogtuser().getYourRecept().add(arecept);
        if (aPublic){
            kookboek.add(arecept);
        }
    }
    public static recept getrecept(String name){
        for (recept aRecept: observer.getIngelogtuser().getYourRecept()){
            if (aRecept.getName().equals(name)){
                return aRecept;
            }
        }

        for (recept aRecept: kookboek){
            if (aRecept.getName().equals(name)){
                return aRecept;
            }
        }
        return null;
    }

    public static ArrayList<recept> getKookboek() {
        return kookboek;
    }



    public static void addKookboek(recept Recept){
        observer.getIngelogtuser().getYourRecept().add(Recept);
        if (Recept.isPublic()){
            kookboek.add(Recept);
        }
    }
}
