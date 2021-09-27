package Lab_3;

import java.util.Scanner;

public class FurnitureShop {

    private int key;
    private boolean k1, k2, k3, k4, key5;

    Sofa[] sofas = new Sofa[2];

    Dresser[] dressers = new Dresser[2];

    public void priceList() {
        if (k1 == true || k2 == true || k3 == true || k4 == true) {
            key5 = true;
            System.out.println("В нашем магазине есть: ");
            if (k1 == true) {
                System.out.print("1.");
                sofas[0].displayInfo();
            }
            if (k2 == true) {
                System.out.print("2.");
                sofas[1].displayInfo();
            }
            if (k3 == true) {
                System.out.print("3.");
                dressers[0].displayInfo();
            }
            if (k4 == true) {
                System.out.print("4.");
                dressers[1].displayInfo();
            }
        }
    }

    public void buy() {

        System.out.print("\nВведите номер мебели, которую хотите купить: ");

        vvodKey();

        if (key == 1 && !k1 || key == 2 && !k2 || key == 3 && !k3 || key == 4 && !k4) key = -1;

        switch (key) {
            case 1:
                System.out.print("Вы приобрели синий диван с размерами 45 на 70.\n\n");
                setK1(false);
                break;
            case 2:
                System.out.print("Вы приобрели желтый диван с размерами 20 на 60.\n\n");
                setK2(false);
                break;
            case 3:
                System.out.print("Вы приобрели шкаф с 6-ю ящиками, с размерами 80 на 70.\n\n");
                setK3(false);
                break;
            case 4:
                System.out.print("Вы приобрели шкаф с 10-ю ящиками, с размерами 77 на 120.\n\n");
                setK4(false);
                break;
            case -1:
                System.out.println("Товара нет в наличии.");
        }

        if (!k1 && !k2 && !k3 && !k4) key5 = false;

    }

    public FurnitureShop() {

        sofas[0] = new Sofa(45.0, 75.0, "Blue");
        sofas[1] = new Sofa(20.0, 60.0, "Yellow");

        dressers[0] = new Dresser(80,70, 6);
        dressers[1] = new Dresser(77,120, 10);

        k1 = true;
        k2 = true;
        k3 = true;
        k4 = true;
        key5 = true;

    }

    public void vvodKey() {

        Scanner scan = new Scanner(System.in);
        key = scan.nextInt();

    }

    public void setK1(boolean x) {
        k1 = x;
    }

    public void setK2(boolean x) {
        k2 = x;
    }

    public void setK3(boolean x) {
        k3 = x;
    }

    public void setK4(boolean x) {
        k4 = x;
    }

    public boolean isKey5() {
        return key5;
    }
}