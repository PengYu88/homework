package samli.impl;

import com.samli.abs.Transportation;
import com.samli.intf.Fly;

public class Plane extends Transportation implements Fly {

    @Override
    public void execute() {
        System.out.println("An airplane flies by the engine.");
    }
}

class testPlane {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.IsMotor = true;
        plane.execute();
    }
}
