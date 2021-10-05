package Lab_4;

public class TestClass {

    public static void main(String[] args) {

        Book b1 = new Book(20);
        System.out.println("Цена книги: " + b1.getPrice());

        Table t1 = new Table(450);
        System.out.println("Цена стола: " + t1.getPrice());

        Car c1 = new Car(25000, "BMW");
        System.out.print("Цена машины марки " + c1.getBrand() + ": " + c1.getPrice());




    }

}
