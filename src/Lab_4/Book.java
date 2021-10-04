package Lab_4;

public class Book implements Priceable {

    private double price;

    public Book() {
    }

    public Book(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
