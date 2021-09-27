package Lab_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите колличество элементов массива: ");
        int n = scan.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите значение " + i + "-ого элемента массива: ");
            arr[i] = scan.nextDouble();
        }

        scan.close();

        double sumFor = 0, sumWhile = 0, sumDoWhile = 0;

        for (int i = 0; i < n; i++) {
            sumFor += arr[i];
            if (i == n - 1) {
                System.out.println("Сумма чисел массива, подсчитанная в цикле for: " + sumFor);
            }
        }

        int k = n;

        while(k > 0) {
            sumWhile += arr[n - k];
            if (k == 1) {
                System.out.println("Сумма чисел массива, подсчитанная в цикле while: " + sumWhile);
            }
            k--;
        }

        k = n;

        do {
            sumDoWhile += arr[n - k];
            if (k == 1) {
                System.out.println("Сумма чисел массива, подсчитанная в цикле do while: " + sumDoWhile);
            }
            k--;
        } while (k > 0);

    }
}
