package Lab_3;

public class SofaTest {

    public static void main(String[] args) {

        Sofa s1 = new Sofa(100, 30, "White");

        s1.displayInfo();

        System.out.println("Цвет: " + s1.getColour());
        s1.setColour("Red");
        System.out.println("Цвет: " + s1.getColour());

        s1.displayInfo();

    }

}
