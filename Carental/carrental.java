package Carental;

import java.util.ArrayList;
import java.util.List;

public class carrental {
    List<Car> cars;

    public carrental() {
        this.cars = new ArrayList<>();
    }

    public void addCars(String carCompany, String carName, int carPrice) {
        cars.add(new Car(carCompany, carName, carPrice));
        System.out.println("Car added: " + carName + " Car company : " + carCompany + "car price : " + carPrice);
    }

    public void buyCar(String carName) {
        for (Car car : cars) {
            if (car.getCarName().equalsIgnoreCase(carName)) {
                car.issueCar();
                return;
            }
        }
        System.out.println("Car not found: " + carName);
    }

    public void sellCar(String carName) {
        for (Car car : cars) {
            if (car.getCarName().equalsIgnoreCase(carName)) {
                car.returnCar();
                return;
            }
        }
        System.out.println("Car not found: " + carName);
    }

    public void display() {
        System.out.println("\nCurrent Cars");
        for (Car car : cars) {
            car.display();
        }
    }

    public static void main(String[] args) {
        carrental lb1 = new carrental();
        lb1.addCars("BMW ", "X7", 500 );
        lb1.addCars("HONDA ", "Pilot", 350 );
        lb1.display();
        lb1.buyCar("PILOT");
        lb1.display();
        lb1.sellCar("Pilot");
        lb1.display();
    }
}


