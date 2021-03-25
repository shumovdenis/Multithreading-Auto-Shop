package task1;

public class Main {
    public static void main(String[] args) {

        Seller seller = new Seller();
        Customer customer = new Customer(seller);
        Car car = new Car(seller);

        new Thread(null, car, "car").start();
        new Thread(null, customer, "1").start();
        new Thread(null, customer, "2").start();
        new Thread(null, customer, "3").start();
        new Thread(null, customer, "4").start();
        new Thread(null, customer, "5").start();
        new Thread(null, customer, "6").start();
        new Thread(null, customer, "7").start();
        new Thread(null, customer, "8").start();
        new Thread(null, customer, "9").start();
        new Thread(null, customer, "10").start();

    }
}
