package objecten;

import java.time.LocalDate;
import java.util.ArrayList;

public class user {
    private String username;
    private String firstname;
    private String lastname;

    private String password;
    private String  Email;
    private LocalDate datum;

    private ArrayList<recept> yourRecept;


    public user(String username, String firstname, String lastname, String password, String email, LocalDate datum) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;

        Email = email;
        this.datum = datum;
        yourRecept = new ArrayList<recept>();
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Boolean login(String password) {
        return this.password.equals(password);
    }

    public ArrayList<recept> getYourRecept() {
        return yourRecept;
    }


}
