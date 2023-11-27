package CreationalDesignPatterns.FactoryMethod.ConcreteProduct;

import CreationalDesignPatterns.FactoryMethod.Product.Vehicle;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Plane flying...");
    }
}
