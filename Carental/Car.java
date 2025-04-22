package Carental;

public class Car {
    private String carCompany;
    private String carName;
    private int carPrice;
    private boolean isAvailable;

    public Car(String carCompany, String carName, int carPrice){
        this.carCompany = carCompany;
        this.carName = carName;
        this.carPrice = carPrice;
        this.isAvailable = false;
    }

    public void issueCar(){
        if (!isAvailable) {
            isAvailable = true;

            System.out.println("Successfully Bought: " + carName + "For: " + carPrice);
        }
        else
            System.out.println(carName + " is already borrowed");
    }

    public  void returnCar(){
        if (isAvailable){
            isAvailable = false;
            System.out.println("Successfully Sold: " + carName);
        }
        else{
            System.out.println( carName + " was never bought");
        }
    }

    public void display(){
        String status = isAvailable ? "Rented" : "Available";
        System.out.println("Car Name: " + carName + " Company: " + carCompany + " Availability " + status + " Car Price: " + carPrice);
    }


    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



}
