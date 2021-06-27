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
}
