package Lab_4;

public class Table implements Priceable {

    private double price;

    public Table() {
    }

    public Table(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return 400;
    }

}
