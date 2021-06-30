package objecten;

public class ingredient {
    private String name;
    private Double aantal;
    private Double price;

    public ingredient(String name, Double aantal, Double price) {
        this.name = name;
        this.aantal = aantal;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getAantal() {
        return aantal;
    }

    public Double getPrice() {
        return price;
    }
}
