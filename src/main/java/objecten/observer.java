package objecten;

import objecten.user;

public class observer {
    private static user ingelogt;
    static private boolean iemandIngelogt = false;

     public static void inlogen(user ingelogtuser) {
        ingelogt = ingelogtuser;
        iemandIngelogt = true;
    }

    public static void uitloggen(){
        ingelogt = null;
        iemandIngelogt = false;
    }

    static public boolean isIemandIngelogt() {
        return iemandIngelogt;
    }

    public static user getIngelogt() {
        return ingelogt;
    }
}
