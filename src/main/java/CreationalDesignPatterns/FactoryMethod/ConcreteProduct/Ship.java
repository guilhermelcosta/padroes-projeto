package CreationalDesignPatterns.FactoryMethod.ConcreteProduct;

import CreationalDesignPatterns.FactoryMethod.Product.Vehicle;

public class Ship implements Vehicle {

    @Override
    public void move() {
        System.out.println("Ship sailing...");
    }
}
