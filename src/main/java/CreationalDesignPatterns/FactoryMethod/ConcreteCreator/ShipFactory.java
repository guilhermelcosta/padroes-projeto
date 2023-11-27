package CreationalDesignPatterns.FactoryMethod.ConcreteCreator;

import CreationalDesignPatterns.FactoryMethod.ConcreteProduct.Ship;
import CreationalDesignPatterns.FactoryMethod.Creator.VehicleFactory;
import CreationalDesignPatterns.FactoryMethod.Product.Vehicle;

public class ShipFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Ship();
    }
}
