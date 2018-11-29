package pl.b2b.alcohol;

public class Alcohol {

    private int quantity;
    private double price;
    private String name;

    public Alcohol(int quantity, double price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public Alcohol(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
