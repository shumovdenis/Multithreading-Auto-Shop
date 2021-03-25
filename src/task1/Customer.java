package task1;

public class Customer extends Thread{
    Seller seller;

    public Customer(Seller seller) {
        this.seller = seller;
    }


    @Override
    public void run() {
            try {
                Thread.sleep(Seller.TIME_SHOPPING);
                seller.sellCar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
