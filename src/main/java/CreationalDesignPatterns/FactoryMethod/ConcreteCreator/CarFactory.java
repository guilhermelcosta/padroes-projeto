package CreationalDesignPatterns.FactoryMethod.ConcreteCreator;

import CreationalDesignPatterns.FactoryMethod.ConcreteProduct.Car;
import CreationalDesignPatterns.FactoryMethod.Creator.VehicleFactory;
import CreationalDesignPatterns.FactoryMethod.Product.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
