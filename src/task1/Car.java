package task1;

public class Car implements Runnable{
    Seller seller;
    private final int MAX_AMOUNT_CARS = 10;

    public Car(Seller seller) {
        this.seller = seller;
    }

    public Car() {
    }

    @Override
    public void run() {
        for (int i = 0; i <= MAX_AMOUNT_CARS; i++) {
            try {
                seller.getCarToSeller();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
