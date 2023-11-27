package FactoryMethod;

public class Ship implements Vehicle {

    @Override
    public void move() {
        System.out.println("Ship sailing...");
    }
}
