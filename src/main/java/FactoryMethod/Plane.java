package FactoryMethod;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Plane flying...");
    }
}
