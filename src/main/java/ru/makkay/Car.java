package ru.makkay;

public class Car {
    private static int objectCount = 0;
    private String carModel;

    public Car() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public void setCarModel(String model) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }
}
