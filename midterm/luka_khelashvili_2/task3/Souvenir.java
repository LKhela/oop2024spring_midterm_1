package midterm.luka_khelashvili_2.task3;


import java.util.ArrayList;
import java.util.List;

public class Souvenir {
    private String name;
    private String description;
    private double price;

    public Souvenir(String name, String description, double price) {
        this.name = name;
        this.description = description;
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
}
