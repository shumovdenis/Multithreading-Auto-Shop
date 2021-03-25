package task1;

import java.util.ArrayList;
import java.util.List;

public class Seller {
    static final  int TIME_GETTING_CAR = 1000;
    static final  int TIME_SHOPPING = 3000;
    private List<Car> carList = new ArrayList<>();

    public synchronized void sellCar() throws InterruptedException {
        try {
            while (carList.size() == 0) {
                Thread.sleep(1500);
                System.out.println("Машин нет");
                wait(3000);
            }
            System.out.println("Поздравляем с покупкой " + Thread.currentThread().getName());
            carList.remove(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void getCarToSeller(){
        try {
            System.out.println("Приемка нового автомобиля");
            Thread.sleep(TIME_GETTING_CAR);
            carList.add(new Car());
            System.out.println("Автомобиль принят");
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
