package samli.impl;

import com.samli.abs.Animal;
import com.samli.intf.Run;

public class Dog extends Animal implements Run {

    @Override
    public void sound() {
        System.out.println("wang~ wang~ wang~ ");
    }

    @Override
    public void execute() {
        System.out.println("Dogs run on four legs.");
    }
}

class testDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.IsMammal = true;
        dog.name = "dog";
        dog.execute();
    }
}