package objecten;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class user {
    private ArrayList<recept> recept;
    private LocalDateTime lastorder;

    public void setLastorder(LocalDateTime lastorder) {
        this.lastorder = lastorder;
    }

    public user(ArrayList<recept> recept, LocalDateTime lastorder) {
        this.recept = recept;
        this.lastorder = lastorder;
    }

    public user() {
    }

    public ArrayList<objecten.recept> getRecept() {
        return recept;
    }

    public Boolean lastmoths() {
        return lastorder.isAfter(LocalDateTime.now().plusMonths(1));
    }
}
