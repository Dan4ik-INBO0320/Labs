package Lab_3;

public class DresserTest {

    public static void main(String[] args) {

        Dresser dres1 = new Dresser(50,60,5);

        System.out.println("Высота: " + dres1.getHeith());
        dres1.setHeith(55);
        System.out.println("Высота: " + dres1.getHeith());

        System.out.println("Отсеков: " + dres1.getCell());
        dres1.setCell(2);
        System.out.println("Отсеков: " + dres1.getCell());

        dres1.displayInfo();

    }

}
