package database;

import java.time.LocalDate;
import java.util.ArrayList;
import objecten.*;

public class userbase {
    static private ArrayList<user> userbase = new ArrayList<user>();

    static public boolean create(String username, String firstname, String lastname, String password, String email, LocalDate datum){
        if (check(username)){
            userbase.add(new user(username, firstname, lastname, password, email, datum));
            return true;
        }
        return false;
    }

    static public user searchonUsername(String username){
        for (user aUser: userbase){
            if (aUser.getUsername().equals(username)){
                return aUser;
            }
        }
        return null;
    }


    public static ArrayList<user> getUserbase() {
        return userbase;
    }
    static private boolean check(String username){
        for (user aUser: userbase){
            if (aUser.getUsername().equals(username)){
                return false;
            }
        }
        return true;
    }
}
