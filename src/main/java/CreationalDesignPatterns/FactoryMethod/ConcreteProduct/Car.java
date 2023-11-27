package CreationalDesignPatterns.FactoryMethod.ConcreteProduct;

import CreationalDesignPatterns.FactoryMethod.Product.Vehicle;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car moving...");
    }
}
