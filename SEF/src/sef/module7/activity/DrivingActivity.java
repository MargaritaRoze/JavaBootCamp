package sef.module7.activity;

import com.sun.jdi.connect.Connector;

import java.awt.*;

public class DrivingActivity {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Driver driver = new Driver("Margarita");
        driver.setDriversMoving(car);
        driver.driverStartsDriving();

        driver.setDriversMoving(motorcycle);
        driver.driverStartsDriving();
    }
}
