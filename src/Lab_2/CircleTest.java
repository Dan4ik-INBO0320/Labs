package Lab_2;


public class CircleTest {
    public static void main(String[] args) {

        Circle circ = new Circle(10, "Yellow");

        System.out.print("Радиус окружности: " + circ.getRadius() + "\n");
        System.out.print("Длина окружности: " + circ.getLength() + "\n");

        circ.setRadius(20);
        System.out.print("Длина окружности: " + circ.getLength() + "\n");

        circ.setLength(50);
        System.out.print("Радиус окружности: " + circ.getRadius() + "\n");

        System.out.println(circ.toString());

    }
}
