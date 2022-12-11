package samli.impl;

import com.samli.abs.Animal;
import com.samli.intf.Fly;

public class Bird extends Animal implements Fly {

    @Override
    public void sound() {
        System.out.println("zhi~ zhi~ zhi~ ");
    }

    @Override
    public void execute() {
        System.out.println("Birds fly by flapping their wings.");
    }
}

class testBird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.name = "bird";
        bird.IsMammal = false;
        bird.sound();
        bird.execute();
    }
}