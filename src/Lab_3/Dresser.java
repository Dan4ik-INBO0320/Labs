package Lab_3;

public class Dresser extends Furniture {

    private int cell;

    public int getCell() {
        return this.cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public Dresser(double wi, double he, int c) {
        super(wi, he);
        cell = c;
    }

    @Override
    public void displayInfo() {
        System.out.println("Шкаф        Высота: " + getHeith() + ", ширина: " + getWidth() + ", отсеков: " + getCell());
    }
}
