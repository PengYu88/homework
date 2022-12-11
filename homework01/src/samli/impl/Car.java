package samli.impl;

import com.samli.abs.Transportation;
import com.samli.intf.Run;

public class Car extends Transportation implements Run {
    @Override
    public void execute() {
        System.out.println("A car runs on four wheels.");
    }
}

class testCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "car";
        System.out.println("My name is "+car.name);
        car.execute();
    }
}