package Lab_4;

public class Car implements Priceable {

    private double price;
    private String brand;

    public Car() {
    }

    public Car(double price) {
        this.price = price;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return 25000;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
