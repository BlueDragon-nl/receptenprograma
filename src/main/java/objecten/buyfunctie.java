package objecten;

public class buyfunctie {
    static private Double kortingbrekening(int persoonen, user user){
        Double korting = 0.0;
        if(10 <=  persoonen){
            korting += 5;
        }

        if(persoonen > 20){
            korting += 10;
        }
        if (observer.isIemandIngelogt()){
            korting += 2;
        }
        if (user.lastmoths()){
            korting += 4;
        }
        if (user.getRecept().size() > 5){
            korting += 1;
        }

        return  1 - (korting/100);
    }
    static public Double Priceberkening(int persoonen, user user, recept recept){
       return recept.getPrice() * persoonen * kortingbrekening(persoonen, user);
    }
}
