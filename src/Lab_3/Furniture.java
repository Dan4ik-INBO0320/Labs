package Lab_3;

public abstract class Furniture {

    private double width;
    private double heith;

    public Furniture(double wi, double he) {
        width = wi;
        heith = he;
    }

    public double getHeith() {
        return heith;
    }

    public double getWidth() {
        return width;
    }

    public void setHeith(double heith) {
        this.heith = heith;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract void displayInfo();

}
