package Lab_3;

import java.util.Scanner;

public class FurnitureShopTest {

    public static void main(String[] args) {

        FurnitureShop shop1 = new FurnitureShop();

        Scanner scan = new Scanner(System.in);
        short k;

        while (true) {

            if (!shop1.isKey5()) {
                System.out.print("Товары закончились. Приходите завтра!");
                break;
            }

            shop1.priceList();

            System.out.print("\nВведите 1, если хотите сдалать покупку, или 0, если хотите выйти: ");
            k = scan.nextShort();

            if (k == 0) {
                System.out.println("Приходите ещё!");
                break;
            }

            else if (k == 1) shop1.buy();

            else System.out.println("Введено неверное значение.\n");

        }

    }
}
