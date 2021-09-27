package Lab_3;

public class Sofa extends Furniture {

    private String colour;

    public Sofa(double wi, double he, String c) {
        super(wi, he);
        colour = c;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public void displayInfo() {
        System.out.println("Диван       Высота: " + getHeith() + ", ширина: " + getWidth() + ", цвет: " + colour);
    }
}
