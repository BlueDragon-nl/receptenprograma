package controller;

import objecten.*;
public class observer {
    private static user ingelogtuser;
    private static recept Recept;

    public static user getIngelogtuser() {
        return ingelogtuser;
    }

    public static void setIngelogtuser(user ingelogtuser) {
        observer.ingelogtuser = ingelogtuser;
    }

    public static void setRecept(recept recept) {
        Recept = recept;
    }

    public static recept getRecept() {
        return Recept;
    }
}
