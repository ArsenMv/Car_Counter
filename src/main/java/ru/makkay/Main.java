package ru.makkay;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarModel("BMW");
        Car car2 = new Car();
        car2.setCarModel("LADA");
        Car car3 = new Car();
        car3.setCarModel("Mercedes");

        System.out.println("Количество машин: " + Car.getObjectCount());
    }
}